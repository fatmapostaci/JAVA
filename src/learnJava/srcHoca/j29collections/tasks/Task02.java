package learnJava.srcHoca.j29collections.tasks;

import java.util.*;

public class Task02 {

    //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
    // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
    // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
    // iyi bir javaCAN  için gelişMAC lazım :)

    public static void main(String[] args) {
        String girilenString = "Girilen deger bu olsun";
        girilenString = girilenString.toLowerCase().replace(" ","");
        String[] harfArr = girilenString.split("");
        System.out.println("harfArr = " + Arrays.toString(harfArr));

        // 1. yol: Eğer tekrarlı olacak ise karakterler Arraylist ile çözmeyi tercih ederim
        ArrayList<String> harfList = new ArrayList<>(Arrays.asList(harfArr));
        System.out.println("sort öncesi harfList = " + harfList);
        Collections.sort(harfList);
        System.out.println("sort sonrası harfList = " + harfList);

        // 2. yol: Eğer tekrarlı olmayacak ise elemanler --> Tree Set tercih ederim
        TreeSet<String> harfSet = new TreeSet<>(Arrays.asList(harfArr));
        System.out.println("harfSet = " + harfSet);


    }

}
