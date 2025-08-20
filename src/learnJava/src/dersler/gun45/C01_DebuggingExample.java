package learnJava.src.dersler.gun45;

public class C01_DebuggingExample {
    public static void main(String[] args) {
        //int[] numbers = {3, 5, 7, 2, 8}; // Örnek dizi
        int[] numbers = {-3, -5, -7, -2, -8}; // Örnek dizi
        int max = findMax(numbers);
        System.out.println("Dizideki en büyük sayı: " + max);
    }

    public static int findMax(int[] arr) {
        int max = 0; // Mantık hatası: max başlangıç değeri dizinin ilk elemanı olmalı
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
