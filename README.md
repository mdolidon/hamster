## Meet the Hamster

The Hamster is made to duplicate websites, partly or completely, online or offline in an adapted form. 

Its main difference over other mirroring and offline-reading tools is the **simple, concise yet expressive configuration language that lets it easily wrap around complex situations**. With regards to this balance, it really is the tool that I missed before writing it. 

Even though the hamster was designed with very large jobs in mind that require emphasized reliability and a fair amount of flexibility (such as bulletin boards), it is also nicely suited to simple jobs.




## How to

First in an empty directory, run `hamster init` to create a sample `mission_for_the_hamster.txt` file. Edit that file to describe the mission. Once done, just run `hamster`.

If a large job needs to be interrupted, you can later let it continue where it stopped, with `hamster resume`.

At the end of it, servers may have been down, or the network may have had glitches. If some targets failed to be downloaded because of what could be intermittent errors, the hamster will let you know and guide you towards `hamster retry` to specifically address these concerns.


## Examples

Each of these examples is the `mission_for_the_hamster.txt` file you'd write to run such a job.

Same as "save with files" from your browser :

    start at "stackoverflow.com/questions/466521/how-many-files-can-i-put-in-a-directory"
    get resources


Get the English Git Pro book, with its necessary resources, but only those hosted on the same domain :

    start at "git-scm.com/book/en/v2"
    get subpaths
    get resources on domain


How I extract my company's internal product FAQ/knowledge-directory stored in a Redmine forum, for offline usage by our experts when they go on customers' premises. The hamster's check-in mechanisms are quite rudimentary and Redmine's CSRF protection will prevent us from using them. For such a special use, an external script lets the user log into Redmine and then writes the obtained cookie in a file, from whence the Hamster can use it.

    start at "http://vmaosredmine/projects/nextgen/boards"
    get css "#forum_list *"
    get css "#topics_list *"
    get css "#sidebar *"
    get resources
    cookies "_redmine_session" = file "cookie.txt" on "vmaosredmine"



How I maintain my company's statically served Maven mirror from an Artifactory source. This explores the tree, updates all directory pages and downloads the new artefacts to the mirror :

    start at "https://company.com/artifactory2/repository"
    user "mirror" password "1234" on domain  
        # The password could also have been read from a file,
        # like the cookie in the previous example.

    avoid urls ".*SOME_VERSIONS.*"
    avoid urls ".*OTHER_VERSIONS.*"

    get unknown urls ".*(jar|war|pom|zip)"  # Only download big files if new.
    get all                                 # All else (dir structure...) : always update.

    no size limit       # otherwise the default limit is 5 Mb /item
    save as tree        # tree is one of the possible layouts

[The full configuration language reference is here.](https://github.com/mdolidon/hamster/tree/master/configuration.md)


## Downloading and installing

Ready to roll Hamsters can be found on my website : http://kibu.fr/hamster/

Debian and affiliate users will find a Debian package, to be installed with `sudo dpkg --install hamster*.deb` ; from there on, a `hamster` command will be available in the shell.

Other Linux, OSX and Windows users can download the runnable .jar and wrap it in a shell script. A Java 8 Runtime is necessary.

At last, if you prefer to build it yourself, the commands you're looking for are `gradle shadowJar` for a simple build (output in `build/libs`), or `gradle release` for the full story with the creation of a Debian package ; that last one needs *dpkg* to be installed.

## Maturity

The Hamster is young but has been roaming in a variety of settings already, including several corporate uses. Nevertheless, feedback remains paramount. If you get anything surprising, any bug, any idea of improvement, please create a Github issue and I'll look into it as time allows. Pull requests are of utmost interest to me.
