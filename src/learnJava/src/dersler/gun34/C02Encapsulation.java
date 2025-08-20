package learnJava.src.dersler.gun34;

public class C02Encapsulation {
        /*
   Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
   Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
   veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
   kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
   basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
   işbirliği yapmak için kullanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
    */

    //1.step
    //fields->obj variable->instance->private

    private String ad = "Mehmet Bey";
    private int id = 1001;
    private String email = "ebikgabik@gmail.com";
    private String soyad = "JavvaHan";

    //2.step->const (1- parametresiz ve parametreli)


    public C02Encapsulation(String ad, int id, String email, String soyad) {
        this.ad = ad;
        this.id = id;
        this.email = email;
        this.soyad = soyad;
    }

    public C02Encapsulation() {
    }


    // 3rd step:->getter-setter


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    //4.step->toString
    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
