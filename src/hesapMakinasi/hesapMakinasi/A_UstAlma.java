package hesapMakinasi.hesapMakinasi;

import java.util.Scanner;

public class A_UstAlma {

    // usAlma() isminde bir static method oluşturunuz
    // iki adet double parametre almalı ve return type void olmalı
    // ilk sayi üst alınacak say , ikinci sayı üs sayisi
    // işlem sonucunu yazdırmalı
    // işlem sonucunu yazdırdıktan sonra tekar menu() methodunu çağırmalı.

    public static void usAlma(double taban , double us) {

        double sonuc = Math.pow(taban, us);
        System.out.println("Sonuç: " + sonuc);

    }
}
