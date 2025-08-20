package learnJava.src.dersler.gun42.Mentoring;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasks {

    public static void main(String[] args) {

        ///* Soru: Bir ArrayList içerisinde bazı meyve isimleri bulunmaktadır.
        //       Iterator kullanarak listeyi ekrana yazdırın.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        {
 /*
    Soru: Bir ArrayList içerisinde verilen tam sayıların sadece çift olanlarını ekrana yazdırın.
    */
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(15);
            numbers.add(20);
            numbers.add(25);
            Iterator<Integer> itrInt = numbers.iterator();

            while (itrInt.hasNext()) {

                Integer number = itrInt.next();
                if (number % 2 != 0) {
                    itrInt.remove();
                }
            }
            System.out.println(numbers);
        }
        /*
    Soru: Bir ArrayList içerisindeki kelimelerden "a" harfi içerenleri silin.

    */
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("Scala");

        Iterator<String> itrStr = words.iterator();

        while (itrStr.hasNext()) {

            String tempString = itrStr.next();
            if (tempString.contains("a")) {
                itrStr.remove();
            }
        }
        System.out.println(words);

        {
         /*
    Soru: Bir list içinde verilen tam sayıların toplamını Iterator kullanarak hesaplayın
     */
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(10);
            numbers.add(15);
            numbers.add(20);
        }
        {
 /*Soru:
      Bir ArrayList içinde verilen tam sayılardan:
      Tek olanları silin.
      Kalan sayıların toplamını ekrana yazdırın.
     */
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(12);
            numbers.add(7);
            numbers.add(9);
            numbers.add(18);
            numbers.add(5);
            numbers.add(22);

            Iterator<Integer> itrInt = numbers.iterator();
            while (itrInt.hasNext()){
                Integer tempInt = itrInt.next();
                if(tempInt%2==1)
                    itrInt.remove();
            }
            System.out.println(numbers);

            Iterator<Integer> itrSum = numbers.iterator();
            Integer sum=0;
            while (itrSum.hasNext()){
                sum+= itrSum.next();
            }
            System.out.println("sum = " + sum);
        }
    }
}
