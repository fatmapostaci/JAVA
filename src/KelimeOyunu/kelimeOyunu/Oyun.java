package KelimeOyunu.kelimeOyunu;

import java.util.ArrayList;

public class Oyun {
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
    public static void main(String[] args) {

        Player oyuncu1 = new Player();
        Player oyuncu2 = new Player();
        oyuncu1.setOyuncu();
        oyuncu2.setOyuncu();

        ArrayList<Player> oList = new ArrayList<>();
        oList.add(oyuncu1);
        oList.add(oyuncu2);
        OyunuBaslat(oList);

    }

    public static void OyunuBaslat(ArrayList<Player> players) {
        int a = 0, b = 1;
        while (true) {
            int temp = a;  // burada döngü başa döndükçe temp değişkenini -> arraylistin 0 ve 1 indexleri üzerine oyuncu değişikliği için düzenledim
            a = b;
            b = temp;

            Word.getWord(players.get(a));  // yeni kelimeyi  döngü başa döndükçe oyuncu değiştiği için her zaman farklı kullanıcıdan istiyor

            boolean continueOrEnd = Word.addWordToPlayer( players.get(a),players.get(b) );   //word classında methodlar her zaman a oyuncusuna kelime soracak, b oyuncusu puan alacak
            System.out.println("Skor tablosu ->>" + players.get(a).getPlayerName() + "=" + players.get(a).getPlayerScore()+
                    " "+ players.get(b).getPlayerName() + "=" + players.get(b).getPlayerScore());

            if (!continueOrEnd)  //devam etmek istenmediğinde oyun sonlanır
                break;


        }
    }
}
