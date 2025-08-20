package learnJava.src.dersler.gun49.TEKRAREDILECEK.HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
    /* task->

    Parametreleri , Integer -String HashMap,  int ve String olan (3ayrı parametre)
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyip Integer - String HashMap return eden
    update() isminde METHOD create ediniz.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    input :
    int = 3
    String = Miami
    output :
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"New jersey");
        hashMap.put(2,"New york");
        hashMap.put(3,"London");
        hashMap.put(4,"Paris");

        System.out.print("input : ");
        int key = (new Scanner(System.in)).nextInt();

        System.out.print("String : ");
        String newValue = (new Scanner(System.in)).next();

        update(hashMap,key,newValue);


    }

    private static void update(HashMap<Integer, String> hashMap, int key, String newValue) {
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            if( entry.getKey()==Integer.valueOf( key) ){
                entry.setValue(newValue);
            }
        }
        System.out.println(hashMap);
    }
}
