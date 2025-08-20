package learnJava.srcHoca.j100projects.project04.yapayversion.model;

public class User {
    private String username;
    private String password;
    private int totalScore;
    private int gamesPlayed;
    private String difficulty;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.totalScore = 0;
        this.gamesPlayed = 0;
        this.difficulty = "NORMAL";
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public void addScore(int points) { 
        this.totalScore += points;
        this.gamesPlayed++;
    }
    public int getTotalScore() { return totalScore; }
    public int getGamesPlayed() { return gamesPlayed; }
    public double getAverageScore() {
        return gamesPlayed == 0 ? 0 : (double) totalScore / gamesPlayed;
    }
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public boolean checkPassword(String password) { return this.password.equals(password); }
}
