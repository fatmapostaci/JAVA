package learnJava.src.project.VehicleManagement;
/*
    main metodu içinde her alt sınıftan birer nesne oluşturun:
        Bir araba
        Bir kamyon
        Bir motosiklet
        Oluşturulan nesnelerin özelliklerini getter metodları ile alın ve setter metodları ile güncelleyin.
        Her nesne için drive metodunun iki versiyonunu da çağırarak çalıştırın.
        Araçlara özel özellikleri (numberOfDoors, loadCapacity, hasSidecar) ekrana yazdırın.

 */
public class VehicleManagement {

    public static void main(String[] args) {
        Car araba1= new Car("Toyota","Corolla",2024,4);
        Car araba2= new Car("Volvo","XC90",2024,5);
        Car araba3= new Car("Tesla","Y",2024,5);
        araba2.drive();
        araba3.drive(330);

        Truck truck1 = new Truck("Scania","Model",2023,2000);
        Truck truck2 = new Truck("Ford","F-150",2024,3000);
        Truck truck3 = new Truck("Man","M12",2023,5000);
        truck1.drive(500);

        Motorcycle motorcycle1 = new Motorcycle("Harley Davidson", "Uydurdum",2023,false);
        motorcycle1.drive(1500);
        System.out.println( motorcycle1.getBrand()+" da Sidecar= " + (motorcycle1.isHasSideCar()?"VAR":"YOK"));




    }
}
