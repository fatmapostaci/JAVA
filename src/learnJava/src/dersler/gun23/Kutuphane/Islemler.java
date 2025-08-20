package learnJava.src.dersler.gun23.Kutuphane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Islemler {
    static Scanner sc = new Scanner(System.in);

    static void uyeEkle(ArrayList<String> uyeler) {
        System.out.print("Uye bilgisi girin: ");
        uyeler.add(sc.next().toLowerCase());
    }
    private static void uyeleriListele(ArrayList<String> uyeler) {
        System.out.println(uyeler);
    }

    static void uyeleriSirala(ArrayList<String> uyeler) {
        Collections.sort(uyeler);
        uyeleriListele(uyeler);
    }


    static void uyeSil(ArrayList<String> uyeler) {
        System.out.print("Silmek istediğiniz üye adını girin: ");
        String silinecek_uye = sc.next();
        if (uyeler.contains(silinecek_uye)) {
            uyeler.remove(silinecek_uye);
            System.out.println("üye silindi");
        }
        else {
            System.out.println("bu isimde bir üye sistemde bulunmuyor");
            System.out.println(uyeler);
        }
    }


    public static void uyeKontrol(ArrayList<String> uyeler) {
        System.out.print("Kontrol etmek için bir üye ismi girin: ");
        String uye_kontrol =sc.next().toLowerCase();
        if(uyeler.contains(uye_kontrol)) System.out.println("üye kayıtlı");
        else System.out.println("üye kayıtlı değil");
    }

    static void cikis() {
    }
}

