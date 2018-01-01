.PHONY : clean test deploy

ANTLR_JAR := $(wildcard antlr-4*-complete.jar)
GRAMMARS := HamsterConfigLexer.g4 HamsterConfigParser.g4
PACKAGE := org.mdolidon.hamster.configuration.antlrGenerated
JAVA_SRC := $(patsubst %.g4, %.java, $(GRAMMARS))
PACKAGEDIR := $(subst .,/,$(PACKAGE))
JAVA_EXECUTABLE := $(patsubst %.java, $(PACKAGEDIR)/%.class, $(JAVA_SRC))
TARGETDIR := ../src/main/java/$(PACKAGEDIR)

test: $(JAVA_EXECUTABLE)
	@echo --- DEFAULT TARGET : TEST
	@echo "Run make deploy to update the app's main code base with the new parser."
	@echo
	java -Xmx500M -cp $(ANTLR_JAR):. org.antlr.v4.gui.TestRig $(PACKAGE).HamsterConfig config -tokens -gui test_hamster_config.txt

deploy: $(JAVA_SRC)
	mv *.java *.tokens $(TARGETDIR)

clean:
	-rm -r *.tokens *.java $(PACKAGEDIR) latestJava *.interp

################################################################

%.java: %.g4
	java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool -package $(PACKAGE) $<

latestJava: $(JAVA_SRC)
	echo "This file is only a timestamp for Make" >  latestJava

$(JAVA_EXECUTABLE): latestJava
	mkdir -p $(PACKAGEDIR)
	javac -cp $(ANTLR_JAR) -d . *.java
