package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class Task09_NestedTernary {
    /* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      Ternary kullanarak cozunuz
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgileri al
        System.out.print("Bir rakam girin: ");
        int a = scanner.nextInt();

        if (a>=0 && a<10) {
            System.out.println((a == 0 ? "Zero" :
                    a == 1 ? "One" :
                            a == 2 ? "Two" :
                                    a == 3 ? "Tree" :
                                            a == 4 ? "Four" :
                                                    a == 5 ? "Five" :
                                                            a == 6 ? " Six" :
                                                                    a == 7 ? "Seven" :
                                                                            "E Yeter artık"));
        } else {
            System.out.println("Lütfen sadece sayı ile rakam giriniz");
        }
 }
}
