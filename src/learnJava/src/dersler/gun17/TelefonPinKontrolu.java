package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class TelefonPinKontrolu {
    // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
    public static void main(String[] args) throws InterruptedException {
        String puk = method_puk_belirleme();
        String pin = method_pin_belirleme();

        telefon_acilisi_pin_kontrol(pin, puk);
    }

    public static void telefon_acilisi_pin_kontrol(String pin, String puk) throws InterruptedException {
        menu_method();
        System.out.println("Şebeke yüklendi. \nTelefonun açılabilmesi için Pin kontrolü yapılacaktır.");

        int counter = 0;
        while (counter <= 3) {
            if (counter >= 3) {
                System.out.println("3 kez hatalı girdiniz. Pin bloke edildi.");
                method_puk_dogrulama(puk);
                break;
            } else if (method_pin_dogrulama(pin)) {
                menu_method();
                System.out.println("Pin kabul edildi. Telefon açılıyor, lütfen bekleyiniz");
                break;
            } else {
                System.out.println((3 - counter - 1) + " giriş hakkınız kaldı.");
            }
            counter++;
        }

    }

    public static String method_pin_belirleme() {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Pin kodunu belirleyin: ");
        String pin = scanf.nextLine();
        while (pin.length() < 4) {
            System.out.print("Pin şifresini 4 haneli girin:  ");
            pin = scanf.nextLine();
        }
        System.out.print("Pini tekrar girin: ");
        String ikinci_pin = scanf.next();
        if (pin.equals(ikinci_pin)) {
            System.out.println("Pin kaydedildi");
            return pin;
        } else {
            System.out.println("Eşleşme olmadı tekrar yeni Pin belirleyin.");
            return method_pin_belirleme();
        }
    }

    public static boolean method_pin_dogrulama(String pin) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Pin giriniz: ");
        String pin_deneme = scanf.nextLine();
        if (pin.equals(pin_deneme)) {
            return true;
        } else return false;
    }

    public static String method_puk_belirleme() {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Kazınan hat üzerindeki 8 haneli Puk şifresini girin: ");

        String puk = scanf.nextLine();
        while (puk.length() < 8) {
            System.out.print("Puk şifresini 8 haneli girin:  ");
            puk = scanf.nextLine();
        }
        System.out.print("Puku tekrar girin: ");
        String ikinci_puk = scanf.next();
        if (puk.equals(ikinci_puk)) {
            System.out.println("Puk kaydedildi");
            return puk;
        } else {
            System.out.println("Eşleşme olmadı tekrar puk girişi yapın.");
            return method_puk_belirleme();
        }
    }

    public static void method_puk_dogrulama(String puk) throws InterruptedException {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Puk girin: ");
        String puk_deneme = scanf.nextLine();
        if (puk.equals(puk_deneme)) {
            System.out.println("Puk kabul edildi.\n Yeni pin belirleyin.");
            String pin = method_pin_belirleme();
            telefon_acilisi_pin_kontrol(pin, puk);
        } else {
            menu_method();
            System.out.println("Telefon bloke edildi. Geçmiş olsun :)");
            System.out.println("Müşteri hizmetlerini arayınız...");
        }
    }

    public static void menu_method() throws InterruptedException {
        int counter = 0;
        while (counter < 30) {
            System.out.print("*");
            Thread.sleep(100);
            counter++;
        }
        System.out.println();
    }
}

