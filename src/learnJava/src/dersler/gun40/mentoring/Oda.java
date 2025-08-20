package learnJava.src.dersler.gun40.mentoring;
/*
Görevler:
Genel bir "Oda" sınıfı oluşturun.

Bu sınıf, tüm oda türleri için ortak olan bilgileri ve işlemleri barındırır:
Oda numarası
Oda fiyatı
Rezervasyon durumu
Oda sınıfını soyut yapın (abstract class).

Ortak bilgilerin yanı sıra, her oda türüne göre farklılık gösterebilecek bir metot tanımlayın:
hizmetler() metodu: Her oda türünün sunduğu hizmetleri göstermek için soyut bir metot.
Farklı oda türleri için alt sınıflar oluşturun.

Standart Oda: Yalnızca temel hizmetler (Wi-Fi ve televizyon).
Deluxe Oda: Temel hizmetlerin yanı sıra kahvaltı dahil.
Suit Oda: Temel hizmetler, kahvaltı, spa ve ücretsiz mini bar.
Bir test sınıfında şunları yapın:

Farklı türde birkaç oda oluşturun.
Odaların bilgilerini ve hizmetlerini ekrana yazdırın.

 */
abstract class Oda {
    int odaNumarasi;
    double odaFiyati;
    boolean rezervasyonDurumu;

    abstract void hizmetler();

}

class StandartOda extends Oda{
    @Override
    void hizmetler() {
        System.out.println("Yalnızca temel hizmetler (Wi-Fi ve televizyon).");
    }
}
class DeluxeOda extends Oda{
    @Override
    void hizmetler() {
        System.out.println("Temel hizmetlerin yanı sıra kahvaltı dahil.");
    }
}
class SuitOda extends Oda {
    @Override
    void hizmetler() {
        System.out.println("Temel hizmetler, kahvaltı, spa ve ücretsiz mini bar.");
    }
}
class Runner{
    public static void main(String[] args) {
        Oda suitoda = new SuitOda();
        suitoda.hizmetler();

        Oda deluxeoda = new DeluxeOda();
        deluxeoda.hizmetler();

        Oda standartoda = new StandartOda();
        standartoda.hizmetler();

    }
}