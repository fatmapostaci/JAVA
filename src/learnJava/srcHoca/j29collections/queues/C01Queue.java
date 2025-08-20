package learnJava.srcHoca.j29collections.queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C01Queue {
        /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Const seçimine göre queue obj özellikleri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir.
       */

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        Queue<String> q3 = new ArrayBlockingQueue<>(3); // 3 eleman sınırlamasıyla bir queue oluşturuldu
        q3.offer("12");
        q3.offer("13");
        q3.offer("14");
        System.out.println("q3.offer(\"15\") = " + q3.offer("15"));
        //q3.add("21");
        System.out.println("q3 = " + q3);

        // ahan da Trick kösesinde bugun : offer()-> queue coll. eleman eklemek için kullanılır.
        // queue'de eleman kısıtlaması varsa add() meth. rte fırlatırken offer() true-false return eder.

        // Queue nasıl "yazdırılır
        System.out.println("q1 = " + q1);

        // Eleman ekleme
        q1.add("javaDENIZ"); // ekleyemez ise exeption atar
        q1.offer("javaNAZ"); // ekleyemez ise false döndürür.

        // peek()  // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        System.out.println("q1.peek() = " + q1.peek());

        // element() // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println("q1.element() = " + q1.element());

        Queue<String> q2 = new LinkedList<>(Arrays.asList());
        System.out.println("q2.peek() = " + q2.peek()); // null
        //System.out.println("q2.element() = " + q2.element()); // NoSuchElementException

        // eleman silme:

        //remove()      // Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        //                             // [javaCAN, javİDAN, jaVİYE, javaSU, javaHAN, javaZADE, javaDENIZ]
        System.out.println("q1.remove() = " + q1.remove()); // javaCAN
        // [javİDAN, jaVİYE, javaSU, javaHAN, javaZADE, javaDENIZ]
        //System.out.println("q2.remove() = " + q2.remove()); // NoSuchElementException

        // poll() : // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q2.poll() = " + q2.poll()); // null

/*
     peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
     poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
     element() -> ilk elemanı silmeden return eder.
     remove() -> ilk elemanı siler ve return eder.. :kaldırma

    ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
    poll ise null return eder.
   */


        System.out.println("q1 = " + q1);


    }
}
