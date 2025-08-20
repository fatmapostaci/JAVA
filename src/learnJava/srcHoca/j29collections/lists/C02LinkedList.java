package learnJava.srcHoca.j29collections.lists;


import java.util.LinkedList;

public class C02LinkedList {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        // ahan da Trick köşesinde böğün -> BAD PRACTICE--> app.  çoooğ yavaşlatır
        list.add(12);
        list.add("String");
        list.add('&');
        list.add(true);

        System.out.println("list = " + list);


    }
}
