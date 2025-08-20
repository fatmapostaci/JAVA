package learnJava.src.codeChallenge.gun4;

public class Task2 {/*
     Interview Question
     1'den 100'e kadar olan sayilari  herhangi bir sayi kullanmadan print eden code create ediniz.
     */
    public static void main(String[] args) {
        char a=1, b=100;

        for (char i = a; i < b ; i++) {
            System.out.print(" "+ (int)i);
        }
    }

}
