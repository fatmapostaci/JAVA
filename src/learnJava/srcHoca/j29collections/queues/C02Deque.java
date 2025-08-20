package learnJava.srcHoca.j29collections.queues;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02Deque {
            /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
        LİFO : Last in First out -> metrobuse son binen ilk iner :)
         */

    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));

        //deque yazdırma
        System.out.println("dq1 = " + dq1);

        // eleman ekleme:
        dq1.add("javaNAZ");
        dq1.addFirst("javaNAZLI");
        dq1.addLast("javaNAZAR");

        System.out.println("dq1.peek() = " + dq1.peek());
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());

        dq1.clear();
        System.out.println("dq1.peek() = " + dq1.peek());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);

        Deque<String> dq2 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        System.out.println("dq2.poll() = " + dq2.poll());
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        dq2.clear();
        System.out.println("dq2.poll() = " + dq2.poll());
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
        //System.out.println("dq2.removeLast() = " + dq2.removeLast()); NoSuchElementException

        System.out.println("dq2 = " + dq2);


    }

}
