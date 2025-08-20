package GeometryInterface;

class Kare extends DogrusalSekil {

    private double uzunluk;

    public Kare(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public double alani() {

        return Math.pow(uzunluk,2);
    }

    @Override
    public double cevresi() {

        return 4 * uzunluk;
    }
}