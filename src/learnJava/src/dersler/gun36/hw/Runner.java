package learnJava.src.dersler.gun36.hw;
/*
Görev:
Vehicle adında bir sınıf oluşturun. Bu sınıf:
 brand adında bir özellik ve
 start() adında bir metot içersin.
Car sınıfını Vehicle sınıfından türetin.
 numberOfDoors adında bir özellik ekleyin.
 start() metodunu override ederek "Araba çalıştırıldı" yazsın.
ElectricCar sınıfını Car sınıfından türetin.
 batteryCapacity adında bir özellik ekleyin.
 chargeBattery() adında bir metot yazın.
Main metodunda bir ElectricCar nesnesi oluşturun ve tüm metodları kullanarak ekrana sonuçları yazdırın.
 */
public class Runner {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
       // System.out.println(electricCar.batteryCapacity);
        electricCar.chargeBattery();  // output:ElectricCar
       // electricCar.numberOfDoors=4;
        electricCar.start();  // output:
        //System.out.println(electricCar.brand);

        Vehicle vehicleCar = new ElectricCar();
       // System.out.println(vehicleCar.brand);
        vehicleCar.start();   // output:
        Car car = new ElectricCar();
        car.start();   // output:
        vehicleCar.start();   // output:
        car.start(3);   // output:
        car.start("s");   // output:




    }
}
