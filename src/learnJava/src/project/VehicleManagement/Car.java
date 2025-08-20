package learnJava.src.project.VehicleManagement;
/**
 *     Car (Araba) Sınıfı:
 *         Vehicle sınıfından miras alın.
 *         Ek bir özellik olarak numberOfDoors (kapı sayısı) ekleyin.
 *         Getter ve setter metodlarını ekleyin.

 */
public class Car extends Vehicle {

    private int numberOfDoors;


    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
