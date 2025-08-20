package learnJava.srcHoca.j11arrays;

import java.util.Arrays;

public class C04ArraysSplit {
    // String data type dataları Arrays'e elaman olarak cevirmek için split() meth kullanılır.

    public static void main(String[] args) {
        String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";

        // task-> str'nin kelime ve harf sayısını print eden code create ediniz.
        // KelimeArr oluşturup kelime sayısını bulalım
        str = str.replace(":(","");
        //str.replaceAll("[:(.]","");
        System.out.println("str = " + str);
        String[] kelimeArr = str.split(" ");
        int kelimeSayisi = kelimeArr.length;

        System.out.println("kelimeArr.length = " + kelimeArr.length);
        System.out.println("kelimeArr[0] = " + kelimeArr[0]);
        System.out.println("kelimeArr[kelimeArr.length-1] = " + kelimeArr[kelimeArr.length - 1]);

        // HarfArr oluşturup harf sayısını bulalım
        String[] harfArr =str.
                replaceAll("[' .]","").
                split("");

        System.out.println("harfArr.length = " + harfArr.length);
        System.out.println("harfArr[0] = " + harfArr[0]);
        System.out.println("harfArr[harfArr.length-1] = " + harfArr[harfArr.length - 1]);

        int harfSayisi = harfArr.length;

        // Harf Sayısını kelimeArr de iteration yaparak da bulabiliriz
        System.out.println("Arrays.toString(kelimeArr) = " + Arrays.toString(kelimeArr));

        int numOfLetters = 0;
        for (int i = 0; i < kelimeArr.length; i ++){
            String kelime = kelimeArr[i];
            kelime =kelime.replaceAll("\\p{Punct}","");
            System.out.println("kelime = " + kelime);
            numOfLetters +=kelime.length();
        }

        System.out.println("kelime Sayısı =" + numOfLetters);
        System.out.println("kelimeSayisi = " + kelimeSayisi);
        System.out.println("harfSayisi = " + harfSayisi);

    }
}
