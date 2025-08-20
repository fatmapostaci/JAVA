package hesapMakinasi.ArraysQuestions;

public class zeroCountAzize {
    public static void zeroCount(int[] arr ){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Array içindeki 0 sayısı: " + count);
    }
}
