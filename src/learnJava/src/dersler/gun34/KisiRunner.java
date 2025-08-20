package learnJava.src.dersler.gun34;

public class KisiRunner {
    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */

    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        Kisi kisi2 = new Kisi("Tom","Sawyer","12342345",56);

        kisi1.setYas(-20);
        System.out.println("kisi1.getYas() = " + kisi1.getYas());

        kisi2.setYas(120);
        System.out.println("kisi2.getYas() = " + kisi2.getYas());

        System.out.println("kisi2.getAd() = " + kisi2.getAd());
        System.out.println("kisi2.getSoyad() = " + kisi2.getSoyad());
        System.out.println("kisi2.getPassword() = " + kisi2.getPassword());
        System.out.println("kisi2.getYas() = " + kisi2.getYas());

        System.out.println("kisi1.toString() = " + kisi1.toString());

    }
}
