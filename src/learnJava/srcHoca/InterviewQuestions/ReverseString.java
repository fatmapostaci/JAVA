package learnJava.srcHoca.InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        // Verilen stringi tersten yazdıralım
        String input = "Automation";

        for (int i = input.length()-1; i >= 0 ; i--) {
            System.out.print(input.charAt(i));
        }

        StringBuilder tersString = new StringBuilder(input);
        System.out.println(tersString.reverse());

        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        input = stringBuilder.toString();
        System.out.println(input);


        String value = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            value += input.charAt(i);
        }
        System.out.println("Yeni kelime " + value);



        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
