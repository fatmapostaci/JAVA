package hesapMakinasi.ArraysQuestions;

public class writeOddEven_Mertay_Changes {
    // Array'deki tek sayıları ve çift sayıları ayrı ayrı yazdırın.
    static void writeOddEven(int [] a) {
        int[] arr = {5, 45, 78, 1, 5, 6, 2, 3, 0, 0, 1, 4, 5, 78};

        int i;
        for (i= 0; i < arr.length;i++){
            System.out.println("Çift Sayılar");
            if (i%2==0){
                System.out.println(arr[i]);
            }
            else {
                System.out.print("Tek sayılar = " + arr[i]);
            }
        }
    }

}




