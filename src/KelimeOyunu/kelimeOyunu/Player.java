package KelimeOyunu.kelimeOyunu;

import java.util.Scanner;

public class Player {
    static int playerId = 000;
    private String playerName;
    private String word="";
    private String ek="";
    private int playerScore=0;
    private boolean acceptWord;

    static Scanner scanner =new Scanner(System.in);
    public void setOyuncu(){
        System.out.print("Oyuncu adı girin: ");
        setPlayerName(scanner.next());
        setPlayerId(+1);
    }
    public int getPlayerId() {
        return playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerScore() {
        return playerScore;
    }
    public void setPlayerId(int playerId) {
        Player.playerId = playerId;
    }
    public void setPlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getWord(){
        return word;
    }
    public void setWord (String word){
        this.word = word;
    }
    public  String getEkKelime(){
        return ek;
    }
    public void setEkKelime(String ek){
        this.ek= ek;
    }
    public void setWordAccepted(boolean acceptWord){
        this.acceptWord = acceptWord;
    }
    public boolean isWordAccepted() {
        return acceptWord;
    }
}
