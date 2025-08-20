package KelimeOyunu.kelimeOyunu;

import java.util.Scanner;

public class Word {
     static Scanner scanf=new Scanner(System.in);

    static void getWord(Player x){
        System.out.print(x.getPlayerName() + " Yeni kelime için bir ek gir : ");
        x.setEkKelime( scanf.next());
        System.out.println(x.getPlayerName() +" -->  *" + x.getEkKelime() + "* ekini girdi");
    }
    static boolean addWordToPlayer(Player a, Player b){

        String ek_kelime=a.getEkKelime();
        System.out.print(b.getPlayerName() + " --> *"+ ek_kelime +"* ekini kabul ediyor musun : (YES/NO) ");
        String y_n = scanf.next();

        if (y_n.equalsIgnoreCase("YES") ){

            int firstOrLast = addToFirstOrLast();
            if (firstOrLast==1){
                b.setWord( ek_kelime+b.getWord());
            }
             if (firstOrLast==2) {
                 b.setWord(b.getWord().concat(ek_kelime));
             }
            //else için kod eklenecek

            a.setWord(b.getWord());
            b.setWordAccepted(true);
            calculateScore(a,b);
        } else{
            b.setWordAccepted(false);
            calculateScore(a,b);
            endTheGame();
        }
     //   calculateScore(a,b);
        return b.isWordAccepted();
    }
    private static int addToFirstOrLast() {
        System.out.println("Başına mı sonuna mı eklesin? (Başına->1-Sonuna->2) ");
        return scanf.nextInt();
    }
    static void endTheGame(){
        System.out.println("Oyun bitti");
    }
    static void calculateScore(Player a,Player b){
        int wordLenght=b.getWord().length();
        int ekLenght = a.getEkKelime().length();
        if (b.isWordAccepted()){
            a.setPlayerScore(ekLenght);
            System.out.println(a.getPlayerName() + " +" + ekLenght +" puan aldı");

        }
        else {
            b.setPlayerScore(ekLenght);
            System.out.println("Geçersiz kelime!" + b.getPlayerName() + " " + ekLenght +" puan aldı");
        }
        System.out.println("Yeni kelimemiz: " +b.getWord().toUpperCase() );
    }

    static void printWord(String word){
        System.out.println("word = " + word);
    }
}
