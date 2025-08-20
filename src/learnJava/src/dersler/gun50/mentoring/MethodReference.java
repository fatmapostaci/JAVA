package learnJava.src.dersler.gun50.mentoring;

import java.util.Random;
import java.util.function.Supplier;

public class MethodReference {

    public static Integer ucEkle(Integer t) {

        return t + 3;

    }

    public static Integer kareKokAl(Integer i) {

        return (int) Math.sqrt(i);
    }

    public static Integer yediAzalt(Integer i){

        return i-7;
    }

    public static <T> void printWithSpaces(T t ){
        System.out.print(t+" ");
    }
    public static Integer addRandomNumber(Integer i){
        int random = (new Random()).nextInt(10)+1;
        return i+ random;
    }
    public static Integer subtractRandomNumber(Integer i){
        int random = (new Random()).nextInt(10)+1;
        return i-random;
    }

}
