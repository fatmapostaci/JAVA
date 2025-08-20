package FilmIzlemePlatform.src;

import java.util.ArrayList;
import java.util.List;

public class Audience {

    String name;
    String mail;
    List<Film> filmList;

    public Audience(String name, String mail) {
        this.name = name;
        this.mail = mail;
        this.filmList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Audience{" +
                "name='" + name + '\'' +
                ", mail=" + mail +
                ", filmList= " + watchedFilmsNames(this.filmList) +
                '}';
    }

    private String watchedFilmsNames(List<Film> filmList){
        StringBuilder filmNames = new StringBuilder();
        for (Film f : filmList)
            filmNames.append(f.name).append(" ");
        return filmNames.toString();
    }
}
