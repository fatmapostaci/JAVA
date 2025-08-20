package learnJava.src.OCA;

public class StringBuilderClass {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total+= letters.substring(1,2).length();
        total += letters.substring(6,6).length();

       // System.out.println("total = " + total);
        total += letters.substring(6,5).length();    //StringIndexOutOfBoundsException

        System.out.println("total = " + total);

        letters.delete(1,2);
    }
}
