package GeometryInterface;

public class Silindir extends DaireselSekil {

    public Silindir(double radius) {
        super(radius);
    }

    @Override
    protected double daireDilimininAlanı() {
        return 0;
    }


    @Override
    public double alani() {
        return 0;
    }

    @Override
    public double cevresi() {
        return 0;
    }
}
