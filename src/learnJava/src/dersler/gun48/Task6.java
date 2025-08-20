package learnJava.src.dersler.gun48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task6 {
    // Task 1 : bir metod oluşturup bir HashSet i
    // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
    // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8));
        System.out.println(generateSet(arrayList));
    }

    private static HashSet<Integer> generateSet(List<Integer> arrayList) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
    return hashSet;
    }

}
