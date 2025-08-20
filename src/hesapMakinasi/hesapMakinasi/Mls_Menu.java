package hesapMakinasi.hesapMakinasi;

import hesapMakinasi.TryCatch;

import java.util.Scanner;

import static hesapMakinasi.A_UstAlma.usAlma;
import static hesapMakinasi.F_Bolme.bolme;
import static hesapMakinasi.M_Cikarma.cikarma;
import static hesapMakinasi.Mr_Carpma.carpma;
import static hesapMakinasi.T_Toplama.toplama;


public class Mls_Menu {

    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);



    public static void menu() {

        System.out.println(G + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-TOPLAMA       |            | 2-CIKARMA         |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-CARPMA        |            | 4-BOLME           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-MOD           |            | 6-KOK ALMA        |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 7-US ALMA       |            | 8-CIKIS            |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int sec = TryCatch.intGirisi();


        double sayi1 = 0;
        double sayi2 = 0;

        if(sec!=8){
            System.out.println("Islem yapilacak sayilari giriniz : ");
            sayi1 = scan.nextDouble();
            sayi2 = scan.nextDouble();
        }


        switch (sec) {
            case 1:
                toplama(sayi1 , sayi2);
                break;
            case 2:
                cikarma(sayi1 , sayi2);
                break;
            case 3:
                carpma(sayi1 , sayi2);
                break;
            case 4:
                bolme(sayi1 , sayi2);
                break;
            case 5:
                //mod(sayi1 , sayi2);
                break;
            case 6:
                //kokAlma(sayi1 , sayi2);
                break;
            case 7:
                usAlma(sayi1 , sayi2);
                break;
            case 8:
                System.out.println("İşleminiz sona erdi");
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                menu();

        }


    }


}
