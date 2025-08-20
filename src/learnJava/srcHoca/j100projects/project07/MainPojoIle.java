package learnJava.srcHoca.j100projects.project07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPojoIle {
static Scanner scan = new Scanner(System.in);
static int sekerSayisi = 0;
static String kahveBoy ;
static int price = 0;
    public static void main(String[] args) {
        List<Kahve> kahveMenu = initiliazeKahveMenu();
        System.out.println("Kahve makinemiz hizmete hazır");
        System.out.println("              Fiyat Menüsü:\n" +
                "\n" +
                "                    Küçük        Orta        Büyük\n" +
                "   1.Türk kahvesi   30Tl         40Tl          50Tl\n" +
                "   2.Latte          35Tl         45Tl          55Tl\n" +
                "   3.Espresso       40Tl         50Tl          60Tl\n" +
                "\n" +
                "   * İlave Süt 10Tl\n" +
                "\n" +
                "\n" +
                "  Hangi Kahveyi İstersiniz?\n" +
                "  1.Türk kahvesi\n" +
                "  2.Filtre Kahve\n" +
                "  3.Espresso");


       System.out.println("Tercihiniz: ");
       int tercih =  scan.nextInt();
       scan.nextLine();
       System.out.println(kahveMenu.get(tercih-1).getName() + " isteğiniz hazırlanıyor");


        System.out.println("İlave süt istermisiniz: (Evet/Hayır)");
       String sut = scan.nextLine().toUpperCase();
       System.out.println((sut.equals("EVET") ? "Süt ekleniyor..." : "Süt eklenmiyor"));
       boolean sutlu =  sut.equals("EVET") ? true:false;
       kahveMenu.get(tercih-1).setSutlu(sutlu);
       if (kahveMenu.get(tercih-1).isSutlu){price += 10;}

        System.out.println("\"Şeker ister misiniz ?: (Evet/Hayır)");
        String seker = scan.nextLine().toUpperCase();

        if (seker.equals("EVET")){
            System.out.println("Kaç şeker ilave edilsin ?");
            sekerSayisi = scan.nextInt();
            scan.nextLine();
        }   else if (seker.equals("HAYIR")){
            System.out.println("Şeker eklenmiyor");
        }   else {
            System.out.println("Şeker isteğinizi belirtemediniz. Şeker eklenmiyor");
        }

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        kahveBoy = scan.nextLine().toUpperCase();

        switch (kahveBoy){
            case "BÜYÜK BOY":
                System.out.println("Kahveniz büyük boy hazırlanıyor.");
                price += kahveMenu.get(tercih-1).getBuyukBoy();
                break;
            case "KÜCÜK BOY":
                System.out.println("Kahveniz kucuk boy hazırlanıyor");
                price += kahveMenu.get(tercih-1).getKucukBoy();

                break;
            case "ORTA BOY":
                System.out.println("Kahveniz orta boy hazırlanıyor");
                price += kahveMenu.get(tercih-1).getOrtaBoy();

                break;
            default:
                System.out.println("yanlış seçim yaptınız Kahveniz kucuk boy hazırlanıyor");
        }


        System.out.println(kahveMenu.get(tercih-1).getName() +" isteğiniz ücreti = "+ price+ "TL dir");
        System.out.println("Gireceğiniz para miktarını belirtiniz:");
        System.out.println("Kabul edilecek banknotlar \"5-10-20-50'lik banknotlar\"");

        int girilenPara = scan.nextInt();

        paraUstuVer(girilenPara,price);

    }

    private static void paraUstuVer(int girilenPara, int ucret) {
        if (girilenPara<ucret){
            System.out.println("Girdiğiniz para yetersizdir. ");
        } else if (girilenPara>ucret){
            int paraUstu = girilenPara - ucret;
            System.out.println(paraUstu +"TL para üstünüzü  almayı unutmayınız");
        }
    }



    public static List<Kahve> initiliazeKahveMenu(){
        Kahve kahve1 = new Kahve("Türk kahvesi",30,50,40);
        Kahve kahve2 = new Kahve("Filtre Kahve",35,55,45);
        Kahve kahve3 = new Kahve("Espresso",40,60,50);
        List<Kahve> kahmeMenu = new ArrayList<>();
        kahmeMenu.add(kahve1);
        kahmeMenu.add(kahve2);
        kahmeMenu.add(kahve3);
        return kahmeMenu;
    }
}
