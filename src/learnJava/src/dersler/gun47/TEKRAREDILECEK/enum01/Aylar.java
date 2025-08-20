package learnJava.src.dersler.gun47.TEKRAREDILECEK.enum01;

public enum Aylar {
    OCAK,
    SUBAT,
    MART,
    NISAN,
    MAYIS,
    HAZIRAN,
    TEMMUZ,
    AGUSTOS,
    EYLUL,
    EKIM,
    KASIM ,
    ARALIK;

    public static int gunsayisi(Aylar ay){
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
        return gunSayisi;
    }


}
