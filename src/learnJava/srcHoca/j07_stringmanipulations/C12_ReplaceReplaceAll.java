package learnJava.srcHoca.j07_stringmanipulations;

public class C12_ReplaceReplaceAll {
    /** replace()
     * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
     * (update -set) saglar. Sonuc String'dir..
     */

    public static void main(String[] args) {
        String str=" Madem geldin dunyaya calis JAVA'ya ";

        System.out.println("str.replace(' ','_') = " + str.trim().replace(' ', '_'));
        System.out.println("str.replace(\"a\",\"A\") = " + str.replace("a", "A"));
        System.out.println("str.replace(\"JAVA\", \"Java\") = " + str.replace("JAVA", "Java"));
        System.out.println("str.replace(\"JAVA\", \"Phyton\") = " + str.replace("JAVA", "Phyton"));

        // replaceFirst() ilk eşleşen değeri dönüştürür.

        System.out.println("str.replaceFirst(\"a\",\"*\") = " + str.replaceFirst("a", "*"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="javaCAN'lara selam olsun 1234567 $ # @ 5 %   :)";
        System.out.println("str.replaceAll(\"\\\\s\", \"_\") = " + str.replaceAll("\\s", ""));
        System.out.println("str.replaceAll(\"\\\\S\",\"*\") = " + str.replaceAll("\\S", "*"));
        System.out.println("str.replaceAll(\"\\\\w\",\"\") = " + str.replaceAll("\\w", ""));
        System.out.println("str.replaceAll(\"\\\\W\",\"&\") = " + str.replaceAll("\\W", "&"));
        System.out.println("str.replaceAll(\"\\\\d\",\"\") = " + str.replaceAll("\\d", ""));
        System.out.println("str.replaceAll(\"\\\\D\",\"\") = " + str.replaceAll("\\D", ""));

        // Regex te belirli karakterleri filtreleme
        System.out.println("str.replaceAll(\"[selam]\",\"*\") = " + str.replaceAll("[selam]", "*"));
        System.out.println("str.replaceAll(\"[%$]\",\"TL\") = " + str.replaceAll("[%$]", "TL"));

        // Regex ile belirli aralıktaki değerleri değiştirme:
        System.out.println("str.replaceAll(\"[a-e]\",\"?\") = " + str.replaceAll("[a-e]", "?"));
        System.out.println("str.replaceAll(\"[0-9]\",\"\") = " + str.replaceAll("[0-9]", ""));
        System.out.println("str.replaceAll(\"[a-zA-Z0-9]\",\"?\") = " + str.replaceAll("[a-zA-Z0-9]", "?"));
        // değiliyle işlem yapma
        System.out.println("str.replaceAll(\"[0-9]\",\"\") = " + str.replaceAll("[^0-9]", ""));
    }
}
