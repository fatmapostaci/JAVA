package learnJava.src.dersler.gun49_lambda.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Dummy {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        //structural programming lang   -> nasıl yapmalıyım?
        for(Integer num : nums){
            System.out.println(num + " ");
        }

        //functional programming lang   -> ne yapmalıyım?

        nums.forEach( num -> System.out.print(num + " "));
        nums.forEach(System.out::print);


        //yapısal programlama
        //nesne yönelimli programlama
        //jeneric programlama
        //fonksiyonel programlama

//fonksiyon ar
        Function<String, String[]> func = s -> { return s.split(" "); };

        String str = "Fatma Postacı iş hayatına dönüyor";
        System.out.println(Arrays.toString(func.apply(str)));


    }
}
