package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        int dikKenar1,dikKenar2,hipotenus;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hipotenüs değerini hesaplamak için dik açılı iki kenar değeri girin: ");
        dikKenar1 =  scan.nextInt();
        dikKenar2 =  scan.nextInt();
        System.out.println(dikKenar1 + " , " + dikKenar2 + " dik üçgeninin hipotenüs değeri : " + Math.sqrt( dikKenar1*dikKenar1 + dikKenar2*dikKenar2 ) );

    }
}
