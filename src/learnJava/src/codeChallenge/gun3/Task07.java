package learnJava.src.codeChallenge.gun3;

import java.lang.reflect.Array;

public class Task07 {
    public static void main(String[] args) {
        {
    /*
    Task: Given a string
                String sentence = "java programming is fun",
          capitalize the first letter of each word and
          print the modified sentence.
Hint: Use split(), substring(), and toUpperCase().
     */
            String sentence = "java programming is fun";
            String newStr = "";
            String[] wordArr = sentence.split(" ");
            for (int i = 0; i < wordArr.length; i++) {

                newStr += wordArr[i].substring(0, 1).toUpperCase().concat(wordArr[i].substring(1).toLowerCase()).concat(" ");

            }
            System.out.println("New sentence = " + newStr);

        }
    }
}

