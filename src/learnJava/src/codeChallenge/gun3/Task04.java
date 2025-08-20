package learnJava.src.codeChallenge.gun3;

public class Task04 {

    /*
    Task: Create two strings representing scores in this format:
                 String score1 = "Player1: 89 points",
                 String score2 = "Player2: 93 points".
          Extract the numeric values from each string, convert them to integers,
          and compare them. Print the player with the higher score.
    Hint: Use substring() and Integer.parseInt().
     */
        public static void main(String[] args) {
        String score1 = "Player1: 89 points";
        String score2 = "Player2: 93 points";

// Extract numeric values and convert to integers

// Compare and print the player with the higher score
            int index = score1.indexOf(score1.valueOf(':'))+1;
            score1 =score1.substring(index).replaceAll("\\D","");
            System.out.println(Integer.parseInt(score1));
    // int sayi = Integer.parseInt(score1);

    }

}
