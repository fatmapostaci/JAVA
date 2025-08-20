package learnJava.src.interview;

public class polindromString {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(input));

        isPalindrome2(input);
    }

    private static void isPalindrome2(String input) {

        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        if(input.equals(sb.toString())){
            System.out.println("palindromdur");
            System.out.println("sb.toString() = " + sb.toString());
        }
        else
            System.out.println("sb = " + sb);

    }


    private static boolean isPalindrome(String input) {

        StringBuilder stringtoCompare=new StringBuilder(input);
        stringtoCompare.reverse();

        if(input.equals(stringtoCompare.toString()))
            return true;
        else return false;
    }
}
