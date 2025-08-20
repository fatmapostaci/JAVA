package learnJava.src.dersler.gun6;

import java.util.Scanner;

public class Egzercises {

    public static void main(String[] args) {
 /*
    30-60-90 Üçgeni Hesaplama Uygulaması

    Kullanıcıdan 90 derecenin karşısındaki kenar uzunluğunu (hipotenüs) alarak,
    30 ve 60 derecelik açıların karşısındaki kenar uzunluklarını hesaplayan bir Java programı yazın.

    30-60-90 üçgeninde kenar uzunlukları arasındaki oranlar şu şekildedir:
    - 90 derecenin karşısındaki kenar (hipotenüs): 2 * x
    - 30 derecenin karşısındaki kenar: x
    - 60 derecenin karşısındaki kenar: x * √3

    Burada:
    - x: 30 derecenin karşısındaki kenar uzunluğu (90 derecenin karşısındaki kenarın yarısı)

    Kullanıcıdan alınacak veriler:
    - 90 derecenin karşısındaki kenar uzunluğu (hipotenüs)

    Program, kullanıcıdan aldığı bu değere göre 30 ve 60 derecelik açılara
     denk gelen kenar uzunluklarını hesaplayarak sonucu ekrana yazdırmalıdır.
*/

        System.out.print("Hipotenüs değerini girin: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

        //double x30 =  hipotenus90/2;
       //double y60=  x30 * Math.sqrt(3);

        //System.out.println("30 derecenin karşısındaki kenar = " + x30);
        //System.out.printf("60 derecenin karşısındaki kenar = %.3f ", y60);

    }
}
