package sayiyiMetneDonustur;

public class MetneDonustur {
    static int birler, onlar, yuzler, binler, onbinler, yuzbinler, milyonlar;

    public static int kacBasamakli(String inputText) {

        int basamakSayisi = inputText.length();
        int sayi = (int) Integer.parseInt(inputText);
        birler = 0;
        onlar = 0;
        yuzler = 0;
        binler = 0;
        onbinler = 0;
        yuzbinler = 0;
        milyonlar = 0;

        switch (basamakSayisi) {
            case 7:
                milyonlar = (sayi / 100000) % 10;
            case 6:
                yuzbinler = (sayi / 100000) % 10;
            case 5:
                onbinler = (sayi / 10000) % 10;
            case 4:
                binler = (sayi / 1000) % 10;
            case 3:
                yuzler = (sayi / 100) % 10;
            case 2:
                onlar = (sayi / 10) % 10;
            case 1:
                birler = sayi % 10;
                break;
            default:
                break;
        }
        return sayi;

    }

    public static String metneDonustur(String inputText) {

        int sayi = kacBasamakli(inputText);
        sayi = (int) Integer.parseInt(inputText);

        String birlerS = switch (birler) {
            case 1 -> "bir";
            case 2 -> "iki";
            case 3 -> "üç";
            case 4 -> "dört";
            case 5 -> "beş";
            case 6 -> "altı";
            case 7 -> "yedi";
            case 8 -> "sekiz";
            case 9 -> "dokuz";
            case 0 -> "";
            default -> "???";
        };
        String onlarS = switch (onlar) {
            case 1 -> "on";
            case 2 -> "yirmi";
            case 3 -> "otuz";
            case 4 -> "kırk";
            case 5 -> "elli";
            case 6 -> "altmış";
            case 7 -> "yetmiş";
            case 8 -> "seksen";
            case 9 -> "doksan";
            case 0 -> "";
            default -> "???";
        };
        String yuzlerS = switch (yuzler) {
            case 1 -> "yüz";
            case 2 -> "iki yüz";
            case 3 -> "üç yüz";
            case 4 -> "dört yüz";
            case 5 -> "beş yüz";
            case 6 -> "altı yüz";
            case 7 -> "yedi yüz";
            case 8 -> "sekiz yüz";
            case 9 -> "dokuz yüz";
            case 0 -> "";
            default -> "???";
        };
        String binlerS = switch (binler) {
            case 1 -> "bin";
            case 2 -> "iki bin";
            case 3 -> "üç bin";
            case 4 -> "dört bin";
            case 5 -> "beş bin";
            case 6 -> "altı bin";
            case 7 -> "yedi bin";
            case 8 -> "sekiz bin";
            case 9 -> "dokuz bin";
            case 0 -> "";
            default -> "???";
        };
        String onbinlerS = switch (onbinler) {
            case 1 -> "on";
            case 2 -> "yirmi";
            case 3 -> "otuz";
            case 4 -> "kırk";
            case 5 -> "elli";
            case 6 -> "altmış";
            case 7 -> "yetmiş";
            case 8 -> "seksen";
            case 9 -> "doksan";
            case 0 -> "";
            default -> "???";
        };
        String yuzbinlerS = switch (yuzbinler) {
            case 1 -> "yüz";
            case 2 -> "iki yüz";
            case 3 -> "üç yüz";
            case 4 -> "dört yüz";
            case 5 -> "beş yüz";
            case 6 -> "altı yüz";
            case 7 -> "yedi yüz";
            case 8 -> "sekiz yüz";
            case 9 -> "dokuz yüz";
            case 0 -> "";
            default -> "???";
        };
        String milyonlarS = switch (milyonlar) {
            case 1 -> "milyon";
            case 2 -> "iki milyon";
            case 3 -> "üç milyon";
            case 4 -> "dört milyon";
            case 5 -> "beş milyon";
            case 6 -> "altı milyon";
            case 7 -> "yedi milyon";
            case 8 -> "sekiz milyon";
            case 9 -> "dokuz milyon";
            case 0 -> "";
            default -> "???";
        };
        return " " + milyonlarS + " " + yuzbinlerS + " " + onbinlerS + " " + binlerS + " " + yuzlerS + " " + onlarS + " " + birlerS;

    }
}