package learnJava.src.dersler.gun12;

public class Task03 {
    // Task-> "Alamanya" Stringindeki ikinci 'a' characterinin indexini print eden code create ediniz

    public static void main(String[] args) {
        String str = "Alamanya";
        // ilk küçük 'a' yı bulmak...
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.indexOf(\"a\",str.indexOf(\"a\")+1) = " + str.indexOf("a", str.indexOf("a") + 1));

        int ilkKucukA  = str.indexOf("a");

        // İkinci küçük 'a' yı bulmak...
        int ikinciKucukA = str.indexOf('a',ilkKucukA + 1);
        System.out.println("ikinciKucukA = " + ikinciKucukA);

    }
}
