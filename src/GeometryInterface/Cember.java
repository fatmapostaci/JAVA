package GeometryInterface;

public class Cember extends DaireselSekil {


    public Cember(double r) {
        super(r);
      }

    @Override
    public double alani() {
        return Math.PI * Math.pow(super.radius,2);
    }

    @Override
    public double cevresi() {

        return 2 * Math.PI * super.radius;
    }

    @Override
    protected double daireDilimininAlanı() {
        return 0;
    }
}
