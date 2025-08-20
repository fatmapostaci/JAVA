package learnJava.srcHoca.j24inheritance.inheritance1;

public class Ogretmen extends Insan{
    // Ogretmen Classı Insan Classını extend ediyor ( Ogretmen -> Child ; Insan Class -> Parent)
    // Private memberlar hariç hepsi extend edilir

    String brans;

    public void odevVer(){
        System.out.println("Oğretmenler ödev verir");
    }
}
