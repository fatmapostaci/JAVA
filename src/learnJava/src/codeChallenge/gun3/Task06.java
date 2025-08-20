package learnJava.src.codeChallenge.gun3;

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
        productCode = productCode.replaceAll("[^0-9]","");
        System.out.println(productCode);
        int length = productCode.length();
        System.out.println(length);
    }
}
