package hesapMakinasi.ArraysQuestions;

import static ArraysQuestions.CountNumber.countNumber;
import static ArraysQuestions.MinArr.minArr;
import static ArraysQuestions.RepeatCountArr.repeatCountArr;
import static ArraysQuestions.writeOddEven_Mertay_Changes.writeOddEven;
import static ArraysQuestions.zeroCountAzize.zeroCount;

public class Runner {
    public static void main(String[] args) {

        int[] arr = {5, 45, 78, 1, 5, 6, 2, 3, 0, 0, 1, 4, 5, 78};

        // Array'deki tüm elemanların toplamını bulun ve ekrana yazdırın. --> Sengul
        System.out.println("Array'deki tum elemanlarin toplami  ");
        // arrSum(arr);

        // Array içinde kaç tane 0 olduğunu bulun ve ekrana yazdırın. --> Azize
        System.out.println("Array içindeki 0 sayisi ");
        zeroCount(arr);

        // Kullanıcıdan bir sayı alın ve bu sayının array içinde kaç kez geçtiğini bulun. --> Tugba
        System.out.println("Arrayde kullanicinin istedigi sayinin adedi ");
        countNumber(arr);

        // Array içindeki en büyük  elemanı bulun ve ekrana yazdırın --> Rabia
        System.out.println("Array içindeki en büyük  eleman");
         //maxArr(arr);

        // Array içindeki en küçük elemanı bulun ve ekrana yazdırın  --> Mehmet
        System.out.println("Array içindeki en küçük eleman");
         minArr(arr);

        // Array içinde birden fazla kez geçen elemanları ve bunların kaç kez geçtiğini bulun. --> Fatma
        System.out.println("Array içinde birden fazla kez geçen elemanlar ve adetleri");
         repeatCountArr(arr);

        // Array'deki tek sayıları ve çift sayıları ayrı ayrı yazdırın. --> Mertay
        System.out.println("Array'deki tek sayilar ve cift sayilar");
        writeOddEven(arr);

    }
}
