package learnJava.srcHoca.j99_codechallenge.codechallenge04;

import java.util.Scanner;
  /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilar

   */
public class KelimeOyunu {
        private static final int KABUL = 1;
        private static final int RED = 0;
        private static final int BASA_EKLE = 1;
        private static final int SONA_EKLE = 0;

        static int oyuncu = 1;
        static int puan1 = 0;
        static int puan2 = 0;
        static String kelime = "";
        static Scanner scan = new Scanner(System.in);

        // Main Method
        public static void main(String[] args) {
            System.out.print(oyuncu + ". oyuncu lütfen kelime giriniz: ");
            kelime = scan.next();

            while (true) {
                oyuncuDegistir();
                if (!kelimeyiKabulEdiyorMu(oyuncu, kelime)) {
                    System.out.println(oyuncu + ". oyuncu oyunu kazandı, çünkü diğer oyuncu kelimeyi kabul etmedi.");
                    break;
                }

                puanEkle(oyuncu, kelime);

                int devam = kullaniciSecimAl("Oyuna devam etmek istiyor musunuz? \n1: Evet \n0: Hayır", new int[]{KABUL, RED});
                if (devam == RED) {
                    sonucYazdir();
                    break;
                }

                kelime = kelimeEkle(kelime);
            }
        }


        // Metodlar
        public static void oyuncuDegistir() {
            oyuncu = (oyuncu == 1) ? 2 : 1;
            System.out.println(oyuncu + " numaralı oyuncu devam ediyor...");
        }

        public static boolean kelimeyiKabulEdiyorMu(int oyuncu, String kelime) {

            int kabul = kullaniciSecimAl("Girilen kelime: " + kelime + "\n" + oyuncu + ". oyuncu, kelimeyi kabul ediyor musunuz? \n1: Evet \n0: Hayır", new int[]{KABUL, RED});
            return kabul == KABUL;
        }

        public static void puanEkle(int oyuncu, String kelime) {
            if (oyuncu == 1) {
                puan2 += kelime.length();
            } else {
                puan1 += kelime.length();
            }
        }

        public static void sonucYazdir() {
            System.out.println("Oyun bitti!");
            System.out.println("1. oyuncu puanı: " + puan1);
            System.out.println("2. oyuncu puanı: " + puan2);
            if (puan1 > puan2) {
                System.out.println("1. oyuncu kazandı!");
            } else if (puan2 > puan1) {
                System.out.println("2. oyuncu kazandı!");
            } else {
                System.out.println("Oyun berabere bitti!");
            }
        }

        public static String kelimeEkle(String mevcutKelime) {
            System.out.print("Yeni bir kelime giriniz: ");
            String yeniKelime = scan.next();
            int tercih = kullaniciSecimAl("Yeni kelimeyi nereye eklemek istersiniz? \n1: Başa ekle \n0: Sona ekle", new int[]{BASA_EKLE, SONA_EKLE});

            return (tercih == BASA_EKLE) ? yeniKelime + mevcutKelime : mevcutKelime + yeniKelime;
        }

    public static int kullaniciSecimAl(String mesaj, int[] kabulEdilenDegerler) {
        int secim;
        while (true) {
            System.out.println(mesaj);
            secim = scan.nextInt();

            if (kabulEdilenDegerler.length == 2) { // Örneğin, {1, 0} durumunda
                if (secim == kabulEdilenDegerler[0] || secim == kabulEdilenDegerler[1]) {
                    return secim;
                }
            } else if (kabulEdilenDegerler.length == 3) { // Örneğin, {1, 2, 3}
                if (secim == kabulEdilenDegerler[0] || secim == kabulEdilenDegerler[1] || secim == kabulEdilenDegerler[2]) {
                    return secim;
                }
            }

            System.out.println("Geçersiz seçim, tekrar deneyin.");
        }
    }
      public static int kullaniciSecimAl2(String mesaj) {
          int secim;
          while (true) {
              System.out.println(mesaj);
              int tercih = scan.nextInt();
              if (tercih ==1|| tercih == 0) {
                  return tercih;
              }
              System.out.println("Geçersiz seçim, tekrar deneyin.");
          }
      }

    }
