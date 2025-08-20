package learnJava.srcHoca.j99_codechallenge.codechallenge03;

public class Dummy {
    public static void main(String[] args) {
        String score1 = "Player1: 89 points";
        String score2 = "Player2: 93 points";

        score1= score1.substring(9).replaceAll("\\D" ,"");

        score2= score2.substring(9).replaceAll("\\D" ,"");

        int sayi1=Integer.parseInt(score1);
        int sayi2=Integer.parseInt(score2);

        if (sayi1>sayi2){
            System.out.println("Player 1 has higher score= " + sayi1);
        }
        else {
            System.out.println("Player 2 has higher score= " + sayi2);

        }
    }

}
