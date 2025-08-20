package learnJava.srcHoca.j29collections.tasks;

import java.util.*;

public class Task09 {
        /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {
        ArrayList<Integer> arrList = createRandomArray();
        System.out.println("oşusturulan random arrList = " + arrList);
        ArrayList<Integer> yeniArr = uniqueElementArr(arrList);

        System.out.println(" unique element arrList = " + arrList);
        System.out.println(" unique element yeniArr = " + yeniArr);

        System.out.println(arrList);
        HashSet<Integer> hs = new HashSet<>(arrList);
        System.out.println("hs = " + hs);
        ArrayList<Integer> arrList2 = new ArrayList<>(hs);
        arrList.clear();
        arrList.addAll(arrList2);


    }

    private static ArrayList<Integer> uniqueElementArr(ArrayList<Integer> arrList) {
        ArrayList<Integer> copyArr = new ArrayList<>(arrList);
        Collections.sort(copyArr);
        System.out.println(copyArr);

        for (int i = 0; i< copyArr.size()-1; i++){
            if (copyArr.get(i)== copyArr.get(i+1)){
                copyArr.remove(i);
                i--;
            }
        }
        return copyArr;
    }

    private static ArrayList<Integer> createRandomArray() {
        // 30 elemanlı elamanları 1 ile 10 arasında olan sayılar
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        while(count < 30){
            int num = random.nextInt(11);
            if (num !=0) {
                count++;
                arr.add(num);
            }
        }
        return arr;
    }
}
