package learnJava.src.dersler.gun25;

public class Tasks {
    public static void main(String[] args) {
        int arr[][]= {
                {2,3,4,},
                {3,4},
                {4,5,6,3,}
        };
        for(int[] i : arr){
            for ( int j : i){
                System.out.printf("%2d",j );
            }
            System.out.println();
        }

    }
}
