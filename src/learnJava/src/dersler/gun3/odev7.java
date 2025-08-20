package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev7 {
    public static void main(String[] args) {
                    /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        int mesafe, hiz;
        Scanner scanf = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        mesafe =scanf.nextInt();
        System.out.print("Hızı giriniz: ");
        hiz =scanf.nextInt();
        System.out.printf("Süre %f saattir.", (float)(mesafe/hiz) );



    }
}
