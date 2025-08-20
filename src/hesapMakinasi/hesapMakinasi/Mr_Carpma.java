package hesapMakinasi.hesapMakinasi;

import static hesapMakinasi.Mls_Menu.menu;

public class Mr_Carpma {

    // carpma() isminde bir static method oluşturunuz
    // iki adet double parametre almalı ve return Tyoe void olmalı
    // işlem sonucunu yazdırmalı
    // işlem sonucunu yazdırdıktan sonra tekar menu() methodunu çağırmalı.

    public static void carpma(double a, double b) {
        double sum = a * b;
        System.out.println(sum);
        menu();
    }
}
