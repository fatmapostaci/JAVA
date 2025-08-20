package learnJava.srcHoca.j19constructor;

public class C01Constructor2 {

    public static void main(String[] args) {
        C01Constructor ogr1 = new C01Constructor();
        C01Constructor ogr2 = new C01Constructor();
        C01Constructor ogr3 = new C01Constructor();
        C01Constructor ogr4 = new C01Constructor();
        ogr1.name= "Selim";
        ogr2.name= "Selma";
        ogr3.name= "Selime";
        ogr4.name= "Semra";

        ogr1.age= 15;
        ogr2.age= 16;
        ogr3.age= 14;
        ogr4.age= 18;

        ogr1.dersCalis();
        ogr2.dersCalis();
        ogr3.dersCalis();
        ogr4.dersCalis();

        ogr3.selamla();
    }
}
