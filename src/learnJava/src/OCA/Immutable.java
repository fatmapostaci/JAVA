package learnJava.src.OCA;

public class Immutable {

    public static void main(String[] args) {
        String s1 = "Hello";
        String t = new String(s1);
        if ("Hello".equals(s1)) System.out.println("one");
        if (t == s1) System.out.println("two");
        if (t.equals(s1)) System.out.println("three");
        if ("Hello" == s1) System.out.println("four");
        if ("Hello" == t) System.out.println("five");



    }
}
