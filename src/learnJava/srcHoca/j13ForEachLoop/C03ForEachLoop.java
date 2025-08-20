package learnJava.srcHoca.j13ForEachLoop;

public class C03ForEachLoop {

    public static void main(String[] args) {
        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int arr[][] = {
                {2, 3},// 0. kat
                {4}, // 1. kat
                {5, 6, 7} // 2. kat
       };
        //    {{2, 3},{4},{5, 6, 7}}

        int carpim = 1;
        for (int[] icArr : arr ){
            for (int num:icArr){
                carpim *=num;
            }
        }

        System.out.println("carpim = " + carpim);


    }
}
