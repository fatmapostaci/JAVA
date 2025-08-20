package learnJava.srcHoca.j100projects.project07;

public class Kahve {
    private String name;
    private int kucukBoy;
    private int buyukBoy;
    private int ortaBoy;
    boolean isSutlu;


    public boolean isSutlu() {
        return isSutlu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKucukBoy() {

        return kucukBoy;
    }

    public void setKucukBoy(int kucukBoy) {
        this.kucukBoy = kucukBoy;
    }

    public int getBuyukBoy() {
        return buyukBoy;
    }

    public void setBuyukBoy(int buyukBoy) {
        this.buyukBoy = buyukBoy;
    }

    public int getOrtaBoy() {
        return ortaBoy;
    }

    public void setOrtaBoy(int ortaBoy) {
        this.ortaBoy = ortaBoy;
    }

    public void setSutlu(boolean sutlu) {
        isSutlu = sutlu;
    }

    public Kahve(String name, int kucukBoy, int buyukBoy, int ortaBoy) {
        this.name = name;
        this.kucukBoy = kucukBoy;
        this.buyukBoy = buyukBoy;
        this.ortaBoy = ortaBoy;

    }

}
