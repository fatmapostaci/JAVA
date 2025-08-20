package learnJava.srcHoca.j11arrays;

import java.util.Arrays;

public class C05ArraysEqual {

    public static void main(String[] args) {
        // Arrays.equals(arr1,arr2);-> girilen iki arrayin index ve eleman value kontrolu yapar true false return eder
        int [] arr1 = {23,13,8,97,64,91};
        int [] arr2 = {23,8,91,64,97,13};
        int [] arr3 = {23,8,91,64,97,13,55};

        System.out.println("Arrays.equals(arr1,arr3) = " + Arrays.equals(arr1, arr3)); // False
        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2)); // Aynı elemanlar farkklı dizildiği için False

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("After sorting arrays Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2)); // True

        // Arrayi Stringe çevirme:
        String array3Str = Arrays.toString(arr3);
        System.out.println("array3Str = " + array3Str);
        int istenenSayi = arr3[5];
        System.out.println("Arrayden istenen Sayi = " + istenenSayi);
        String istenenSayiStr = array3Str.substring(20,22);
        System.out.println("istenenSayiStr = " + istenenSayiStr);

    }
}
