package OCA.src.Q098;

import java.util.Arrays;


class MyFile {
    public static void main(String[] args) {
// ALT+SHIFT+F10, Right, E, Enter, Tab, enter your command line parameters, Enter. ;-)

        String arg1 = args[1];
        String arg2 = args[2];
        String arg3 = args[3];
        System.out.println("Arg is " + arg3);
        System.out.println(Arrays.toString(args));
    }
}
/*
Which command-line arguments should you pass to the program to obtain
the following output? Arg is 2

A. java MyFile 1 3 2 2
B. java MyFile 2 2 2
C. java MyFile 1 2 2 3 4
D. java MyFile 0 1 2 3


PS C:\Users\fatma\IdeaProjects\OCA\src\Q098> java MyFile.java 1 3 2 2




Answer: A
 */
// 2nd version
/*
Soru ayni yalniz cevap siklari farkli

A. java MyFile 1 3 2 2
B. java MyFile 2 2 2
C. java MyFile 1 2 2 3 4
D. java MyFile 0 1 2 3

Answer: D
 */
// FOR COMMAND LİNE ALT+SHIFT+F10, Right, Edit, Enter, Tab, enter your command line parameters, Enter. ;-)