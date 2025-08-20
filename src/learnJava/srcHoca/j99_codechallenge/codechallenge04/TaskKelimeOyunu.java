package learnJava.srcHoca.j99_codechallenge.codechallenge04;

import java.util.Scanner;

public class TaskKelimeOyunu {
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
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */


    private static final int  KABUL = 1;
    private static final int RED = 2;
    private static final int BASINA_EKLE = 1;
    private static final int SONUNA_EKLE = 2;


    static int oyuncu = 1; // oyuncuyu önce bir olarak atıyacağım. Oyuncu değiştirtiğinde (value = 2 olduğunda ) oyuncu değişir
    static int puan1 = 0;
    static int puan2 = 0;
    static String kelime = "";

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(oyuncu + " numaralı oyuncu lütfen bir kelime giriniz :");
        kelime = scn.next(); // oyuncu verdiği kelimeyi class levelda kaydettik

        while (true){ // Sonsuz döngü oluşturduk
            oyuncuDegistir();

            if(!kelimeyiKabulEdiyorMu(oyuncu,kelime)){
                System.out.println(oyuncu + " numaralı oyuncu oyunu kazandı");
                break;
            }

             puanEkle(oyuncu,kelime);



        }
    }
    public static void oyuncuDegistir(){
        if (oyuncu ==1){
            oyuncu = 2;
        } else {
            oyuncu = 1;
        }
    }

    public static boolean kelimeyiKabulEdiyorMu(int oyuncu , String kelime){
        System.out.println("Diğer oyucunun girdiği kelimeyi kabul ediyormusunuz ? \n 1: Evet \n 2: Hayır");
        int tercih = scn.nextInt();
            return tercih == 1;
    }

    public static void puanEkle(int oyucu,String kelime){
        if (oyuncu == 1){
            puan2 += kelime.length();
        } else {
            puan1 += kelime.length();
        }
    }

    public static int kullanıcınınSeciminiAl (String mesaj ,int [] kabulEttimi){
        while (true) {
            System.out.println(mesaj);
            int secim = scn.nextInt();

            if (secim == kabulEttimi[0]){

            }


        }
    }
}
