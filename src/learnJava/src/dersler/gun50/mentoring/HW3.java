package learnJava.src.dersler.gun50.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class HW3 {
    public static void main(String[] args) {
        //  map() --> M E T H O D  R E F E R A N S  ile çözelim
        List<Integer> sayi = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));

        //  Listedeki tüm sayılara 1 ile 10 arası random bir sayı ekle ve aralarında boşluk olacak şekilde yazdır
        sayi.stream()
                .map(MethodReference::addRandomNumber)
                .forEach(MethodReference::printWithSpaces);

        //  Listedeki tüm sayılardan , 1 ile 10 arası random bir sayı çıkar
        //  METHOD REFERANS kullanarak aralarında boşluk olacak şekilde yazdırın
        sayi.stream()
                .map(MethodReference::subtractRandomNumber)
                .forEach(MethodReference::printWithSpaces);




    }
}
