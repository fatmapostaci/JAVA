package learnJava.srcHoca.j10_methodcreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü
    static int bakiye = 1000;
    static Scanner input = new Scanner(System.in);


    static void atmBasla(){
        System.out.println("Java Bank Uygulamamıza hoşgeldiniz :) ");
        anaMenu();
    }

    static void anaMenu(){
        anaMenuEkranı();
        int secim = kullaniciSeciminiAl();
        switch (secim){
            case 1:
                bakiyeSorgulama();
                anaMenu(); // Bakiye sorgusundan sonra uygulamayı tekrar başlatıyoruz
                break;
            case 2:
                paraYatirma();
                anaMenu(); // Bakiye sorgusundan sonra uygulamayı tekrar başlatıyoruz
                break;
            case 3:
                paraCekme();
                anaMenu(); // Bakiye sorgusundan sonra uygulamayı tekrar başlatıyoruz
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Yanlış tercihte bulundunuz tekrar deneyin");
                anaMenu(); // Bakiye sorgusundan sonra uygulamayı tekrar başlatıyoruz
        }

    }

    static void anaMenuEkranı(){
        System.out.println("*********************** Ana Ekran ********************");
        System.out.println("""
                Lütfen yapmak istediğiniz işlemi seçiniz:
                1:  Bakiya Sorgulama
                2:  Para Yatırma
                3:  Para Çekme
                0:  Çıkış
                """);
        System.out.println("******************************************************");

    }
    static int kullaniciSeciminiAl(){
        System.out.println("Lütfen seçiminizi yapınız:");
        int secim = input.nextInt();
        return secim;
    }

    static void bakiyeSorgulama(){
        System.out.println();
        System.out.println();
        System.out.println("---------------- Bakiye Sorgusu -----------------");
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("---------------- --------------- -----------------");
        System.out.println();
        System.out.println();

    }

    static void paraYatirma(){
        System.out.println();
        System.out.println();
        System.out.println("---------------- Para Yatırma -----------------");
        int yatanPara = miktarAl();
        if (yatanPara > 0){
            bakiye +=yatanPara;
            System.out.println("Başarılı işlem aktif bakiyeniz =  "+ bakiye);

        } else {
            System.out.println("Yanlış değer girdiniz");
        }
        System.out.println("---------------- --------------- -----------------");
        System.out.println();
        System.out.println();

    }

    static void paraCekme(){
        System.out.println();
        System.out.println();
        System.out.println("---------------- Para Cekme -----------------");
        int cekilenPara = miktarAl();
        if (cekilenPara > 0 && cekilenPara<bakiye){
            bakiye -=cekilenPara;
            System.out.println("Başarılı işlem aktif bakiyeniz =  "+ bakiye);
        } else {
            System.out.println("Yanlış değer girdiniz");
        }
        System.out.println("---------------- --------------- -----------------");
        System.out.println();
        System.out.println();

    }
    static int miktarAl(){
        System.out.println("Lütfen miktarı giriniz:");
        int secim = input.nextInt();
        return secim;
    }

    static void cikis() {

        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
    }
 }
