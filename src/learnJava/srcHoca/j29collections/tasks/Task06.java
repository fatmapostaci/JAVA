package learnJava.srcHoca.j29collections.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task06 {
    // Step 1 : bir metod oluşturup bir HashSet i
    // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
    // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.

    public static void main(String[] args) {
        // Fatma Hanımın yöntemi
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8));
        System.out.println(generateSetFatma(arrayList));

        // Diger yöntem
        HashSet<Integer> hs = generateSet(1, 2, 3, 4, 5, 5, 5, 6, 7, 8);
        System.out.println("hs = " + hs);



        //Step 2
        // AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.

        addElements(hs,9,10,11,9,11);
        System.out.println("son haliyle hs = " + hs);

    }

    private static void addElements(HashSet<Integer> hs, int ...nums) {
        for (int num: nums){
            hs.add(num);
        }
    }

    private static HashSet<Integer> generateSet(int ... nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int sayi:nums){
            hs.add(sayi);
        }
        return hs;
    }

    private static HashSet<Integer> generateSetFatma(List<Integer> arrayList) {
        return new HashSet<>(arrayList);
    }

// Dizi tipindeki dizi, arraylist, set map ler i fonksiyona gönderdiğinizde
// fonksiyona referansın kopyası gittiği için yapılan değişiklikler kendisinde yapılmış olur (kopya referans da
// aynı diziyi işaret eder) bu değişkenleri RETURN etmenize gerek yoktur.

}


