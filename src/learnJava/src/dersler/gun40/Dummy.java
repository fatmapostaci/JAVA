package learnJava.src.dersler.gun40;

abstract class Teachers {
    public void ucYazılıYap(){ // Concrete method
        System.out.println("2 adet test 1 adet Açık uçlu sınav yap");
    }

    public abstract void ucSozluYap(); // abtract method

}

class MathTeachers extends Teachers{
    @Override
    public void ucSozluYap(){
        System.out.println("3 toplama işlemi sor");
    }

}

class ScienceTeachers extends Teachers{

    @Override
    public void ucSozluYap() {
        System.out.println("2 proje 1 devamsızlık");
    }
}

class ArtTeachers extends Teachers {
@Override
    public void ucYazılıYap(){
    System.out.println("1 Sergi 2 Etkinlik notu ver");
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

        ArtTeachers artTeacher = new ArtTeachers();

    }

}
