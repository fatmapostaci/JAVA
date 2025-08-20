package hesapMakinasi.multiArrays.fatma;

import java.util.Scanner;

public class Soru3 {
    /*
SORU 3 -->
Kullanıcıdan 4x4 bir matris girmesini isteyin.
Girilen matristen bir satır numarası alın ve o satırın toplamını hesaplayın.
Not: Satır numarası 1'den başlayarak alınmalıdır
*/
    public static void cevap3(){
        Scanner scanf = new Scanner(System.in);
        int [][] matris = new int[4][4];
        int [] satirToplam= new int[4];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print("Matrisin ["+(i+1) +"]["+(j+1)+"] nolu değerini girin: ") ;
                matris[i][j] = scanf.nextInt();
                satirToplam[i]+=matris[i][j];
            }
        }
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.printf("%2d" , matris[i][j]);
            }
            System.out.println();
        }
                System.out.println("Toplamını bulmak istediğiniz satırı girin : ");
        int satir = scanf.nextInt();
        System.out.println("satırın toplamı = " + satirToplam[ satir-1 ]);
    }
}
