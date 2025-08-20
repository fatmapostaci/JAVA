package learnJava.srcHoca.j99_codechallenge.codechallenge03;

public class Task06 {
    /*
    Task: Create a string String productCode = "A12B34C56".
    Count how many digits are in the code and print the count.

Hint: Use replaceAll() to remove letters and check the
length of the resulting string.
     */

    public static void main(String[] args) {
        String productCode = "A12B34C56";

// Remove letters and count remaining characters
        String digitsOnly = productCode.replaceAll("[^0-9]", "");
        int digitCount = digitsOnly.length();

        System.out.println("Number of digits in product code: " + digitCount);



    }
}