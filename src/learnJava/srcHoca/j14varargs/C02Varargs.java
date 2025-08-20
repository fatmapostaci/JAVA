package learnJava.srcHoca.j14varargs;

public class C02Varargs {

    public static void main(String[] args) {
        int arr[] = {10, 11, 36, 14, 41, 77, 46, 61, 20};
        // task01-> verilen arr elamanlarını toplamını döndüren METHOD create ediniz.
        int toplam = toplaArr(arr);
        System.out.println("arrayin toplamı = " + toplam);

        // task02-> task01 execute(run) eden varargs  METHOD create ediniz.
        int toplam2 = toplaVararg(arr);
        System.out.println("arrayin vararg ile toplamı = " + toplam);

    }
    private static int toplaArr( int[] brr ){
        int sum =0;
        for (int num :brr){
            sum +=num;
        }
        return sum;
    }
    private static int toplaVararg( int ... brr ){
        int sum =0;
        for (int num :brr){
            sum +=num;
        }
        return sum;
    }
}
