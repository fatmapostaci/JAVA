package learnJava.srcHoca.j23encapsulation.encapsulation3;

public class AracRunner {

    public static void main(String[] args) {
        Arac bmw = new Arac("BMW","mavi",1600,2023);
        Arac mercedes = new Arac("Mercedes","siyah",2000,2024);
        Arac audi = new Arac();

        audi.setMotor(1800);
        System.out.println("audi.getMotor() = " + audi.getMotor());

        System.out.println("audi.getYil() = " + audi.getYil());
        audi.setYil(2022);
        System.out.println("audi.getYil() = " + audi.getYil());

        bmw.setRenk("Uçuk Pembe");

        System.out.println("bmw.toString() = " + bmw.toString());

    }
}
