package hesapMakinasi.multiArrays.fatma;

public class Soru2 {
    /*
 SORU 2 -->
 Bir 3x3 tam sayı matrisi oluşturun ve tüm elemanların toplamını bulun.
 Örnek Matris
 1 2 3
 4 5 6
 7 8 9
 */
    public static int[][] cozum2(){
        int matris[][] = new int[3][3];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j]=i+j+1;
            }

        }
        return matris;
    }
}
