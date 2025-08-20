package learnJava.src.codeChallenge.ALLSUBJECTS.inheritancePackage;

public class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}
 class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
     void stop() {
         System.out.println("Car stopped.");
     }
}
 class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
     void stop() {
         System.out.println("Bike stopped.");
     }
}
