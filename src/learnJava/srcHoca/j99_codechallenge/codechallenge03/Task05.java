package learnJava.srcHoca.j99_codechallenge.codechallenge03;

public class Task05   {  /*
    Task: Given two strings,
          String firstName = "John " and String lastName = "Doe ",
                trim any extra whitespace,
                concatenate the two names,
                and print the full name in uppercase.
     */

        public static void main(String[] args) {
            String firstName = "  John ";
            String lastName = "    Doe ";

// Trim whitespace, concatenate, and convert to uppercase
            firstName = firstName.trim();
            lastName = lastName.trim();

            String fullName = firstName.concat(" ").concat(lastName).toUpperCase();
            System.out.println(fullName);
 }
}

