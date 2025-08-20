package learnJava.src.dersler.gun25;

import java.util.ArrayList;
import java.util.List;

public class Mentoring {
    // Bir veya birden fazla  method yazarak,  istediğiniz kadar array gönderin ve
// gönderilen arraylerin toplamı en büyük olanını bulun
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(12, 34, 56, 33, 45, 67, 88, 65, 55, 67, 55));
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(34, 56, 33, 45, 34, 56));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(67, 88, 65, 55));

        varargSumMethod(arrayList);

        // Diziler
        int[] arr = {12, 34, 56, 33, 45, 67, 88, 65, 55, 67, 55};
        int[] arr1 = {34, 56, 33, 45, 34, 56};
        int[] arr2 = {67, 88, 65, 55};

        varargSumMethod(arr);
        System.out.println();
        varargSumMethod(arr,arr1);
        System.out.println();
        varargSumMethod(arr,arr1,arr2);

        varargPrintMethod(arr);
        System.out.println();
        varargPrintMethod(arr,arr1);
        System.out.println();
        varargPrintMethod(arr,arr1,arr2);
    }

    public static int sum(ArrayList<Integer> arr){
        int toplam=0;
        for (int i : arr) {
            toplam+=i;
        }
        return toplam;
    }
    public static int sum(int[] arr){
         int toplam=0;
        for (int i : arr) {
            toplam+=i;
        }
        return toplam;
    }

    @SafeVarargs
    public static void varargSumMethod(ArrayList<Integer>... arrayList) {
        for (ArrayList<Integer> i : arrayList){
            System.out.println("sum(i) = " + sum(i));
        }
    }
    public static void varargSumMethod(int[]...arr )
    {
        for (int[] i : arr) {
            System.out.println("sum(i) = " + sum(i));
        }

    }
    public static void varargPrintMethod(int[]... arr)
    {
        for (int[] i : arr)
        {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

}
