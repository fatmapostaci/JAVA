package learnJava.src.dersler.gun34.bmi;

public class Runner {
    public static void main(String[] args) {
        BMI bmi = new BMI("Fatma",160,54,37);
        System.out.println("bmi.getBMI() = " + bmi.getBMI());
        System.out.println("bmi.getStatus() = " + bmi.getStatus());
    }

}
