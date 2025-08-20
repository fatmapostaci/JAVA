package learnJava.src.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavAlisveris {

    static List <String> urunList = new ArrayList<>(List.of("Elma","Armut","Çilek","Domates","Salatalık"));

    static List <Double> fiyatList = new ArrayList<>(Arrays.asList(20.0,30.0,45.5,50.0,10.0));
     public static void main(String[] args) {
         Scanner scanf = new Scanner(System.in);
         urunListele();
        urunSec(scanf);
        kiloSor(scanf);
    }

    private static int urunSec(Scanner sc) {
        System.out.println("Almak istediğiniz ürünü seçin: ");
        int secenek=0 ;
        while (!(secenek<6 && secenek>0)) {
            if (sc.hasNextInt()) {
                secenek = sc.nextInt();
                if(!(secenek<6 && secenek>0)) {
                    System.out.println("1,2,3,4,5 değerlerinden birini girin");
                    kiloSor(sc);
                }
            } else{ System.out.println("Sayısal değer girin!"); sc.nextLine();}
        }
        return secenek;
    }
    private static double kiloSor(Scanner sc) {
        System.out.println("Kaç kilo almak istediğinizi girin: ");
        double secenek=0.0 ;
        while (!(secenek >0.0)) {
            if (sc.hasNextDouble()) {
                secenek = sc.nextDouble();
                if(secenek<0) {
                    System.out.println("Negatif değer kabul edilmedi");
                    urunSec(sc);
                }
            } else{ System.out.println("Sayısal değer girin!"); sc.nextLine();}
        }
        return secenek;
    }

    private static void urunListele() {
        for (int i = 0; i < urunList.size(); i++) {
            System.out.printf("%d. %-10s fiyatı : %.2f \n", i+1,urunList.get(i),fiyatList.get(i));
        }
    }
}
