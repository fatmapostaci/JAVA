package learnJava.srcHoca.j03_scannerclass_typecasting;


import java.util.Scanner;
import java.util.SortedMap;

public class C01_ScannerClass {

    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
    //Scanner Class'i Java nin util kutuphanesindedir.

    // kullanıcıdan veri almak içinn şu 3 adım takip edilir
    //1. adım-> Scanner class'dan obj create edilir.

    //  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

    //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
    //  System.out.print("adınızı giriniz :");

    //  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.

    public static void main(String[] args) {
        //1. adım-> Scanner class'dan obj create edilir.
        Scanner scan = new Scanner(System.in);

        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        // System.out.println("Lütfen isminizi giriniz: ");

        // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
        //  String isim = scan.nextLine();
        // System.out.println("isim = " + isim);

        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz

        // 2. adım: kullanıcıya bilgi:
        //System.out.println("Lütfen kenar uzunluğunu giriniz...");

        // 3. adım->
        //int kenar = scan.nextInt();
        //System.out.println("Geometrik şeklin cinsini girin ...");
        //String sekli = scan.nextLine();

        //int alan = kenar * kenar;
        //System.out.println(sekli + " şeklinin alanı : " + alan);

                /*
             Task->
             Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
             Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
             1 seker = 1.7 gr
             Ornek : Input : cay sayisi : 10 seker sayisi :
                     Output : Yilda 12.41 kg seker kullaniyorsunuz
             */

        System.out.println("günlük içtiğiniz cay sayisini giriniz :");
        int gunlukCay= scan.nextInt();

        System.out.println("çayı kaç şekerli içersiniz ? ...");
        int sekerSayisi = scan.nextInt();


        System.out.println("Yılda "+ ((gunlukCay*sekerSayisi*365*1.7)/1000) + " kg seker kullaniyorsunuz");


    }
}
