package learnJava.src.codeChallenge.gun2;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
            /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */
        /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
        Scanner scanf = new Scanner(System.in);
        System.out.print("Kullanici  : A , B , C harflerinden birini secsin ");
        char ch = scanf.next().toUpperCase().charAt(0);
        String str = ch == 'A' ?  "Gayet başarılı":
                     ch == 'B' ? "BAŞARILI" :
                     ch=='C' ? "Ha Gayret" : "" ;
        System.out.println("str = " + str);

/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      Ternary kullanarak cozunuz
    */
        System.out.print("0 ~ 9 arasında bir sayı girin: ");
        int sayi = scanf.nextInt();
        //String translate =
        System.out.println((sayi == 1 ? "One" :
                sayi == 2 ? "Two" :
                        sayi == 3 ? "Three" :
                                sayi == 4 ? "Four" :
                                        sayi == 5 ? "Five" :
                                                sayi == 6 ? "Six" : "geçersiz sayı"));


    }
}
