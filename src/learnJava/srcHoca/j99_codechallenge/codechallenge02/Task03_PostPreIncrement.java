package learnJava.srcHoca.j99_codechallenge.codechallenge02;

public class Task03_PostPreIncrement {


    public static void main(String[] args) {
        int a = 1;

        System.out.println(++a); // 2
        System.out.println(a++); // 2
        System.out.println(a); // 3

        int b = 5;
        System.out.println(b--); // 5
        System.out.println(--b); // 3
        System.out.println(b); // 3

        int x = 20;
        int y = 15;

        System.out.println("(++x + y--) = " + (++x + y--)); //
        System.out.println("(++x + y--) = " + (++x + --y)); //

        int k = 7;
        System.out.println("( ++k + k++ + k++ + --k + k) = " + (++k + k++ + k++ + --k + k));


    }
}
