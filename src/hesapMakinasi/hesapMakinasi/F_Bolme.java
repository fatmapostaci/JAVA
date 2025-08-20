package hesapMakinasi.hesapMakinasi;

import static hesapMakinasi.Mls_Menu.menu;

public class F_Bolme {

    // bolme() isminde bir static method oluşturunuz
    // iki adet double parametre almalı ve return type void olmalı
    // işlem sonucunu yazdırmalı
    // işlem sonucunu yazdırdıktan sonra tekar menu() methodunu çağırmalı.
    public static void bolme(double a, double b){
        double bolum=0.0;
        if(a==0 || b==0)
            bolum= 0.0;
        else if (a>=b)
            bolum= a/b;
        else
            bolum= b/a;

        System.out.println("bolum = " + bolum);
        menu();
    }
    public static void bolme(int a, int b){
        int bolum=0;
        if(a==0 || b==0)
            bolum= 0;
        else if (a>=b)
            bolum= a/b;
        else
            bolum= b/a;

        System.out.println("bolum = " + bolum);
        menu();
    }
}
