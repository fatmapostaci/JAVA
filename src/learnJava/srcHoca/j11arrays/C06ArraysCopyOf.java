package learnJava.srcHoca.j11arrays;

import java.util.Arrays;

public class C06ArraysCopyOf {

    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar
        int[] arr={2,15,13,5,65,49,38,33,55,27};
        int [] brr = Arrays.copyOf(arr,5);
        System.out.println("brr = " + Arrays.toString(brr));

        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...
        int [] sonUcElement =Arrays.copyOfRange(arr,arr.length-3,arr.length);
        System.out.println("sonUcElement = " + Arrays.toString(sonUcElement));

        //Arrayi belirli bir değer ile set-update (fill(value)) etme
        Arrays.fill(sonUcElement,10);
        System.out.println(" Update sonrası sonUcElement = " + Arrays.toString(sonUcElement));


        // task-> arr 3 ile 7 index arası(3-4-5-6) elamanları 35 ile update eden code create ediniz...

        Arrays.fill(arr,3,7,35);


        System.out.println(" arr = " + Arrays.toString(arr));
        System.out.println(" brr = " + Arrays.toString(brr));
        System.out.println(" sonUc = " + Arrays.toString(sonUcElement));


    }
}
