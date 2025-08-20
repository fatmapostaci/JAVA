package learnJava.srcHoca.j100projects.project01;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02KutuphaneYonetimi {
    /*
     * TASK:
     * Basit bir kütüphane ödünç alma programı yazınız.
     *
     * 1. Adım : Kullanıcıya mevcut kitap listesini göster ve bir kitap seçmesini iste.
     * 2. Adım : Başka bir kitap almak isteyip istemediğini sor.
     *           İstemiyorsa ödünç aldığı kitapların listesini göster.
     *           İstiyorsa tekrar kitap seçmesini iste.
     * 3. Adım : Her kitap seçiminde, kitabı ödünç alınanlar listesine ekle.
     * 4. Adım : Ödünç alma işlemi bitince tüm ödünç alınan kitapların listesini göster.
     */

    static final int evet = 1;
    static final int hayır = 2;
    static List<String> kitapList = new ArrayList<>();
    static List<String> oduncKitapList = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int kitapIdx;
        boolean devam ;
        System.out.println("------------------------------------------");
        System.out.println("Java Library Yönetimi Programına Hoşgeldiniz");
        System.out.println("------------------------------------------");

        kitapListesiniYukle();

        do {
            kitapListesiYazdir();
            kitapIdx = kitapSec();
            oduncKitapListesineEkle(kitapIdx);
            devam = ekKitapEkle();
        } while (devam);

        System.out.println("Ödünç Aldığınız Kitaplar: ");
        for (String kitap : oduncKitapList){
            System.out.println(kitap);
        }
        
    }

    private static boolean ekKitapEkle() {
        System.out.println("Kitap seçmeye devam etmek istiyormusunuz?\n \t 1- Evet\n \t 2- Hayır");
        int secim=0;
        if (scn.hasNextInt()){
            secim = scn.nextInt();
        } else {
            System.out.println("Sadece 1 veya 2 değerini sayısal olarak giriniz");
            scn.next();
            ekKitapEkle();
        }
        return secim == evet;
    }

    private static void oduncKitapListesineEkle(int kitapIdx) {
         oduncKitapList.add(kitapList.get(kitapIdx-1));
         kitapList.remove(kitapIdx-1);

    }

    private static int kitapSec() {
        int secim =0;
        System.out.println(" Ödünç almak istediğiniz kitabın numarasını giriniz...");
        while(true) {
            if (scn.hasNextInt()) {
                secim = scn.nextInt();
                if (secim > 0 && secim < kitapList.size()+1) {
                    break;
                } else {
                    System.out.println("Lutfen 1 ile "+ kitapList.size()+ " arasında bir seçim yapın");
                }
            } else {
                System.out.println("Lütfen Sayısal bir değer giriniz");
                scn.next();
            }
        }
        return secim;
    }

    private static void kitapListesiYazdir() {
        for (String kitap : kitapList){
            System.out.println(kitap);
        }
    }


    private static void kitapListesiniYukle() {
        kitapList.add("1- Savaş ve Barış ");
        kitapList.add("2- Suç ve Ceza ");
        kitapList.add("3- Anna Karenina ");
        kitapList.add("4- Şeker Portakalı ");
        kitapList.add("5- Simyacı ");
 }

}
