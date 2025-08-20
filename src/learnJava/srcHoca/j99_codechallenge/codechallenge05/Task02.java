package learnJava.srcHoca.j99_codechallenge.codechallenge05;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
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

    static int getSum(ArrayList<Integer> arr ){
        int sum =0;
        for (int num:arr){
            sum +=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayim = new ArrayList<>();
        arrayim.add(1);
        arrayim.add(2);
        arrayim.add(3);
        arrayim.add(4);
        arrayim.add(5);

        int toplam = getSum(arrayim);
        System.out.println("toplam = " + toplam);
    }
}
