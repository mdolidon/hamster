## Meet the Hamster

The Hamster is made to duplicate websites, partly or completely, online or offline in an adapted form. 

Its main difference over other mirroring and offline-reading tools is the **simple, concise yet expressive configuration language that lets it easily wrap around complex situations**. With regards to this balance, it really is the tool that I missed before writing it. 

The hamster was designed with very large jobs in mind that require a fair amount of flexibility (such as bulletin boards) and emphasized reliability, but it is also well suited for simple jobs.




## How to

First, in an empty directory, you run `hamster init`. That leaves you with a sample `mission_for_the_hamster.txt` file. Edit that file to describe the mission. Once done, just run `hamster`.

A large job may be interrupted for any reason. Should that happen, just go back there and run `hamster resume`.

At the end of it, servers may have been down, or the network may have had glitches. If some targets failed to be downloaded because of what could be intermittent errors, the hamster will let you know and guide you towards `hamster retry` to specifically address these concerns.

That's all there is to it.


## Examples

Same as "save with files" from your browser :

    start at "stackoverflow.com/questions/466521/how-many-files-can-i-put-in-a-directory"
    get resources


Get the English Git Pro book, with its necessary resources, but only those hosted on the same domain :

    start at "git-scm.com/book/en/v2"
    get subpaths
    get resources on domain


How I extract my company's internal product FAQ/knowledge-directory stored in a Redmine forum, for offline usage by our experts when they go on customers' premises. The whole forum is recursively explored. It can be read and naturally navigated offline, including through the "related topics" and "tags" links, yet nothing that should go out of Redmine leaks out : trackers, wiki and other private things won't be downloaded. 

One temporary lack of elegance that squeaks here is the necessity to manually (or scriptedly) include an authentication cookie. The hamster's check-in mechanisms are still rudimentary, and Redmine's CSRF protection will prevent us from using them. This may be improved in the future.

    start at "http://vmaosredmine/projects/nextgen/boards"
    get css "#forum_list *"
    get css "#topics_list *"
    get css "#sidebar *"
    get resources
    cookies "_redmine_session" = "BAh7Dkki(...)753961" on "vmaosredmine"



How I maintain my company's statically served Maven mirror from an Artifactory source. This explores the tree, updates all directory pages and downloads only the new artefacts to the mirror :

    start at "https://company.com/artifactory2/repository"
    user "mirror" password "1234" on domain

    avoid urls ".*SOME_VERSIONS.*"
    avoid urls ".*OTHER_VERSIONS.*"

    get all on up to 4 jumps     # directory depth of 4 -> always
    get unknown items on domain  # the rest -> only if it didn't exist last time

    no size limit       # otherwise the default limit is 5 Mb /item
    save as tree        # tree is one of the possible layouts

[The full configuration language reference is here.](https://github.com/mdolidon/hamster/tree/master/configuration.md)


## Downloading and installing

Ready to roll Hamsters can be found on my website : http://kibu.fr/hamster/

Debian and affiliate users will find a Debian package, to be installed with `sudo dpkg --install hamster*.deb` ; from there on, a `hamster` command will be available in the shell.

Other Linux, OSX and Windows users can download the runnable .jar and wrap it in a shell script. A Java 8 Runtime is necessary.

At last, if you prefer to build it yourself, the commands you're looking for are `gradle shadowJar` for a simple build (output in `build/libs`), or `gradle release` for the full story with the creation of a Debian package ; that last one needs *dpkg* to be installed.

## Maturity

The Hamster is young. I'll keep improving it. There is some more advanced functionality I'd like to implement. I also need to continue writing tests. 
But most of all I'd like to get feedback. If you get anything surprising, any bug, any idea of improvement, please create a Github issue, and I'll look into it as time allows. Pull requests are of utmost interest to me.
