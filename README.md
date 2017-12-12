## Meet the Hamster

The Hamster is made to hoard websites, partly or completely, to duplicate their content online or make them available offline. It crawls across their pages and downloads what needs be. It was designed with very large jobs in mind that require a fair amount of flexibility (such as bulletin boards), but is also well suited for simple jobs.


## How to

First, in some preferably empty directory, you run `hamster init`. That leaves you with a sample `mission_for_the_hamster.txt` file. In that file, you describe the mission in a clear and expressive configuration language. Once done, you run `hamster` and let the hamster hoard.

A large job may be interrupted for whatever reason. Should that happen, just go back there and run `hamster resume`.

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

The Hamster is very young. I'll keep improving it. Stuff I'd like to do :

* allow you to configure cookies manually, and possibly improve the check-in process
* introduce post-processing rules
* introduce a recovery mechanism to retry downloading contents that may have been missed due to a temporarily faulty connexion, a `hamster retry` that should be as easy to use as `hamster resume`.
* write decent automated tests !

But most of all I'd like to get feedback. If you get anything surprising, any bug, any idea of improvement, please create a Github issue, and I'll look into it as time allows. Pull requests are of utmost interest to me.
