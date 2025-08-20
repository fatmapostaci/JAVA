package learnJava.srcHoca.j06_switchstatement;

import java.util.Scanner;

public class C01_SwitchStatement {
        /*
    Switch-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez.
    Bir app actionda sabit bir degeri çoklu durum ile karsilastirmak için switch-case blok kullanılır.
    Switch-case blok'da  degiskene göre bir çok durumdan değişkene uyan durum gerçeklesir.
    if statement blok ile  switch-case blok birlikte tanımlanabiir.
    çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
    Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

    ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
    Switch de sadece int, byte, short, char, String data type  kullanilabilir
    Eger 3 den fazla durum varsa switch() tercih edilir.
 */

    public static void main(String[] args) {
        // Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz.

        // If - else ile çözümü:
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int rakam = input.nextInt();
        System.out.print("Girdiğiniz sayı : " + rakam + " ve okunuşu = " );

        if (rakam == 0){
            System.out.println("Sıfır");

        } else if (rakam == 1){
            System.out.println("Bir");

        } else if (rakam == 2){
            System.out.println("İki");

        } else if (rakam == 3){
            System.out.println("Üç");

        } else if (rakam == 4){
            System.out.println("Dört");

        } else if (rakam == 5){
            System.out.println("Beş");

        } else if (rakam == 6){
            System.out.println("Altı");

        } else if (rakam == 7){
            System.out.println("Yedi");

        } else if (rakam == 8){
            System.out.println("Sekiz");

        } else if (rakam == 9){
            System.out.println("Dokuz");

        } else {
            System.out.println("Yanlış değer girdiniz");

        }

        switch (rakam) {
            case 0 :
                System.out.println("Sıfır");
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Yanlış veri girdiniz...");
        }
















    }
}
