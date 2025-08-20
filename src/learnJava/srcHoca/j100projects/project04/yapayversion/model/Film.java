package learnJava.srcHoca.j100projects.project04.yapayversion.model;

import java.util.HashMap;
import java.util.Map;

public class Film {
    private String name;
    private String director;
    private int year;
    private String category;
    private String mainActor;
    private String difficulty;
    private int points;

    public Film(String name, String director, int year, String category, String mainActor, String difficulty, int points) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.category = category;
        this.mainActor = mainActor;
        this.difficulty = difficulty;
        this.points = points;
    }

    // Getters
    public String getName() { return name; }
    public String getDirector() { return director; }
    public int getYear() { return year; }
    public String getCategory() { return category; }
    public String getMainActor() { return mainActor; }
    public String getDifficulty() { return difficulty; }
    public int getPoints() { return points; }

    public Map<String, String> getHints() {
        Map<String, String> hints = new HashMap<>();
        hints.put("Yönetmen", director);
        hints.put("Yıl", String.valueOf(year));
        hints.put("Kategori", category);
        hints.put("Başrol", mainActor);
        return hints;
    }

    @Override
    public String toString() {
        return "Film: " + name + " (" + year + ") - " + category;
    }
}
