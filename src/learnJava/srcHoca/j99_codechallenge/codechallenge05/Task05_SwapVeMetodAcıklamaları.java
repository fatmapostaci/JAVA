package learnJava.srcHoca.j99_codechallenge.codechallenge05;

import java.util.ArrayList;
import java.util.Collections;

public class Task05_SwapVeMetodAcıklamaları {
        /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> meyveList = new ArrayList<>();
        meyveList.add("Orange");
        meyveList.add("Kiwi");
        meyveList.add("Peach");
        meyveList.add("Banana");
        meyveList.add("Orange");

        int meyveStock = getCount(meyveList,"Orange");
        System.out.println("meyveStock = " + meyveStock);
        System.out.println("meyveList = " + meyveList);

       // Swap Kullanımı için Mehmet Beye Teşekkürler
        Collections.swap(meyveList,meyveList.indexOf("Kiwi"),meyveList.indexOf("Peach"));
        Collections.swap(meyveList,0,3);
        System.out.println("meyveList = " + meyveList);
    }

    /**
     * Metod için kullanıcılara bilgi verilebilir
     * @param kelimeList
     * Liste bilgisi
     * @param kelime
     * Kelime hakkında bilgi
     * @return
     * Neyi nasıl return eder . Bu metod listin sadece göürüntüsünü verir
     * gibi gibi
     */
    public static int getCount(ArrayList<String> kelimeList, String kelime){
        int count = 0;
        for (String word: kelimeList){
            if (word.equals(kelime)){
                count++;
            }
        }
        return count;
    }
}
