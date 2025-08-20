package learnJava.srcHoca.InterviewQuestions;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is Palindrome: " + isPalindrome2(input));
    }
    private static boolean isPalindrome2(String input) {

        StringBuilder toCompare=new StringBuilder(input);
        toCompare.reverse();

        if(input.equals(toCompare.toString()))
            return true;
        else return false;
    }


    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
