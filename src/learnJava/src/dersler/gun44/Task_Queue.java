package learnJava.src.dersler.gun44;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Task_Queue {
    /*
Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Const seçimine göre queue obj özellikleri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir.
*/
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));

        System.out.println("q1 = " + q1);

        q1.add("javaDeniz");
        //peek()
        System.out.println("q1.peek() = " + q1.peek());

        System.out.println("q1.element() = " + q1.element()); //ilk elemanı çağırır


        Queue<String>  q2 = new LinkedList<>();  //???
        System.out.println("q2.peek() = " + q2.peek());
        //System.out.println("q2.element() = " + q2.element());

        System.out.println("q1.remove() = " + q1.remove());


        System.out.println("q2.remove() = " + q2.remove());  //silemezse exception atar

        q1.offer("javaNaz");
    }

}
