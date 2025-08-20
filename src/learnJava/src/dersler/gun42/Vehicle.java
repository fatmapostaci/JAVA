package learnJava.src.dersler.gun42;

public class Vehicle {
    private String model;
    private String engine;

    public Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
