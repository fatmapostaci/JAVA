package Diet;

import java.util.Scanner;

public class VucutKutlesiHesaplama {

    static Scanner scanner = new Scanner(System.in);

    double aktiviteSeviyesi() {
        System.out.println("===============================================================================\n" +
                "    *** Hareket / Aktivite seviyeleri ***\n" +
                "    1 - Masa basi is / cak az - Hareketsiz  = 1.2\n" +
                "    2 - Az Aktif / haftada 1-2 egzersiz     = 1.3\n" +
                "    3 - Orta Aktif / haftada 3-5 egzersiz   = 1.55\n" +
                "    4 - Cok aktif / haftada 6-7agir egzersiz= 1.7\n" +
                "    5 - Cok agir egzesiz agir is            = 1.9\n" +
                "    ===============================================================================");


        System.out.println("Aktivite seviyenizi menüden seçiniz");
        int seviye = scanner.nextInt();
        double Hs;
        switch (seviye) {
            case 1:
                Hs = 1.2;
                break;
            case 2:
                Hs = 1.3;
                break;
            case 3:
                Hs = 1.55;
                break;
            case 4:
                Hs = 1.7;
                break;
            case 5:
                Hs = 1.9;
                break;
            default:
                Hs = 0;
                break;

        }
        return Hs;
    }

    String cinsiyetBelirle() {
        System.out.println("cinsiyet giriniz (E/K)");
        String cinsiyet = scanner.next();
        return cinsiyet;
    }

    double boyBelirleme() {
        System.out.println("boyu giriniz");
        double boy = scanner.nextDouble();
        return boy * 100;
    }

    int yasBelirleme() {
        System.out.println("Yaşınızı giriniz");
        int yas = scanner.nextInt();
        return yas;
    }

    double kiloBelirleme() {
        System.out.println("kilonuzu belirtiniz");
        double kilo = scanner.nextDouble();
        return kilo;

    }

    double vucutKitleİndeksi(double kilo, double boy) {
        boy = boy / 100;
        double vucutKitleİndeksi = kilo / (boy * boy);
        return vucutKitleİndeksi;
    }

    double bazalMetobolizmaHizi(String cinsiyet, double kilo, double boy, int yas) {
        double BMH;
        if (cinsiyet.substring(0, 1).equalsIgnoreCase("E")) {
            BMH = 10 * kilo + 6.25 - 5 * yas + 5;
        } else if (cinsiyet.substring(0, 1).equalsIgnoreCase("K")) {
            BMH = 10 * kilo + 6.25 * boy - 5 * yas - 161;
        } else BMH = 0;

        return BMH;


    }

    double kaloriMiktariHesapla(double vucutKitleIndexi, double bazalMetabolizmaHizi, double hareketSeviyesi) {
        double kaloriMiktarı;

        if (vucutKitleIndexi < 25) {
            kaloriMiktarı = hareketSeviyesi * bazalMetabolizmaHizi;

        } else if (vucutKitleIndexi > 25) {
            kaloriMiktarı = bazalMetabolizmaHizi * hareketSeviyesi - 500;
            if (bazalMetabolizmaHizi < kaloriMiktarı) {
                kaloriMiktarı = bazalMetabolizmaHizi;
            }
        } else {
            kaloriMiktarı = 0;
        }
        return kaloriMiktarı;

    }
}
