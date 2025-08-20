package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
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
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            System.out.println("getSum(list) = " + getSum(list));
        }

    public static int getSum(ArrayList<Integer> list) {
        int sum=0;
            for (Integer i  : list) {
                sum+=i;

            }
            return sum;
    }
}
