package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

public class Task06 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

        for (int ilk = 1; ilk <11 ; ilk++ ){
            for (int ikinci = 1;ikinci < 11; ikinci++){
                System.out.println(ilk + " x " + ikinci + " = "+ (ilk*ikinci));
            }
            System.out.println();
        }
    }
}
