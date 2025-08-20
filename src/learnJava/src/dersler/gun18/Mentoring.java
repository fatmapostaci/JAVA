package learnJava.src.dersler.gun18;


import java.time.LocalDate;
import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        Character c = new Character('a');
        System.out.println("c.compareTo('a') = " + c.compareTo('a'));
        char c1 = 'a';
        if (c1==c){
            System.out.println("true");
        }
        short a = 32;
        short d = 32767;
        System.out.println("d = " + d);

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğumyılını girin:");
        yasHesapla(scan.next());
        System.out.print("Kelime girin:");
        kelimeYazdır(scan.next());

    }
    // Senaryo 1 : Yaş Hesaplama
// Soru : Doğum yılını kullanıcıdan alarak yaşı hesaplayan bir metot oluşturun
    public static void yasHesapla(String yil){
        int dogumyili = Integer.parseInt(yil.replaceAll("\\W",""));
        int yas = LocalDate.now().getYear()-dogumyili;
        System.out.println("Yaş = " + yas);

    }
    // Senaryo 2 : Bir Kelimeyi Üç Kere Yazdırma
// Soru : Kullanıcıdan alınan bir kelimeyi  üç kez ekrana yazdıran bir metot yazın.

    public static void kelimeYazdır(String kelime) {
        System.out.println(kelime.repeat(3));
    }
}
