package learnJava.srcHoca.j30maps.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04 {
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

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Lion");
        map1.put(2, "Tiger");
        map1.put(3, "Elephant");
        map1.put(4, "Cat");
        map1.put(5, "Dog");
        System.out.println(method1(map1));
    }
    //Task-> girilen key(ınteger type) karsılık gelen Value(String type) return eden map ve int parametre
    //alan method create ediniz.
    public static String method1(Map<Integer, String> map1){
        Scanner scan = new Scanner(System.in);
        System.out.println("bilgilerini istediğiiniz hayvanın indexini giriniz");
        int no = scan.nextInt();
        return map1.get(no);
    }

    }

