FLAGS=-Xlint:cast -Xlint:classfile -Xlint:deprecation -Xlint:dep-ann -Xlint:divzero -Xlint:empty -Xlint:fallthrough -Xlint:finally -Xlint:options -Xlint:overrides -Xlint:path -Xlint:processing -Xlint:rawtypes -Xlint:serial -Xlint:static -Xlint:try -Xlint:unchecked -Xlint:varargs

CLASSPATH  = ~/Programming/Java/hang_man/bin

all: bin/com/minesweeper/Main.class
        # Check for static analysis bugs.
	java -cp $(CLASSPATH) -jar ~/findbugs-2.0.0/lib/findbugs.jar -textui -emacs bin/

bin/com/minesweeper/Main.class: src/com/minesweeper/Main.java
	javac $(FLAGS) src/com/minesweeper/Main.java -d bin/

docs: # Regenerate my javadoc stuff.
	javadoc -author -classpath $(CLASSPATH) $(SRC) -d etc/docs/