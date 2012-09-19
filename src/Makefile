FLAGS=-Xlint:cast -Xlint:classfile -Xlint:deprecation -Xlint:dep-ann -Xlint:divzero -Xlint:empty -Xlint:fallthrough -Xlint:finally -Xlint:options -Xlint:overrides -Xlint:path -Xlint:processing -Xlint:rawtypes -Xlint:serial -Xlint:static -Xlint:try -Xlint:unchecked -Xlint:varargs

all:  ../bin/com/minesweeper/Cell.class ../bin/com/minesweeper/Main.class
        # Check for static analysis bugs.
	java -cp $(CLASSPATH) -jar ~/findbugs-2.0.0/lib/findbugs.jar -textui -emacs ../bin/

../bin/com/minesweeper/Main.class: com/minesweeper/Main.java
	javac $(FLAGS) com/minesweeper/Main.java -d ../bin/

../bin/com/minesweeper/Cell.class: com/minesweeper/Cell.java
	javac $(FLAGS) com/minesweeper/Cell.java -d ../bin/

# docs: # Regenerate my javadoc stuff.
# 	javadoc -author -classpath $(CLASSPATH) $(SRC) -d etc/docs/