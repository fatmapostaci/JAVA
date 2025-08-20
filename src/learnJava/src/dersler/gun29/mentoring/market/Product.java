package learnJava.src.dersler.gun29.mentoring.market;

import java.time.LocalDate;

public class Product {
    String cinsi ;
    String marka;
    int ID;
    int agirlik;
    LocalDate sonKullanmaTarihi;
    @Override
    public String toString() {
        return "Product{" +
                "cinsi='" + cinsi + '\'' +
                ", marka='" + marka + '\'' +
                ", ID=" + ID +
                ", agirlik=" + agirlik +
                ", sonKullanmaTarihi=" + sonKullanmaTarihi +
                '}';
    }
    public String toString(String a) {
        return "Product{" +
                ", agirlik=" + agirlik +
                ", sonKullanmaTarihi=" + sonKullanmaTarihi +
                '}';
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public LocalDate getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }


    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
