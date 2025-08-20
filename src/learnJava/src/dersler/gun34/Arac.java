package learnJava.src.dersler.gun34;

import java.time.LocalDate;

public class Arac {
            /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
       olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
      */

    private String model;
    private String renk;
    private int motor;
    private Integer yil;

    public Arac(String model, String renk, int motor, Integer yil) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    public Arac() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor >= 1000) {
            this.motor = motor;
        } else {
            System.out.println("Motor hacmi bilgisi yanlış girdi dolayısıyla güncellenmedi");
        }
    }

    public Integer getYil() {
        return yil;
    }

    public void setYil(int yil) {
        int buYil = LocalDate.now().getYear();
        if (yil <= buYil && (buYil - yil) < 40) {
            this.yil = yil;
        } else {
            System.out.println("Yıl bilgisi yanlış girdi dolayısıyla güncellenmedi");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
