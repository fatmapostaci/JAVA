package learnJava.src.dersler.gun42;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{
    public ToyotaPrius(String model, String engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return getModel()+ " is driving efficiently";
    }

    @Override
    public void changeBattery() {
        System.out.println(getModel() + ": Hybrid battery is changed");
    }

    @Override
    public void changeOil() {
        System.out.println(getModel()+ ": Oil is changed");
    }
}
