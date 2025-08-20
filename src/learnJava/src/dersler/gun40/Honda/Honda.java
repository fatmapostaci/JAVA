package learnJava.src.dersler.gun40.Honda;

public abstract class Honda {
    public abstract void motor();  //abstract class child implement etmek zorunda ,body içermiyor

    public  void sunRoof(){   // concrete method ->child gerek duyarsa override edebilir.
        System.out.println("Sunroof  concrete methodu çağrıldı");
    }
    public abstract void koltuk();  //absrtact method

    public abstract void kapi();   //abstract method

    //abs class içinde concrete değişken oluşturulabilir
    String name = "Fatma";

    //abstract class içinde abstract değişken oluşturulamaz

    //final void finalMethod(); //bodysiz final method olmaz
    final void finalMet(){}   //bu şekilde oldu
    //final abstract void finalMeth();  //abstract ve final method olamaz
    abstract void finalMethod();  //bu şekilde olur
    //private abstract finalM();  //private olamaz çünkü private methodlar override edemez
    //static abstract void finalMethd();  //abstract method static yapılamaz

    // static void finalMetod();  //static method bodysiz olamaz
    static void finalMetod() {  }  //static method bodysiz olamaz


}
