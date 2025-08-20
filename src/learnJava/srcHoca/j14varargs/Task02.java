package learnJava.srcHoca.j14varargs;

public class Task02 {
    /*
        Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */

    public static void main(String[] args) {
        int sonuc = toplamaVeCarpma(3, 1, 2, 4, 5, 3);
        System.out.println("calculate() = " + calculate(3, 1, 2, 4, 5, 3));
        System.out.println("Sonuc : " + sonuc);
    }

    public static int toplamaVeCarpma(int... numbers) {

        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return numbers[0] * (toplam - numbers[0]);
    }
    private static int calculate(int multiplier, int... numbers) {

        int sum = 0;
        for (Integer value : numbers) {
            sum += value;
        }
        return sum * multiplier;
    }

}
