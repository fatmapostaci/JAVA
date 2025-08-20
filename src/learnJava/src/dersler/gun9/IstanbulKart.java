package learnJava.src.dersler.gun9;

import java.util.Random;
import java.util.Scanner;

public class IstanbulKart {
    public static void main(String[] args) {
   /*Task 02) Otobüs bilet ücreti kesimine ait küçük bir simülasyon oluşturacağız.
                Kullanıcıdan Kart türü, aktarma ve bakiye bilgisini alarak
                eğer yeterli bakiye bulunuyorsa kalan bakiye bilgisini göstereceğiz.
                Yeterli bakiye bulunmaması halinde gerekli uyarıyı yapacağız.
image.png
 */
        Scanner scanf = new Scanner(System.in);
        System.out.print("kart türü: ");
        String kartTuru = scanf.next().toUpperCase();
        System.out.print("İstanbul kart bakiyesi: ");
        double bakiye = scanf.nextDouble(), odenecek_tutar=0;
        int aktarma = 0;

        while (bakiye > 0) {
            //method ile dönen ödenecek tutarı toplam bakiyeden düşme işlemi
            odenecek_tutar= odenecek_tutar_methodu(aktarma, kartTuru);
            if(odenecek_tutar>bakiye){
                System.out.println("Yetersiz bakiye. Ödeme yapılamadı");
                break;
            }else {
                bakiye -= odenecek_tutar;
                System.out.println("Kalan İstanbul kart bakiyesi = " + bakiye);
            }
            Random rand = new Random(); //aktarma durumunu dışarıdan almak yerine random methodu ile süre geçmesini sağlamak istedim
            int dakika = rand.nextInt(0, 120); //kaç dakika geçtiğini random fonksiyonu belirliyor

            if (dakika > 30 && dakika < 120) { //süre 30dk ile 2 saat arasındaysa aktarma aktif olsun.
                //aktarma++;
                System.out.println("Geçen süre: " + dakika +" dakika. Aktarma kabul edildi. " + ++aktarma + ".aktarma");
            }
            else
                System.out.println("Geçen süre: " + dakika +" dakika. Aktarmasız geçiş.");

            if (aktarma == 2){
                aktarma = 0;//ikinci aktarmadan sonra tam bilet kesmesi için aktarmayı resetliyoruz
                System.out.println("Geçen süre: " + dakika + "dakika ve aktarma sıfırlandı");
            }
        }
    }
    static double odenecek_tutar_methodu(int aktarma, String kartTuru) {
        double tutar_ogrenci = 0;
        double tutar_tam = 0;
        double tutar_sosyal = 0;
        double outputTutar = 0;
        //bu switch ile aktarma türüne göre tam,öğrenci,sosyal ücret tarifelerinin tutarları atanır
        switch (aktarma) {
            case (0):  // aktarmasız ücretleri belirleyelim
                tutar_tam = 7.67;
                tutar_ogrenci = 3.74;
                tutar_sosyal = 5.49;
                break;
            case (1): //birinci aktarma ücretleri
                tutar_tam = 5.49;
                tutar_ogrenci = 1.64;
                tutar_sosyal = 3.29;
                break;
            case (2): // ikinci aktarma
                tutar_tam = 4.17;
                tutar_ogrenci = 1.54;
                tutar_sosyal = 2.52;
                break;
            default:
                System.out.println("aktarma durumu hatası");
        }
        outputTutar = switch (kartTuru) { //belirlenen tutar, kart türüyle eşleştirilir ve output tutara assing edilir
            case "OGRENCI" -> tutar_ogrenci;
            case "TAM" -> tutar_tam;
            case "SOSYAL" -> tutar_sosyal;
            default -> 0;
        };
        System.out.println("Ödenecek bilet tutarı= " + outputTutar);
        return outputTutar;
    }
}
