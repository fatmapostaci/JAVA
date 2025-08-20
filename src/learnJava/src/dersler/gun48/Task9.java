package learnJava.src.dersler.gun48;

import java.util.*;

public class Task9 { /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {

        ArrayList<Integer> randomArrayList = createRandomArray();
        System.out.println("randomArrayList = " + randomArrayList);
        uniqueElementArr(randomArrayList);

        Set<Integer> hs = new HashSet<>(randomArrayList);
        System.out.println("hs = " + hs);
    }
    private static void uniqueElementArr(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println("sorted " + arrayList);
        for (int i = 0; i < arrayList.size()-1; i++) {
            if( arrayList.get(i)  == arrayList.get(i+1) ){
                arrayList.remove(i);
                i--;
            }

        }
        System.out.println(arrayList);


    }


    private static ArrayList<Integer> createRandomArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int num = random.nextInt(10);
            arrayList.add(num);
        }

        return arrayList;
    }


}
