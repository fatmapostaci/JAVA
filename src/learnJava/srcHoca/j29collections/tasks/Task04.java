package learnJava.srcHoca.j29collections.tasks;

import java.util.HashSet;
import java.util.List;

public class Task04 {
        /*
    Create a method totalCount()
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(List.of(4,2,3,1,7));
        int size = totalCount(hs);
        System.out.println("size = " + size);

    }

    private static int totalCount(HashSet<Integer> hs) {
        if (hs.isEmpty()){
            System.out.println("listelenecek eleman yok");
            return 0;
        } else {
            return hs.size();
        }
    }
}
