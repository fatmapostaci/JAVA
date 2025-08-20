package learnJava.src.dersler.gun40.j26abstraction.abstraction03;

abstract class Sekil {
    String name;
    abstract void alan();
    abstract void cevre();
    void ciz(){}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String string = "Sekil{" +
                "name='" + name + '\'' +
                '}';
        return string;
    }
}
class Dikdortgen extends Sekil{
    @Override
    void alan() {
        System.out.println("dikdörtgenin alanı hesplanıyor");

    }

    @Override
    void cevre() {
        System.out.println("dikdörtgenin cevresi hesplanıyor");

    }
}
class Cember extends Sekil{
    @Override
    void alan() {
        System.out.println("cemberin alanı hesplanıyor");
    }

    @Override
    void cevre() {
        System.out.println("cemberin cevresi hesplanıyor");
    }
}
class Runner{
    public static void main(String[] args) {
        Cember cemb = new Cember();
        cemb.alan();
        cemb.ciz();
    }
}