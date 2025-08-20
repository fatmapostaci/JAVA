package learnJava.src.dersler.gun51.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_lambdaObject {
        /*
  TASK :
  fields --> Universite (String)
             bolum (String)
             ogrcSayisi (int)
             notOrt (double)
             olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
   */

    public static void main(String[] args) {

        C13University u01 = new C13University("Bogazici", "Matematik", 571, 73);
        C13University u02 = new C13University("Istanbul", "Matematik", 622, 77);
        C13University u03 = new C13University("Marmara", "Hukuk", 1453, 52);
        C13University u04 = new C13University("Itu", "uçak muh.", 333, 63);
        C13University u05 = new C13University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C13University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("unv = " + unv);

        System.out.println("****Task 01*****");
        // Task01-> Tum notOrt'larının 74'den buyuk oldg control eden code create ediniz...
        //unv.stream().allMatch()

        System.out.println("\n****Task 02*****");
        //task02->ogrc sayilarinin 110 den az olmadigini  kontrol eden code create ediniz.

        System.out.println("\n****Task 03*****");
        //task03->universite'lerde herhangi birinde "matematik" bolumu olup olmadigini  kontrol eden code create ediniz.

        System.out.println("\n****Task 04*****");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        System.out.println(unv.stream().sorted(Comparator.comparing(C13University::getOgrcSayisi).reversed()).toList());

        System.out.println("\n****Task 05*****");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
        //unv.stream().


        System.out.println("\n****Task 06*****");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        System.out.println(unv.stream().sorted(Comparator.comparing(C13University::getOgrcSayisi)).skip(1).findFirst().get());
        System.out.println(unv.stream().sorted(Comparator.comparing(C13University::getOgrcSayisi)).skip(1).limit(1).toList());

        System.out.println("\n****Task 07*****");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...

        System.out.println("\n****Task 08*****");
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...

        System.out.println("\n****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

        System.out.println("\n****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...

        System.out.println("\n****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...


    }
}
