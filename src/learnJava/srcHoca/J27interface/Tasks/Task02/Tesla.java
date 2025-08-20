package learnJava.srcHoca.J27interface.Tasks.Task02;

public class Tesla extends Vehicle implements IElectric {
    public Tesla(String model, String engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return getModel() + ": is driving silently";
    }

    @Override
    public void changeBattery() {
        System.out.println(getModel() + ": Battery is changed");
    }
}
