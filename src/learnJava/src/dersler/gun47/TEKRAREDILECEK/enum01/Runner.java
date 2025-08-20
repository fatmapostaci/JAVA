package learnJava.src.dersler.gun47.TEKRAREDILECEK.enum01;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        //Task-> verilen yılın ayını numarasına göre kaç gun cektğini print eden code create ediniz.
        //Aylar enum oluşturup  data type ay variable tanimlanip deger atamasi yapin

        // herhangi bir ay değerini çağırma:
        Aylar ay = Aylar.HAZIRAN;
        System.out.println("ay = " + ay); // NISAN

        // Enum değerinin adını Stringe atama
        String ayStr = ay.name();
        System.out.println("ayStr = " + ayStr);

        // String olan bir girdiyi Aylar Enum ına dönüştürme:
        String str = "Ocak";

       //Aylar strToAy = Aylar.valueOf(str); // IllegalArgumentException
        Aylar strToAy = Aylar.valueOf(str.toUpperCase()); // IllegalArgumentException

        // Enum değerlerini iterate etme
        System.out.println("Aylar.values() = " + Arrays.toString(Aylar.values()));

        for (Aylar month :Aylar.values()){
            System.out.print(month+ " ");
        }


        System.out.println();
        System.out.println("ay = " + ay);

        // Mehmet Beyin Önerisi
        int kacGun =Aylar.gunsayisi(ay);
        System.out.println(ay + " ayında " + kacGun + " gün vardır");



/*
        int gunSayisi = switch (ay){
            case OCAK -> 31;
            case SUBAT -> 28;
            case NISAN -> 30;
            default -> 30;
        };

 */
/*
        int gunSayisi = 0;
        switch (ay){
            case OCAK :
                gunSayisi = 31;
                break;
            case SUBAT:
                gunSayisi = 28;
                break;
            case MART:
                gunSayisi = 31;
                break;
            case NISAN:
                gunSayisi = 30;
                break;
            case MAYIS:
                gunSayisi = 31;
                break;
            case HAZIRAN:
                gunSayisi = 30;
                break;
            case TEMMUZ:
                gunSayisi = 31;
                break;
            case AGUSTOS:
                gunSayisi = 31;
                break;
            case EYLUL:
                gunSayisi = 30;
                break;
            case EKIM:
                gunSayisi = 31;
                break;
            case KASIM:
                gunSayisi = 30;
                break;
            case ARALIK:
                gunSayisi = 31;
                break;
        }
        System.out.println(ay + " ayında " + gunSayisi + " gün vardır");
 */
 }
}
