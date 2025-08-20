package learnJava.src.dersler.gun34;

import dersler.gun35.inheritance.Human;

public class Kisi extends Human {


    private String soyad;
    private String password;

    public Kisi() {
    }


    public Kisi(String ad, String soyad, String password, int yas) {
        super.name = ad;
        this.soyad = soyad;
        this.password = password;
        super.age = yas;
    }

    public String getAd() {
        return name;
    }

    public void setAd(String ad) {
        super.name= ad;
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
        return super.age;
    }

    public void setYas(int yas) {
        if (yas > 0){
        age = yas;
        } else {
            System.out.println("Negatif yaş girmeye çalıştığınız için data güncellenmedi");
        }
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + name + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + age +
                '}';
    }
}
