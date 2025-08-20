package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev3 {
    /*
    TASK->
Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print
eden code create ediniz
Ornek : Input : 8
Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
            */
    public static void main(String[] args) {

       // LocalDate date = LocalDate.now();
        //System.out.println("date = " + date);

        System.out.print("Merhabalar.Günde kaç saat uyuduğunuzu girin: ");

        Scanner scan = new Scanner(System.in);

        int saat = scan.nextInt();
        int ay = saat*30/24; // ayda kaç gün uyuduğunu hesaplar
        int yil = ay*12 ; // yılda kaç gün uyuduğunu hesaplar
        int kirkYil = yil * 40 ; // 40 yılda kaç gün uyuduğunu hesaplar
        System.out.printf("Ayda  %d, yılda %d, 40 yılda %d gününüz uykuda geçiyor" , ay, yil, kirkYil);
    }
}
