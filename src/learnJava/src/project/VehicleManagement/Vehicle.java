package learnJava.src.project.VehicleManagement;
/*
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

 */
public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private boolean isAvailable;
    private double baseRate;
    private int days;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
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

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void drive() {
        System.out.println(brand+ " marka "+ model+ " model arrac kullanılıyor");
    }

    public void drive(int menzil) {
        System.out.println(brand+ " marka "+ model+ " model arrac "+ menzil+ " km  kullanıldı");
    }

    public double calculateRent(int days){

        return  baseRate * days;
    }
     boolean checkAvailability(){
        if(  returnVehicle() == true )
                isAvailable = true;
        else
            isAvailable = false;
        return isAvailable;
    }

    boolean returnVehicle(){
        if(isAvailable==false)
            return true;
        else {
            System.out.println("Araç kiralanmış. Geri gelecek gün sayısı" + days );
            return false;
        }
    }
    void rentVehicle(int days){
        if ( isAvailable == true){
            calculateRent(days);
            isAvailable=false;
        }

    }
}
