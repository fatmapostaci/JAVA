package learnJava.src.codeChallenge.ALLSUBJECTS.inheritancePackage;


 class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Vehicle vCar = new Car();
        vCar.start();

        Vehicle vBike = new Vehicle();
        vBike.start();
    }
}
