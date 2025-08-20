package GeometryInterface;

abstract class DaireselSekil implements Davranislar{

    protected double radius;
    protected static final double PI=3.14;

    public DaireselSekil(double radius) {
        this.radius = radius;
    }

    abstract double daireDilimininAlanı();


}
