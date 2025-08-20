package learnJava.src.dersler.gun40.j26abstraction;

abstract class Teachers {
    public Teachers(){
        System.out.println("Teachers cons çalıştı");

    }
    public static void ucYazılıYap(){ // Concrete method
        System.out.println("2 adet test 1 adet Açık uçlu sınav yap");
    }

    public abstract void ucSozluYap(); // abtract method

    public abstract void devamsızlıkAl(); // abtract method

}

class MathTeachers extends Teachers{
    @Override
    public void ucSozluYap(){
        System.out.println("3 toplama işlemi sor");
    }

    @Override
    public void devamsızlıkAl() {

    }

}

class ScienceTeachers extends Teachers{

    @Override
    public void ucSozluYap() {
        System.out.println("2 proje 1 devamsızlık");
    }

    @Override
    public void devamsızlıkAl() {

    }
}

abstract class ArtTeachers extends Teachers {

    /*@Override
    public void ucYazılıYap(){
    System.out.println("1 Sergi 2 Etkinlik notu ver");
}

     */


}

class MusicsTeacher extends ArtTeachers {

    @Override
    public void devamsızlıkAl() {

    }
    @Override
    public void ucSozluYap() {
        System.out.println("Etkinliklerden");
    }
}

public class Dummy {

    public static void main(String[] args) {
        MathTeachers mathTeacher = new MathTeachers();
        mathTeacher.ucYazılıYap();
        mathTeacher.ucSozluYap();


        Teachers teacher = new ScienceTeachers();

    }

}
