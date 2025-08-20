package learnJava.srcHoca.j100projects.project02.vehiclemanagement;

public class Motorcyle extends Vehicle {
    private boolean hasSidecar;

    public Motorcyle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


}
