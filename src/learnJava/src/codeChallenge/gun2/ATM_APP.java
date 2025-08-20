package learnJava.src.codeChallenge.gun2;

import com.sun.source.tree.YieldTree;

import java.util.MissingResourceException;
import java.util.Scanner;

public class ATM_APP {
    /*
TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
*/
    //static Scanner scanf = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean cikis = false;
        double bakiye = 1000;//$
        do {
            System.out.print("________________________________________\n" +
                    "LUTFEN YAPMAK ISTEDIĞINIZ İŞLEMİ SEÇİNİZ \n" +
                    "1. BAKİYE ÖĞRENME \n" +
                    "2. PARA ÇEKME \n" +
                    "3. PARA YATIRMA \n" +
                    "4. ÇIKIŞ \n" +
                    "________________________________________\n" +
                    "SEÇİM:");

            try {
                Scanner scanf = new Scanner(System.in);
                int selection = scanf.nextInt();
                switch (selection) {
                    case 1:
                        bakiye_ogrenme(bakiye);
                        break;
                    case 2:
                        bakiye = para_cekme(bakiye, scanf);
                        break;
                    case 3:
                        bakiye = para_yatirma(bakiye, scanf);
                        break;
                    case 4:
                        cikis = cikis_islemi(cikis);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("HATA");
            }

        } while (!cikis);
    }

    public static void bakiye_ogrenme(double bakiye) {
        System.out.printf("HESAP BAKİYENİZ  :    %.2f  TL  \n", bakiye);
    }

    public static double para_cekme(double bakiye, Scanner scanf) {

        try {
            System.out.print("PARA ÇEKMEK İÇİN SEÇİMİNİZİ YAPINIZ \n" +
                    " 1 -> 100  TL \n" +
                    " 2 -> 200  TL \n" +
                    " 3 -> 500  TL \n" +
                    " 4 -> TUTAR GİRİN \n" +
                    "SEÇİM: ");
            int secenek = scanf.nextInt();
            int cekilecek_tutar = switch (secenek) {
                case 1 -> 100;
                case 2 -> 200;
                case 3 -> 500;
                case 4 -> {
                    System.out.print("Çekilecek tutarı girin: ");
                    yield scanf.nextInt();
                }
                default -> {
                    System.out.println("HATALI GİRDİ");
                    yield 0;
                }

            };
            bakiye = bakiye - cekilecek_tutar;
            System.out.println("Hesabınızdan " + cekilecek_tutar + " TL para çekilmiştir ");
//                "KALAN BAKİYE:  " + bakiye + "  TL ");
        } catch (Exception e) {
            System.out.println("Para çekilemedi");
        }
        return bakiye;
    }

    public static double para_yatirma(double bakiye, Scanner scanf) {

        try {
            System.out.print("Para yatırmak istediğiniz tutarı girin: ");
            double yatirilacak_tutar = scanf.nextDouble();
            bakiye += yatirilacak_tutar;
            System.out.println("Hesabınıza " + yatirilacak_tutar + " TL para yatırılmıştır ");
            //   "GUNCEL BAKİYE:  " + bakiye + "  TL ");

        } catch (Exception e) {
            System.out.println("Para yatırılamadı");
        }
        return bakiye;
    }

    public static boolean cikis_islemi(boolean cikis) {
        System.out.println("GUVENLE ÇIKIŞ YAPILDI \n Kartınızı almak için lütfen bekleyin...");
        return cikis = true;
    }


}
