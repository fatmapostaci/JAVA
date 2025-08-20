package learnJava.srcHoca.j100projects.project07;

import java.util.Scanner;

public class Main {
static Scanner scan = new Scanner(System.in);
static int sekerSayisi = 0;
static String kahveBoy ;
    public static void main(String[] args) {
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
      /*  Kahve kahve1 = new Kahve("Türk kahvesi",30,50,40);
        Kahve kahve2 = new Kahve("Latte",35,55,45);
        Kahve kahve3 = new Kahve("Espresso",40,60,50);
       */

        System.out.println("Tercihiniz: ");
       int tercih =  scan.nextInt();
       scan.nextLine();

       switch (tercih){
           case 1:
               System.out.println("Türk kahveniz hazırlanıyor");

               break;
           case 2:
               System.out.println("Filtre Kahveniz hazırlanıyor");
               break;
           case 3:
               System.out.println("Espressonuz hazırlanıyor");
               break;
           default:
               System.out.println("yanlış seçim yaptınız tekrar deneyiniz");
       }

        System.out.println("İlave süt istermisiniz: (Evet/Hayır)");
       String sut = scan.nextLine().toUpperCase();
       System.out.println((sut.equals("EVET") ? "Süt ekleniyor..." : "Süt eklenmiyor"));

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
                break;
            case "KÜCÜK BOY":
                System.out.println("Kahveniz kucuk boy hazırlanıyor");
                break;
            case "ORTA BOY":
                System.out.println("Kahveniz orta boy hazırlanıyor");
                break;
            default:
                System.out.println("yanlış seçim yaptınız Kahveniz kucuk boy hazırlanıyor");
        }

        int ucret = kahvefiyati(tercih,sut);
        System.out.println("Kahvenizin ücreti = "+ ucret+ "TL dir");
        System.out.println("Gireceğiniz para miktarını belirtiniz:");
        System.out.println("Kabul edilecek banknotlar \"5-10-20-50'lik banknotlar\"");

        int girilenPara = scan.nextInt();

        paraUstuVer(girilenPara,ucret);

    }

    private static void paraUstuVer(int girilenPara, int ucret) {
        if (girilenPara<ucret){
            System.out.println("Girdiğiniz para yetersizdir. ");
        } else if (girilenPara>ucret){
            int paraUstu = girilenPara - ucret;
            System.out.println(paraUstu +"TL para üstünüzü  almayı unutmayınız");
        }
    }

    private static int kahvefiyati(int tercih, String sut) {
        int price = 0;
        if (tercih == 1){
            System.out.println(kahveBoy);
            if (kahveBoy.equals("BÜYÜK BOY")){
                price = 50;
            } else if (kahveBoy.equals("ORTA BOY")){
                price = 40;
            } else if (kahveBoy.equals("KÜCÜK BOY")){
                price = 30;
            }
        } else if (tercih == 2){
            if (kahveBoy.equals("BUYUK BOY")){
                price = 55;
            } else if (kahveBoy.equals("ORTA BOY")){
                price = 45;
            } else if (kahveBoy.equals("KUCUK BOY")){
                price = 35;
            }
        } else if (tercih == 3){
            if (kahveBoy.equals("BUYUK BOY")){
                price = 60;
            } else if (kahveBoy.equals("ORTA BOY")){
                price = 50;
            } else if (kahveBoy.equals("KUCUK BOY")){
                price = 40;
            }
        }

        if(sut.equals("EVET")){
            price+=10;
        }
        return price;
    }
}
