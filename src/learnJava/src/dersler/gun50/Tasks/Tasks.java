package learnJava.src.dersler.gun50.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));


        System.out.println("***Task01****");
        //task 01->  "Structured Programming"--> Amaele Programming kullanarak list elemanlarını
        // aynı satırda aralarında bosluk olacak şekilde print ediniz.
       printListWithStructuredProgramming(sayiList);


        System.out.println("\n***Task02****");
        //task 02->  "Functional Programming"--> CINCIX Programming kullanarak list elemanlarını
        // aynı satırda aralarında bosluk olacak şekilde print ediniz.
        printListWithFunctionalProgramming(sayiList);



        System.out.println("\n***Task03****");
        printListWithFunctionalProgramming2(sayiList);


        System.out.println("\n***Task04****");
        }



    private static void printListWithFunctionalProgramming2(List<Integer> sayiList) {
        sayiList.
                stream().
                forEach( System.out :: print );
    }
    private static void printListWithFunctionalProgramming(List<Integer> sayiList) {
        sayiList.stream().forEach( t -> System.out.print( t + " ") );
    }

    private static void printListWithStructuredProgramming(List<Integer> sayiList) {

        for(Integer w : sayiList)
            System.out.print(" " + w);
    }
}
