package learnJava.src.dersler.gun44;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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


        HashMap<Object, Object> intint = new HashMap<>();
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(3);
        deq.addFirst(2);
        deq.addLast(5);
        deq.addLast(1);
        System.out.println("deq = " + deq);
        deq.remove();
        System.out.println("deq = " + deq);

        Queue<Integer> que=new LinkedList<>();
        que.add(30);
        que.add(3);
        System.out.println("que = " + que);
        que.remove();
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        que.offer(200);
        System.out.println("que = " + que);
        que.add(200);
        System.out.println("que = " + que);
        Set<Integer> setQ = new TreeSet<>();
        setQ.addAll(que);
        System.out.println("setQ = " + setQ);
        Queue<Integer> setQ2 =new ArrayBlockingQueue<>(3);


    }

}
