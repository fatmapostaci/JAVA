package learnJava.src.dersler.gun45map.tasks.TEKRAREDILECEK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {

    /*Task->
        1-Ekleme
        2-Listeleme
        3-Arama
        4-Düzeltme
        5-Çıkış
        Seçeneklerini vererek username(key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        Mainde  Seçenekler ve metodların call edip run ediniz.

         */
    static Map<String, String[]> userMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Uygulamaya Hoş geldiniz");
        boolean devam = true;
        while(devam) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("        1-Ekleme\n" +
                    "        2-Listeleme\n" +
                    "        3-Arama\n" +
                    "        4-Düzeltme\n" +
                    "        5-Çıkış");
            System.out.println("Tercihiniz : ");
            int secim = 0;
            try {
                secim = scan.nextInt();
                scan.nextLine();
                if (secim>0 && secim < 6) {
                    switch (secim) {
                        case 1-> kullaniciEkleme();
                        case 2 ->kullaniciListeleme();
                        case 3 ->kullaniciAramak();
                        case 4 -> kullaniciDuzenle();
                        case 5 ->{
                            System.out.println("Sistemden Çıkılıyor");
                            devam = false;
                        }
                    }
                } else {
                    System.out.println("Lütfen 1 ile 5 arasındaki sayılardan secim yapınız");
                }
            }catch (RuntimeException e){
                System.out.println("Lütfen sadece sayı giriniz. Tekrar deneyiniz");
                scan.nextLine(); // try da scanner okuyamadı ise satır boş okuma yapılarak temizlenmeli
            }

        }
    }

    private static void kullaniciDuzenle() {
        System.out.println(" userName = ");
        String user = scan.nextLine();

        if (userMap.containsKey(user)){
            System.out.println("yeni şifre = ");
            String sifre = scan.nextLine();
            System.out.println("yeni role = ");
            String type = scan.nextLine();

            userMap.replace(user,new String[]{sifre,type});
        } else {
            System.out.println("Bu isimde kullanıcı kayıtlı değil");
        }
    }

    private static void kullaniciAramak() {
        System.out.println("Aramk istediğiniz kullanıcı adını giriniz");
        String searchName = scan.nextLine();
        if (userMap.containsKey(searchName)){
            System.out.println(searchName + " kullanıcısının bilgileri = "+ Arrays.toString(userMap.get(searchName)));
        } else {
            System.out.println("Sistemde belirtilen isimde kullanıcı yoktur");
        }
    }

    private static void kullaniciEkleme() {
        System.out.println("Kullanıcı Adı :");
        String userName = scan.nextLine();
        if (userMap.containsKey(userName)){
            System.out.println("Bu isimde kullanıcı adı zaten mevcut");
        } else {
            System.out.println("şifrenizi giriniz :");
            String password = scan.nextLine();

            System.out.println("Görevinizi giriniz(Müdür/Çalışan) :");
            String userType = scan.nextLine();

            //String[] userDetails = new String[]{password,userType};
            //userMap.put(userName,userDetails);

            userMap.put(userName, new String[]{password, userType});
            System.out.println("Kullacı sisteme eklendi ");
        }
    }

    private static void kullaniciListeleme() {
        if (userMap.isEmpty()){
            System.out.println("Listelenecek kullanı bilgisi yok");
        } else {
            for (Map.Entry<String,String[]> entry:userMap.entrySet()){
                System.out.println(entry.getKey() + " için \n    şifre = "+ entry.getValue()[0]+ "\n"
                                + "    Kullanıcı türü = " + entry.getValue()[1]);

            }
        }
    }
}
