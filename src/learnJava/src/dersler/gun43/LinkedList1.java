package learnJava.src.dersler.gun43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SplittableRandom;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(List.of("Küsleme", "Kebap","Ankara Tava","Ankara Tava","Alinazik","Doner","Ankara Tava"));
        LinkedList<String> clonedList = (LinkedList< String>) linkedList.clone();
        System.out.println("clonedList = " + clonedList);
        ArrayList<String> arrayList = new ArrayList<String> (linkedList);


        String removedNode = linkedList.remove();
        System.out.println("removedNode = " + removedNode);
        System.out.println("linkedList = " + linkedList);

        linkedList.remove("Alinazik");
        System.out.println("linkedList = " + linkedList);

        linkedList.remove(2);
        System.out.println("linkedList = " + linkedList);

        linkedList.removeFirst();
        System.out.println("linkedList = " + linkedList);
        linkedList.removeFirstOccurrence("Ankara Tava");
        linkedList.clear();

        System.out.println("arrayList = " + arrayList);
    }
}
