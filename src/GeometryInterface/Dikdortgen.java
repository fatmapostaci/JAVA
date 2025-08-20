package GeometryInterface;

class Dikdortgen implements Davranislar {

    private double en, boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alani() {
        return en * boy;
    }

    @Override
    public double cevresi() {

        return 2 * (en + boy);
    }
}