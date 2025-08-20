package learnJava.srcHoca.J27interface.Tasks.Task02;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println(getModel() + ": Diesel tank is refilled");
    }

    @Override
    public String drive() {
        return getModel() + " is driving powerfully";
    }
}
