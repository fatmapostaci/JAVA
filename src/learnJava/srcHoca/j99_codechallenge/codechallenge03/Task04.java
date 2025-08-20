package learnJava.srcHoca.j99_codechallenge.codechallenge03;

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
        int player1Score = Integer.parseInt(score1.substring(score1.indexOf(":") + 2, score1.indexOf(" points")));
        int player2Score = Integer.parseInt(score2.substring(score2.indexOf(":") + 2, score2.indexOf(" points")));

// Compare and print the player with the higher score
        if (player1Score > player2Score) {
            System.out.println("Player1 has the higher score: " + player1Score);
        } else if (player2Score > player1Score) {
            System.out.println("Player2 has the higher score: " + player2Score);
        } else {
            System.out.println("Both players have the same score.");
        }

    }
}
