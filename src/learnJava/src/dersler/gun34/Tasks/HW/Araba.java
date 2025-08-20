package learnJava.src.dersler.gun34.Tasks.HW;

import java.time.LocalDate;

/*
1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
*/
public class Araba {
    //fieldları(encapsulated)
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {
    }

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
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
        if( motor >= 1000  )
            this.motor = motor;
        else System.out.println("motor bilgisi güncellenemedi");
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        int buYil = LocalDate.now().getYear();
        if( yil<= buYil && (buYil-yil)<40 )
            this.yil = yil;
        else System.out.println("Yil bilgisi hatalı");
    }
}
