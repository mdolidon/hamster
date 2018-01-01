# Hamster configuration language reference

You can get the same information by typing `hamster help configure`. Besides, `hamster init` includes a cheat-sheet in the mission file.

## Basic syntax rules

White space only matters in so far that it separates keywords. Line breaks do not matter as long as they are not in the middle of a keyword or value.

The order of the rules and directives may matter amongst rules of the same kind (for example, when there are several different storage rules, the first applicable rule wins). But apart of that, rules can appear in any order that fits you best.

As far as the hamster is concerned, this :

    avoid resources
    get domain

    save as tree
        under "my_blog"

means exactly the same as this :

    avoid resources save as tree under "my_blog" get domain


If a `#` is found on a line, everything that follows up to the line ending is considered to be a comment and ignored.

## Step 0 : checking in

Before setting out for exploring, the hamster can check-in at one or multiple places, to obtain access credentials. Checking in can mean, for example, to type in your user and password on a Bulletin Board's login page.

For now, checking in is done in the simple form of a configurable POST request. It is insufficient to correctly check in on websites with decent CSRF protection mechanisms, and this should evolve as the hamster matures.

    check in at "http://whatever.com/login.php"
        post "name" = "me"
             "password" = "1234"
             "some_other_param" = "some_other_value..."

You can have several `check in` clauses, and all will be executed before the exploration starts.

## Step 1 : getting the first meaningful page

Tell the hamster where to start the exploration :

    start at "https://home.org/bobs/room"

If you omit the protocol part, http is assumed. Redirections are followed.

### HTTP authentication

For web sites that use HTTP authentication, you can send credentials like this :

    user "bob" password "mum" on MATCHER

The MATCHER bit will occur quite a lot, and what you can write there is described accurately further below in this documentation. Matchers are the way for the hamster to know where a rule applies. As examples, you can have the two following authentication rules :

    user "bob" password "mum" on domain
    user "BobGreen" password "elaborate987xyz" on urls ".*serious.com/.*"

Here, depending on whether the hamster wants to download a page from the same domain as the start page (like *home.org*) or from a *serious.com* domain, the hamster will use a different user and password.

You can have as many authentication rules as you like, and the first one that matches applies. If there are no such rules, regular anonymous requests are made.

## Step 2 : finding the links and choosing which ones to follow

Once the starting page has been downloaded, and for every HTML document that's downloaded after that, the hamster scans all links. That means anything with a *src* or an *href* : hypertext links, Javascript resources, images, CSS, you name it.

For each of the links that are found, the hamster has to decide whether to download the target it points to, or not. To take that decision, it checks each link against the download rules that you defined. Download rules start with `get` or `avoid`. The first rule that matches applies. If no rule matches, the link is discarded and your offline copy will still contain a link to the original online location.

`get MATCHER` : links that satisfy the matcher will be downloaded.

`avoid MATCHER` : links that satisfy the matcher will be discarded.

Obviously, one given page won't ever be downloaded twice during the same job.

A special mention for :

`get unknown MATCHER` : This is useful if you use the hamster to mirror an evolving remote site, to allow for incremental updates. Links that satisfy the matcher will be downloaded if there isn't already an offline file representing their target. If there is already an offline copy, that file is acknowledged and the links will point to it even though the content won't be downloaded again.


## Step 3 : downloading the links that were selected

You can tune the downloading process with :

`5 parallel downloads` : the hamster will try to keep 5 connections open for this job. The default is 10.

`maximum N Kb/Mb each [from MATCHER]`, such as : `maximum 100 Mb each` or `maximum 100 Kb each from outside domain`. Lets you limit the size of any individual content, and prevent downloading anything that is foreseeably larger than your limit. However if the remote site did not indicate the content size in the headers, and after a successful download the contents came out larger than the limit, then they will be kept, as there is no reason to discard an effort that has already been fruitful. The default is 5 Mb.

## Step 4 : saving the downloaded content

As content is downloaded, it is saved locally in the working directory. Just like download or authentication rules, you may have several storage rules. The first match applies. If no rules match (or you did not write any storage rules), `save flat` is assumed.

`save [MATCHER] flat [under "directory"]`, such as `save flat` or `save outside domain flat under "foreign"` : contents are saved as uniquely named files in a single directory, without any subdirectories. The default name for the directory is *hamstered_flat*. The only exception will be the starting page, that is saved in the working directory as *index.html*.

`save [MATCHER] as tree [under "directory"]`, such as `save as tree` or `save domain as tree under "maven"` : contents are saved as files in a directory tree structure that mirrors the original URL paths.

`save urls "regex with groups" as "directory/$1/$2"`, such as `save urls ".*topic([0-9]+).message([0-9]+).*" as "bulletin_board/topic_$1/message_$2.html` : if a link's source URL matches the regular expression, it is destructured in groups, and those groups' values are used to build the destination path and file name, with `$n` taking the value of the nth group. Local path separators are always `/`, whatever system the hamster is running on.

## Basic matchers

So far we've seen where to use matchers. It is now time to present them one by one.

`all` : always matches.

`css "selector"`, such as `css ".footer a"` : matches if the link was found in an HTML element that triggers the given CSS selector. This matcher is only allowed in *get* and *avoid* rules.

`domain` : matches anything that's on the same domain as the starting page. To make your configuration more fluid to read, you can also use the alternative form `items on domain`, that has exacty the same effect.

`images` : anything with an extension that looks like an image, or that was found in an *img* tag.

`N jumps and more`, such as `5 jumps and more` : any link that can only be found after N successive jumps (clicks, in your browser) or more from the starting page.

`resources` : matches CSS, Javascript, sound files, .txt files and that sort of stuff, as well as images.

`subpaths` : matches links whose path is a child path of the starting page. http://home.com/bobs/room/cupboard/plank is a subpath of http://home.com/bobs/room.

`up to N jumps`, such as `up to 5 jumps` : matches any link that can be found with N jumps or less from the starting page.

`urls "regex"`, such as `urls ".*bob.*php"` : matches URLs that can be recognized by the regular expression.


## Combining matchers

Basic matchers can be combined with :

`outside MATCHER`, such as `outside subpaths` : matches if and only if MATCHER does not match.

`MATCHER_A on MATCHER_B`, such as `images on domain` : matches if both A and B match.

`MATCHER_A outside MATCHER_B`, such as `images outside domain` : matches if A matches and B does not match.

`unknown MATCHER` (must be first) : matches if MATCHER matches and there is no local file for it already. Useful for updates.
