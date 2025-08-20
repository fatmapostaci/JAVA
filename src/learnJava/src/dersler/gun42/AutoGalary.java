package learnJava.src.dersler.gun42;

import java.util.ArrayList;

public class AutoGalary {

    public static void main(String[] args) {

        // Araçlardan birer nesne oluşturuluyor
        Tesla teslaCar = new Tesla("Tesla Model S", "Electric Engine");
        ToyotaPrius prius = new ToyotaPrius("Toyota Prius","Hybrid Engine");
        Bus cityBus = new Bus("City Bus", "Diesel Engine");


        // Araçlar ArrayListe ekleniyor
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(teslaCar);
        vehicles.add(prius);
        vehicles.add(cityBus);

       // System.out.println(vehicles);

        // Araçların class isimleri ekrana yazdırılıyor
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.getClass().getSimpleName());
        }


        System.out.println(vehicles);


    }
}
