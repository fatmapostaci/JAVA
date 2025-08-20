package hesapMakinasi.multiArrays.fatma;

import java.util.Arrays;

public class Soru4 {
        /*
    SORU 4 -->
    5x5 bir matrisin en büyük ve en küçük elemanını bulun ve bunların
    matristeki yerlerini (satır ve sütun) yazdırın.
    Örnek Matris:

    10 20 30 40 50
    15 25 35 45 55
    5   8  9  12 14
    3   7  11 19 22
    4   6  18 29 33
    */
    static void cevap4() {
        int[][] matris = {{10, 20, 30, 40, 50},
                {15, 25, 35, 45, 55},
                {5, 8, 9, 12, 14},
                {3, 7, 11, 19, 22},
                {4, 6, 18, 29, 33}};

        int max=matris[0][0], min=matris[0][0];
        int max_i=0,max_j=0, min_i=0, min_j=0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j]>max) {
                    max = matris[i][j];
                    max_i = i;
                    max_j = j;
                }
                if(matris[i][j]<min){
                    min=matris[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        }
        System.out.printf("Maximum sayı: %d index: %d,%d \n", max,max_i,max_j);
        System.out.printf("Minimum sayı: %d index: %d,%d  \n", min,min_i,min_j);
        System.out.println(Arrays.deepToString(matris));
    }

}