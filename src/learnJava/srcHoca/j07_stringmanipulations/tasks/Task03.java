package learnJava.srcHoca.j07_stringmanipulations.tasks;

public class Task03 {
    // Task-> "Alamanya" Stringindeki ikinci 'a' characterinin indexini print eden code create ediniz

    public static void main(String[] args) {
        String str = "Alamanya";
        // ilk küçük 'a' yı bulmak...

        int ilkKucukA  = str.indexOf("a");

        // İkinci küçük 'a' yı bulmak...
        int ikinciKucukA = str.indexOf('a',ilkKucukA + 1);

    }
}
