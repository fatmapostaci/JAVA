package learnJava.src.dersler.gun36.hw;

public class ElectricCar extends Car {
    String batteryCapacity;
    String brand = "electricCar";
    void chargeBattery() {
        System.out.println("ElectricCar");
    }
    void start() {
        System.out.println("ElectricCar çalıştırıldı");
    }
    void start(int a){
        System.out.println("int ElectricCar started");
    }
}
