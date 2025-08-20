package learnJava.src.dersler.gun23.Kutuphane;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Senaryo 1: Kitap Kulübü Yönetimi
    // Bir kitap kulübünüz var. Üyelerin adlarını bir listeye eklemeniz,
    // bazı üyeleri çıkarmanız, belirli bir üyeyi kontrol etmeniz ve
    // alfabetik olarak sıralamanız gerekiyor.

    /*
     3 classdan oluşan biy yapı oluşturalım
     1--> Runner  --> Sadeye menu() methodunu çağıralım

     2--> Menu    --> Kullanıcıya yapmak istediği işlemleri soralım.
     -- Listeye üye ekleme (add)
     -- Listeden uye silme (remove)
     -- Uye kontrolu (contains)
     -- Sıralı tum uye listesi (sort and sout)
     -- çıkıs
     3--> Islemler  --> İlgili menu işlemlerinin methodları burada tutulacak.
    */
    static Scanner scan = new Scanner(System.in);

    public static void menu() {

        ArrayList<String> uyeler = new ArrayList<>();
        while (true) {
            System.out.println("\n"
                    + "   __________Menu__________         \n"
                    + "   | 1-Listeye üye ekle         \n"
                    + "   | 2-Listeden üye sil       \n"
                    + "   | 3-Uye kontrolü             \n"
                    + "   | 4-Sırala ve Listele        \n"
                    + "   | 5-Çıkış                    \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯         \n"
                    + "");

            System.out.print("ISLEM SECİNİZ : ");
            int sec = scan.nextInt(); //TryCatch.intGirisi();


            switch (sec) {
                case 1:
                    Islemler.uyeEkle(uyeler);
                    break;
                case 2:
                    Islemler.uyeSil(uyeler);
                    break;
                case 3:
                    Islemler.uyeKontrol(uyeler);
                    break;
                case 4:
                    Islemler.uyeleriSirala(uyeler);
                    break;
                case 5:
                    Islemler.cikis();
                    break;
                default:
                    System.out.println("Hatali deger girdiniz");
                    menu();
            }
            if (sec == 5) {
                break;
            }
        }
    }


}
