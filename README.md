## Meet the Hamster

The Hamster is made to hoard websites, partly or completely, to duplicate their content online or make them available offline. It trots across their pages following rules that you set. It was designed with very large jobs in mind that require a fair amount of flexibility (such as bulletin boards) and emphasized reliability, but is also well suited for simple jobs.


## How to

First, in some preferably empty directory, you run `hamster init`. That leaves you with a sample `mission_for_the_hamster.txt` file. In that file, you describe the mission in a clear and expressive configuration language. Once done, you run `hamster` and let the hamster hoard.

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

    save as tree

[The full reference is here.](https://github.com/mdolidon/hamster/tree/master/configuration.md)


## Downloading and installing

For now, in these early days, Hamster is available as a runnable .jar on my website : http://kibu.fr/hamster/
Best wrap this in a shell script. It's been seen working on Linux and Windows, provided that a Java 8 Runtime is available.

Soon enough I'll offer better packaging, and especially a Debian package.


## Maturity

The Hamster is very young. I'll keep improving it. There is some more advanced functionality I'd like to implement. I also need to write decent tests. 
But most of all I'd like to get feedback. If you get anything surprising, any bug, any idea of improvement, please create a Github issue, and I'll look into it as time allows. Pull requests are of utmost interest to me.
