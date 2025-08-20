package learnJava.srcHoca.j11arrays;

public class C08MDArrays {
    //Task-> int arr[][]={
    //                {3,5},//0. kat
    //                {12,13,15},//1. kat
    //                {103,107,111,121},//2. kat
    //        };
    //        array elamanları toplamını print eden code create ediniz.

    public static void main(String[] args) {
        int [][]arr = {
            {3,5},  // 0. kat
            {12,13,15}, // 1. kat
            {103,107,111,121}  // 2. kat
        };
        int sum =0;

        for (int kat = 0; kat < 3 ; kat++){
            for (int daire=0; daire < arr[kat].length; daire++){
                sum+= arr[kat][daire];
            }
        }

        System.out.println("Toplam = " + sum);
    }
}
