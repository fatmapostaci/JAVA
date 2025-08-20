package learnJava.src.dersler.gun50.Tasks;

import java.util.Map;
import java.util.function.Predicate;

public class SeedMethods {

    public static  <T> void yazdir(T element){
        System.out.print(element);
    }

    public static boolean isEven(int number){
        return number%2==0;
    }

    public static boolean isPositive(int number){
        return number>0;
    }

    public static String toUpperCase(String s){

        return s.toUpperCase();
    }

    public static boolean checkLenght4 ( String s ){

        return s.length()>4;
    }


    public static boolean isEmpty ( String s ){
       return  !s.trim().isEmpty();
    }


    public static boolean isBiggerThan70(Map.Entry<String,Integer> entry){

        return entry.getValue()>70;
    }

    public static int karesiniAl(int number){
       return (int)Math.pow(number,2);
    }

    public  static int karekokAl(int number){
       return  (int)Math.sqrt(number);
    }


    public static int maxBul(int num1,int num2){

        return num1>num2 ? num1 : num2 ;

    }

    public static Predicate<Integer> predicateCiftMi = num -> num%2 == 0;
}
