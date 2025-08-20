package learnJava.src.codeChallenge.gun3;

public class Task05 {
       /*
    Task: Given two strings,
          String firstName = "John " and String lastName = "Doe ",
                trim any extra whitespace,
                concatenate the two names,
                and print the full name in uppercase.
     */

    public static void main(String[] args) {
        String firstName = "  John ";
        String lastName = "   Doe ";

// Trim whitespace, concatenate, and convert to uppercase
        firstName = firstName.trim().toUpperCase();
        lastName = lastName.trim().toUpperCase();
        System.out.println(firstName.concat(" ").concat(lastName));


    }
}
