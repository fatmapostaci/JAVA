package learnJava.src.dersler.gun50.mentoring;

public class HW_SeedMethods {

    public static <T>void printWithSpaces(T i){
        System.out.print(" " + i);
    }


    public static void printWithSpaces(Double d) {
        System.out.print(" " + d.intValue());
    }

    public static boolean isEven(Integer i){

        return i%2==0;
    }
}
