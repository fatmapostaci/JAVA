package learnJava.src.dersler.gun24.HW;

import java.util.ArrayList;
import java.util.List;

public class hw2
{
     /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
     public static void main(String[] args) {
         ArrayList<Integer> sayilar = new ArrayList<>(List.of(1,2,3,4,5));
         System.out.println("getSum(sayilar) = " + getSum(sayilar));
     }
     public static int getSum(ArrayList<Integer> sayilar){
        int toplam=0;
         for (int i = 0; i < sayilar.size(); i++) {
             toplam+=sayilar.get(i);
         }
         return toplam;
     }
}
