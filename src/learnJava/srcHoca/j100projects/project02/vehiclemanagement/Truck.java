package learnJava.srcHoca.j100projects.project02.vehiclemanagement;

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

    @Override
    public boolean checkAvailablity() {
        if (loadCapacity > 50000){
            setAvailable(false);
        }
        return super.checkAvailablity();
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}