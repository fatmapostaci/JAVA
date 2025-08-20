package learnJava.srcHoca.j08_loops.L02whileloop.Tasks;

import java.util.Scanner;

public class Task01tugbaHanım {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini
        // ve toplamını print eden code create edinz

        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz sayiyi girin");
        toplam = scan.nextInt();

        int sayac=1;

        while((toplam <=333)){
            System.out.println("Bir sayi daha girin");
            int sayi = scan.nextInt();

            toplam+= sayi;
            sayac++;
        }
        System.out.println(sayac+" adet sayi girdiniz ve girdiginiz sayilarin toplami: "+toplam);


    }
}
