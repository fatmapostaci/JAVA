package learnJava.src.dersler.gun44;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task_Deque {


    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        //deque yazdırma
        System.out.println("dq1 = " + dq1);

        //deque eleman ekleme sona ekler
        dq1.add("javaNaz");
        System.out.println("eleman ekleme dq1 = " + dq1);

        //deque başa eleman ekleme
        dq1.addFirst("javaNazlı");
        System.out.println("başa eleman ekleme dq1 = " + dq1);

        //peek ilk elemanı döndürür
        System.out.println("dq1.peek() = " + dq1.peek());
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());

        //peeklast ilk elemanı döndürür
        System.out.println("dq1.peekLast() = " + dq1.peekLast());

        //clear
        dq1.clear();
        System.out.println("dq1.peek() = " + dq1.peek());
        System.out.println("dq1 = " + dq1);

        Deque<String> dq2 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        System.out.println("dq2.poll() = " + dq2.poll());
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        dq2.clear();
        System.out.println("dq2.poll() = " + dq2.poll());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
       // System.out.println("dq2.removeLast() = " + dq2.remove());



    }
}
