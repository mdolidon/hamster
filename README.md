## Meet the Hamster

The Hamster is made to hoard websites, partly or completely, to make them available online or offline in an adapted form. 

Its main difference over other mirroring and offline-reading tools is the **simple yet expressive configuration language that lets it easily wrap around complex situation**. With regards to flexibility, it really is the tool that I missed before writing it. 

The hamster was designed with very large jobs in mind that require a fair amount of flexibility (such as bulletin boards) and emphasized reliability, but is also well suited for simple jobs.




## How to

First, in an empty directory, you run `hamster init`. That leaves you with a sample `mission_for_the_hamster.txt` file. Simply edit that file to describe the mission. Once done, you run `hamster` and let the hamster hoard.

A large job may be interrupted for whatever reason. Should that happen, just go back there and run `hamster resume`.

At the end of it, some servers may have been down, or the network may have had glitches. If some targets failed to be downloaded because of what could be intermittent errors, the hamster will let you know, and guide you towards `hamster retry`, to specifically address these concerns.

That's all there is to it.


## Examples

Same as "save with files" from your browser :

    start at "stackoverflow.com/questions/466521/how-many-files-can-i-put-in-a-directory"
    get resources


Get the English Git Pro book, with its resources on the same domain :

    start at "git-scm.com/book/en/v2"
    get subpaths
    get resources on domain


How I maintain my company's statically served Maven mirror from an Artifactory source. This explores the tree, updates the directory pages and downloads the new artefacts to the mirror :

    start at "https://company.com/artifactory2/repository"
    user "mirror" password "1234" on domain

    avoid urls ".*SOME_VERSIONS.*"
    avoid urls ".*OTHER_VERSIONS.*"
    get all on up to 4 jumps
    get unknown items on domain

    maximum 300 Mb each

    save as tree

[The full configuration language reference is here.](https://github.com/mdolidon/hamster/tree/master/configuration.md)


## Downloading and installing

Ready to roll Hamsters can be found on my website : http://kibu.fr/hamster/

Debian and affiliate users will find a Debian package, to be installed with `sudo dpkg --install hamster*.deb` ; from there on, a `hamster` command will be available in the shell.

Other Linux, OSX and Windows users can download the runnable .jar and wrap it in a shells script. A Java 8 Runtime is necessary.

At last, if you prefer to build it yourself, the commands you're looking for are `gradle shadowJar` for a simple build (output in `build/libs`), or `gradle release` for the full story with the creation of a Debian package ; that last one needs *dpkg* to be installed.

## Maturity

The Hamster is young. I'll keep improving it. There is some more advanced functionality I'd like to implement. I also need to continue writing tests. 
But most of all I'd like to get feedback. If you get anything surprising, any bug, any idea of improvement, please create a Github issue, and I'll look into it as time allows. Pull requests are of utmost interest to me.
