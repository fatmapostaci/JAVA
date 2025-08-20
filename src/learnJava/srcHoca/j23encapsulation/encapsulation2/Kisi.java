package learnJava.srcHoca.j23encapsulation.encapsulation2;

public class Kisi {

    private String ad;
    private String soyad;
    private String password;
    private int yas;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

   // public void setPassword(String password) {
   //     this.password = password;
   // }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas > 0){
        this.yas = yas;
        } else {
            System.out.println("Negatif yaş girmeye çalıştığınız için data güncellenmedi");
        }
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas +
                '}';
    }
}
