package learnJava.srcHoca.j06_switchstatement;

import java.util.Scanner;

public class C02_SwitchStatement {
    // Task-> Girilen ay numarasına göre ayın isimini print eden code create ediniz.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz...");
        byte ay = input.nextByte();

        switch (ay) {
            default: // Case ler arasında verilen değerler yoksa defaulf code bloğu çalışır.
                System.out.println("Geçerli ay numarası giriniz...");
                break;
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Şubat");
                break;
            case 11 :
                System.out.println("Kasım");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayıs");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Ağustos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 12 :
                System.out.println("Aralık");
                break;


        }
    }
}
