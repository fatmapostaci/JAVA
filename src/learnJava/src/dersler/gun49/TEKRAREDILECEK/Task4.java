package learnJava.src.dersler.gun49.TEKRAREDILECEK;

import java.util.Scanner;
import java.util.TreeMap;

/* Task-> girilen key(ınteger type) karsılık gelen Value(String type) return eden map ve int parametre
 alan method create ediniz.

 ÖRNEK:
 Map:
                 1 ,  "Lion"
                 2 ,  "Tiger"
                 3 ,  "Elephant"
                 4 ,  "Cat"
                 5  , "Dog"
  input: 3
  output : Elephant
  */
public class Task4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(  );

        map.put(1,"Lion");
        map.put(2,"Tiger");
        map.put(3,"Elephant");

        System.out.print("input: ");
        getValue(map,sc.nextInt());

    }

    private static void getValue(TreeMap<Integer, String> map, int i) {

        String value = map.getOrDefault(i, "Deger bulunamadı."); // map.get(i);
        System.out.println("Output: " + value);

    }
}
