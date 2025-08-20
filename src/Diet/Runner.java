package Diet;

public class Runner {
    public static void main(String[] args) {

        VucutKutlesiHesaplama vkh = new VucutKutlesiHesaplama();

        String cinsiyet = vkh.cinsiyetBelirle() ;
        double kilo =vkh.kiloBelirleme();
        double boy = vkh.boyBelirleme();
        int yas =vkh.yasBelirleme();
        double hareketSeviyesi = vkh.aktiviteSeviyesi();

        double vucutKitleİndeksi = vkh.vucutKitleİndeksi(kilo,boy);
        double bazalMetobolizmaHizi = vkh.bazalMetobolizmaHizi(cinsiyet,kilo,boy,yas);
        double kaloriMiktari = vkh.kaloriMiktariHesapla(vucutKitleİndeksi,bazalMetobolizmaHizi,hareketSeviyesi);

        System.out.println("vucutKitleİndeksi = " + vucutKitleİndeksi);
        System.out.println("bazalMetobolizmaHizi = " + bazalMetobolizmaHizi);
        System.out.println("Sağlıklı zayıflamak için günlük alması gereken kalori: " + kaloriMiktari + " kcal");
    }

}
