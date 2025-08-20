package learnJava.srcHoca.j100projects.project02.vehiclemanagement;

public class VehicleManagement {
    /*
Görev 1: Ana Sınıfı Oluştur

    Vehicle sınıfını oluşturun.
    Aşağıdaki özellikleri tanımlayın (private):
    brand (Araç markası)
    model (Araç modeli)
    year (Araç üretim yılı)
        Bu özellikler için getter ve setter metodlarını ekleyin.
        Vehicle sınıfı için bir constructor tanımlayın.
        Aşağıdaki iki drive metodunu ekleyerek method overloading kavramını gösterin:
        Parametresiz drive metodu, aracın sürüldüğünü ekrana yazsın.
        Parametreli drive(int distance) metodu, aracın belirli bir mesafe sürüldüğünü ekrana yazsın.

Görev 2: Alt Sınıfları Oluştur

    Car (Araba) Sınıfı: (Fatma Hanım)
        Vehicle sınıfından miras alın.
        Ek bir özellik olarak numberOfDoors (kapı sayısı) ekleyin.
        Getter ve setter metodlarını ekleyin.
    Truck (Kamyon) Sınıfı: (Fatma Hanım)
        Vehicle sınıfından miras alın.
        Ek bir özellik olarak loadCapacity (yük kapasitesi) ekleyin.
        Getter ve setter metodlarını ekleyin.
    Motorcycle (Motosiklet) Sınıfı:(Süleyman)
        Vehicle sınıfından miras alın.
        Ek bir özellik olarak hasSidecar (yan sepet var mı) ekleyin.
        Getter ve setter metodlarını ekleyin.

Görev 3: Ana Programı Yaz

    main metodu içinde her alt sınıftan birer nesne oluşturun:
        Bir araba
        Bir kamyon
        Bir motosiklet
        Oluşturulan nesnelerin özelliklerini getter metodları ile alın ve setter metodları ile güncelleyin.
        Her nesne için drive metodunun iki versiyonunu da çağırarak çalıştırın.
        Araçlara özel özellikleri (numberOfDoors, loadCapacity, hasSidecar) ekrana yazdırın.

Görev 4: Kodunuzu Test Edin

"Programı derleyin ve çalıştırın.
"Çıktının aşağıdaki gibi olması bekleniyor:
"Örnek Çıktı:

Toyota Corolla has 4 doors.
Toyota Corolla is being driven.
Ford F-150 is being driven for 150 kilometers.
Ford can carry 1000.5 kg of load.
Harley-Davidson has a sidecar: false

 */
    public static void main(String[] args) {
        Car araba1= new Car("Toyota","Corolla",2024,4);
        Car araba2= new Car("Volvo","XC90",2024,5);
        Car araba3= new Car("Tesla","Y",2024,5);
        araba2.drive();
        araba3.drive(330);
        araba2.setBaseRate(5000);
        araba2.setAvailable(true);
        System.out.println("araba2.CalculateRent(5) = " + araba2.CalculateRent(5));
        araba2.rentVehicle();
        System.out.println("araba2.isAvailable() = " + araba2.isAvailable());
        araba2.returnVehicle();
        System.out.println("araba2.isAvailable() = " + araba2.isAvailable());

        Truck truck1 = new Truck("Scania","Model",2023,2000);
        Truck truck2 = new Truck("Ford","F-150",2024,3000);
        Truck truck3 = new Truck("Man","M12",2023,60000);
        truck1.drive(500);
        truck3.setAvailable(true);
        System.out.println("truck3.isAvailable() = " + truck3.checkAvailablity());

        Motorcyle motorcyle1 = new Motorcyle("Harley Davidson", "Uydurdum",2023,false);
        motorcyle1.drive(1500);
        System.out.println( motorcyle1.getBrand()+" da Sidecar= " + (motorcyle1.isHasSidecar()?"VAR":"YOK"));


    }

}
