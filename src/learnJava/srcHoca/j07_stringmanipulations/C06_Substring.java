package learnJava.srcHoca.j07_stringmanipulations;

import java.util.Scanner;

public class C06_Substring {
        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */

    public static void main(String[] args) {

        String str = "Madem geldin dünyaya otur çalış Javaya!";
        System.out.println("str = " + str);

        System.out.println("str.substring(5) = " + str.substring(5));// Index 5 ten itibaren geri kalanı yazdırırız
        System.out.println("str.substring(2,7) = " + str.substring(2, 7)); //  index 2 dahil  index 7. kadar

        //str'nin son 10 karaterini print ediniz
        System.out.println("str.substring(str.length()-10) = " + str.substring(str.length() - 10));

        //str.nin ilk 10 karakterini print ediniz
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));

        //str'nin ilk karaterini print ediniz
        String ilkHarfStr = str.substring(0, 1);
        char ilkFarfChar = str.charAt(0);
        System.out.println("ilkHarfStr = " + ilkHarfStr);
        System.out.println("ilkFarfChar = " + ilkFarfChar);

        //str'nin son karakterini print ediniz
        char sonchar = str.charAt(str.length() - 1);
        String sonstr = str.substring(str.length() - 1);

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak
        Scanner input = new Scanner(System.in);
        System.out.println("4 harften oluşan bir kelime giriniz...");
        String kelime = input.next();

        if (kelime.length() == 4) {

            System.out.println(kelime.substring(kelime.length() - 1) +
                    kelime.substring(2, 3) +
                    kelime.substring(1, 2) +
                    kelime.substring(0, 1));
            // 2. yöntem:
            System.out.println("" + kelime.charAt(kelime.length() - 1) +
                    kelime.charAt(2) +
                    kelime.charAt(1) +
                    kelime.charAt(0));

        } else System.out.println(" Dört harfli olmalıydı...");

    }
}