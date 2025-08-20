package learnJava.srcHoca.j99_codechallenge.codechallenge05;

import java.util.Arrays;

public class Task01 {
    /*
     String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        Stringindeki harfleri tekrarlı olmayacak şekilde store eden array oluşturun
     */
    public static void main(String[] args) {
        String str = "javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";

        // Harf olmayan karakterleri temizle
        str = str.replaceAll("\\p{Punct}","")
                .replaceAll("\\s","");

       // str = str.replaceAll("[',.;:(? ]","");
        System.out.println("str = " + str);

        // Benzersiz karakterleri saklamak için bir sonuç dizisi oluştur
        char[] uniqueChars = new char[str.length()];
        int counter = 0;

        // Karakterleri kontrol et ve benzersiz olanları ekle
        for (int i =0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Şu ana kadar eklenen karakterlerle karşılaştır
            for (int j =0; j < uniqueChars.length; j ++){
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }

            // Benzersizse diziye ekle
            if (isUnique){
                uniqueChars[counter] = currentChar;
                counter++;
            }
        }

        System.out.println("Arrays.toString(uniqueChars) = " + Arrays.toString(uniqueChars));
        System.out.println("counter = " + counter);

        // Sadece kullanılan karakterleri içeren diziyi oluştur

        char [] result = Arrays.copyOf(uniqueChars,counter);

        // Sonuçları yazdır
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}
