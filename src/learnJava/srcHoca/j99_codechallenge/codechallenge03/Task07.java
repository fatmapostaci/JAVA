package learnJava.srcHoca.j99_codechallenge.codechallenge03;

public class Task07 {
    /*
    Task: Given a string
                String sentence = "java programming is fun",
          capitalize the first letter of each word and
          print the modified sentence.
Hint: Use split(), substring(), and toUpperCase().

     */
    public static void main(String[] args) {
        String sentence = "java programming is fun";

        // Kelime sayısını bulalım
        int wordCount = sentence.split(" ").length;

        // Tek tek tüm kelimelerin ilk harflerini büyük harf yaparak yeni Stringi oluştur
        String modifiedStr = "";

        for (int i = 0; i < wordCount; i ++){
            String currentWord = sentence.split(" ")[i]; // tek tek kelimeleri seçeriz

            modifiedStr +=currentWord.substring(0,1).       // ilk harfi seçeriz
                    toUpperCase().        // ilk harfi capital yaparız
                    concat(currentWord.substring(1).toLowerCase()).// kelimenin geri kalan kısmını lowercase yapalım
                    concat(" ");
        }
        System.out.println("modifiedStr = " + modifiedStr);


    }
}
