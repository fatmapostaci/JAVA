package learnJava.src.project.VehicleManagement;
/*
 *         Motorcycle (Motosiklet) Sınıfı:
 *         Vehicle sınıfından miras alın.
 *         Ek bir özellik olarak hasSidecar (yan sepet var mı) ekleyin.
 *         Getter ve setter metodlarını ekleyin.
 */
public class Motorcycle extends Vehicle {

    private boolean hasSideCar ;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

}
