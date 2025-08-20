package learnJava.srcHoca.j06_switchstatement;

import java.util.Scanner;

public class C04_SwitchStatement {
// Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz...");
        byte ayNo = input.nextByte();

        switch (ayNo){
            case 12,1,2:  // JDK 14 ve sonrasında case 12,1,2 şeklinde kullanıma izin verildi --> Best practice
                System.out.println("Kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar Mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;

            default:
                System.out.println("Geçerli ay numarası giriniz...");

        }
}
}
