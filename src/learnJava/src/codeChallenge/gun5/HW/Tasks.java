package learnJava.src.codeChallenge.gun5.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)-- > "23 Kasım", "24 Kasım"
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : Foreach döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {
        ArrayList<String> gunler = new ArrayList<>(Arrays.asList("23 Kasim","24 Kasim","25 Kasim","26 Kasim","27 Kasim","28 Kasim","30 Kasim"));
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();
        gunlukKazancEkle(gunler,gunlukKazanclar);
        System.out.println(gunlukKazanclar);
        System.out.println("OrtalamaKazanc: " + getOrtalamaKazanc(gunlukKazanclar));
        System.out.println("Ortalama üstü kazanc günleri"+getOrtalamaninUstundeKazancGünleri(gunlukKazanclar, gunler));
        System.out.println("Ortalama altı kazanc günleri"+getOrtalamaninAltindaKazancGünleri(gunlukKazanclar, gunler));

    }
    public static void gunlukKazancEkle( ArrayList<String> gunlerList ,ArrayList<Double> gunlukKazancList ){
        Scanner scanf = new Scanner(System.in);

        for ( String s : gunlerList ){
            System.out.print( s + " için gunluk kazancı girin: ");
            gunlukKazancList.add( scanf.nextDouble() );
            }
    }


    public static double getOrtalamaKazanc(ArrayList<Double> kazancList ){
        double toplam = 0;
        for (Double d : kazancList){
            toplam += d;
        }
        int adet = kazancList.size();
        return toplam/adet ;
    }
    public static ArrayList<String> getOrtalamaninAltindaKazancGünleri(ArrayList<Double> kazancList, ArrayList<String> gunler ){
        double ortalama_kazanc = getOrtalamaKazanc(kazancList);
        ArrayList<String> ortalamaAltiKazancList = new ArrayList<>();
        int dayIndex = 0;
        for ( Double kazanc : kazancList ){
            if( kazanc < ortalama_kazanc ){
                ortalamaAltiKazancList.add(gunler.get(dayIndex));
            }
            dayIndex++;
        }
        return ortalamaAltiKazancList;
    }
    public static ArrayList<String> getOrtalamaninUstundeKazancGünleri(ArrayList<Double> kazancList, ArrayList<String> gunler){
        double ortalama_kazanc =getOrtalamaKazanc(kazancList);
        ArrayList<String> ortalamaUstuKazancList = new ArrayList<>();
        int dayIndex=0;
        for ( Double kazanc : kazancList ){
            if ( kazanc > ortalama_kazanc ){
                ortalamaUstuKazancList.add(gunler.get(dayIndex));
            }
            dayIndex++;
        }
        return ortalamaUstuKazancList;
    }
}
