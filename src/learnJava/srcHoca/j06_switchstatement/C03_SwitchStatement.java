package learnJava.srcHoca.j06_switchstatement;

import java.util.Scanner;

public class C03_SwitchStatement {
    // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz...");
        byte ayNo = input.nextByte();
        int numOfDays =0;
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDays = 31;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                numOfDays = 30;
                break;
            case 2 :
                System.out.println(" Lütfen şu anki yılı yılı giriniz ");
                int year = input.nextInt();
                if (year % 4 == 0){
                    // 100 e bölünüyor mu?
                    if (year % 100 == 0) {
                        // 400 e bölünüyor mu?
                        if (year % 400 == 0){
                            System.out.println("Girdiğiniz değer artık yıldır");
                            numOfDays = 29;
                        } else {
                            System.out.println(" Girdiğiniz değer artık yıl değil");
                            numOfDays =28;
                        }
                    } else {
                        System.out.println("Girdiğiniz değer artık yıldır");
                        numOfDays = 29;
                    }

                } else {
                    // leap year değil
                    System.out.println(" Girdiğiniz değer artık yıl değil");
                    numOfDays = 28;
                }

        }
        System.out.println(ayNo + " numaralı ay " + numOfDays + " gün içerir");
    }
}
