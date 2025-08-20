package learnJava.src.interview;

public class reverseString4{
    public static void main(String[] args) {

        // Verilen stringi tersten yazdıralım

        String input = "Automation";
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        input = stringBuilder.toString();
        System.out.println(input);

        String reverseString ="";
        for (int i = input.length(); i>0 ; i--) {
            reverseString = reverseString.concat(input.substring(i-1,i));
        }
        System.out.println(reverseString);
    }
}
