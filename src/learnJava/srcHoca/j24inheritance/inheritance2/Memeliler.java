package learnJava.srcHoca.j24inheritance.inheritance2;

public class Memeliler extends Hayvanlar{
    public Memeliler() {
        System.out.println("P'siz Memeliler const call edildi");
    }
    public void sutBeslen(){
        System.out.println("Yavrularini sutle beslerler");
    }

    public void dogum(){
        System.out.println("Nur topu gibi yavrusu olur");
    }
}
