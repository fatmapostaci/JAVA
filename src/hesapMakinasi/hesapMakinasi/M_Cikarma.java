package hesapMakinasi.hesapMakinasi;

import static hesapMakinasi.Mls_Menu.menu;

public class M_Cikarma {

    // cikarma() isminde bir static method oluşturunuz
    // iki adet double parametre almalı return type void olmalı
    // işlem sonucunu yazdırmalı
    // işlem sonucunu yazdırdıktan sonra tekar menu() methodunu çağırmalı.

    public static void cikarma(double a, double b) {

        double sonuc = a - b;

        System.out.println("Cikarma isleminin sonucu: " + sonuc);

        menu();
    }

}
