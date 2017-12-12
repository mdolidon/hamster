# Setting it up with Eclipse

`gradle eclipse` and then import as an Eclipse project.

I'll let you adapt for other IDEs. Pull requests are welcome.

# Building the main JAR

`gradle shadowJar`

The output lives in `build/libs/hamster-all.jar`

# Changing the config DSL's parser

For now I keep this separate. The setup is not automated. It's in `configGrammar/`. Make sure you download http://www.antlr.org/download/antlr-4.7.1-complete.jar and drop it in there. As Gradle needs about 30 seconds to do anything of interest on my low-end NUC, Make is good enough for me on this part that's not so often touched. 

`make` builds Java files locally from the grammar, builds class files in a test directory, and runs the new parser on `test_hamster_config.txt`

`make deploy` updates the main source tree.

`make clean`, obviously.

Feel free if you want to gradleize this. However, as I said, I'll stick with Make because of sheer speed on my dev box.

# Tests

I like to run JUnit tests from Eclipse, but you may prefer `gradle test`. The coverage is extremely poor as of now, and I plan to improve this.
