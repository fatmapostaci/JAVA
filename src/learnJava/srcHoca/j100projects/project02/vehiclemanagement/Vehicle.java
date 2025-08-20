package learnJava.srcHoca.j100projects.project02.vehiclemanagement;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private boolean isAvailable;
    private int baseRate;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String brand, String model, int year, boolean isAvailable, int baseRate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isAvailable = isAvailable;
        this.baseRate = baseRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public void drive() {
        System.out.println(brand+ " marka "+ model+ " model arrac kullanılıyor");
    }

    public void drive(int menzil) {
        System.out.println(brand+ " marka "+ model+ " model arrac "+ menzil+ " km  kullanıldı");
    }

    public boolean checkAvailablity() {
        return isAvailable;
    }
    public int CalculateRent(int day) {
        return baseRate*day;
    }
    public void rentVehicle() {
        isAvailable= false;
    }
    public void returnVehicle() {
        isAvailable= true;
    }
}
