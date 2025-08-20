package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    /*
     String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        Stringindeki harfleri tekrarlı olmayacak şekilde store eden array oluşturun
     */
    public static void main(String[] args) {
        String str = "javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        // Harf olmayan karakterleri temizle
        //str = str.replaceAll("\\W","");
        str = str.replaceAll("\\p{Punct}", "");
        str = str.replaceAll(" ","");
        //str = str.replaceAll("[',.:()]","");
        //str = str.replaceAll("\\p{L}","");
        System.out.println(str);
 /*       int x=0;
        //ilk for döngüsünde charSequence arrayinin boyutunu belirlemek için kontrol ediyorum.
        for(int i='A'; i < 'z'; i++){
            if(str.contains(String.valueOf((char)i)))
                x++;
        }
        char[] charSequence = new char[x];
        x=0;
        //ikinci for döngüsünde eşleşen char ları arraya depoluyorum
        for(int i='A'; i < 'z'; i++){
            if(str.contains(String.valueOf((char)i))){
                charSequence[x]=(char) i;
                x++;
            }
        }
        System.out.println("Arrays.toString(charSequence) = " + Arrays.toString(charSequence));
*/
        // Benzersiz karakterleri saklamak için bir sonuç dizisi oluştur
        int x = 0;
        for (int i = 'A'; i < 'z'; i++) {
            if (str.contains(String.valueOf((char) i)))
                x++;

        }
        if ( str.contains("ç") ) x++;


        char[] charSequence = new char[x+4];
        System.out.println("x = " + x);
        // Karakterleri kontrol et ve benzersiz olanları ekle
        x = 0;

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < charSequence.length; j++) {
                if (charSequence[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                charSequence[x] = currentChar;
                x++;
            }
            System.out.print(currentChar);
        }
        System.out.println(Arrays.toString(charSequence));
    }
    // Şu ana kadar eklenen karakterlerle karşılaştır


    // Benzersizse diziye ekle


    // Sadece kullanılan karakterleri içeren diziyi oluştur

    // Sonuçları yazdır
}



