package learnJava.srcHoca.j29collections.lists;

import J27interface.Tasks.Task02.Tesla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03LinkedList03 {
    public static LinkedList<String> linkedList = new LinkedList<>(List.of("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan","acıl antep tava", "şaşlık"));

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(List.of("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan", "acıl antep tava", "şaşlık"));

        // How to remove nodes
        String removedNode = linkedList.remove();  // [göveç, soğan kebap, ankara doner, kuzu gerdan, acıl antep tava, şaşlık]
        System.out.println("removedNode = " + removedNode); // küşleme

        linkedList.remove("göveç"); // [soğan kebap, ankara doner, kuzu gerdan, acıl antep tava, şaşlık]

        linkedList.remove(1); // [soğan kebap, kuzu gerdan, acıl antep tava, şaşlık]

        linkedList.removeLast(); // [soğan kebap, kuzu gerdan, acıl antep tava]

        linkedList.removeFirstOccurrence("soğan kebap"); // [kuzu gerdan, acıl antep tava]

        linkedList.clear(); // []

        linkedList.addAll(arrList);
        LinkedList<String> yeniList = new LinkedList<>(List.of("küşleme", "göveç", "soğan kebap"));

        linkedList.removeAll(yeniList); // [ankara doner, kuzu gerdan, acıl antep tava, şaşlık]
        System.out.println("linkedList = " + linkedList);

        // Node arama
        System.out.println("linkedList.get(1) = " + linkedList.get(1)); // kuzu gerdan
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst()); // ankara doner
        System.out.println("linkedList.getLast() = " + linkedList.getLast()); // şaşlık

        LinkedList<Integer> sayiList=new LinkedList<>(Arrays.asList(1,2,5,6,54,67));
        System.out.println("sayiList.remove(5) = " + sayiList.remove(5));//67
        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException

        System.out.println("sayiList.remove(sayiList.indexOf(5))) = " + sayiList.remove(sayiList.indexOf(5)));//5




    }
}
