package learnJava.src.project.VehicleManagement;

public class Truck extends Vehicle {
    /*
     *         Truck (Kamyon) Sınıfı:
     *         Vehicle sınıfından miras alın.
     *         Ek bir özellik olarak loadCapacity (yük kapasitesi) ekleyin.
     *         Getter ve setter metodlarını ekleyin.
     */
    private double loadCapacity ;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean checkAvailability(){
        if (loadCapacity > 50000)
            super.setAvailable(false);

        return super.checkAvailability();

    }
}
