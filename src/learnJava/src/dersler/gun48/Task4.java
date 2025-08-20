package learnJava.src.dersler.gun48;

import java.util.HashSet;
import java.util.List;

public class Task4 {
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
            HashSet<Integer> hs = new HashSet<>(List.of(4,5,2,1,7));
            int size = totalcount(hs);

            System.out.println("size = " + size);
        }

    private static int totalcount(HashSet<Integer> hashSet) {

            if(!hashSet.isEmpty())
                return hashSet.size();
            else
                return 0;
        }
}
