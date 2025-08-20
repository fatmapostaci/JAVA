package learnJava.srcHoca.j99_codechallenge.codechallenge02;

public class Task02_Modulus {
            /*
           Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.

            Ex :
            input  : 14531
            output : 9
         */

    public static void main(String[] args) {

        int number = 14531;
        int ilkIki = number / 1000; // 14
        int sonIki = number % 100; // 31

        int toplamIlkIki = (ilkIki / 10) + (ilkIki % 10);
        int toplamSonIki = (sonIki / 10) + (sonIki % 10);

        int sonuc = toplamIlkIki + toplamSonIki;
        System.out.println("sonuc = " + sonuc);
    }
}
