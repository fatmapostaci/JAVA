package learnJava.src.dersler.gun37;


public class Runner {

    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        System.out.println("h1.m = " + h1.m); // 3

        Memeli m1 = new Memeli();
        System.out.println("m1.m = " + m1.m); // 1

        Kedi k1 = new Kedi();
        System.out.println("k1.c = " + k1.c); // 2
        System.out.println("k1.a = " + k1.a);// 0;
        System.out.println("k1.m = " + k1.m); // 1
        System.out.println("k1.m = " + k1.d); // 7

        System.out.println("**************** String Kedi *************");
        Kedi k2 = new Kedi("Pamuk");
        k2.mA(); // Hayvanlar Classında mA Çalıştı
        k2.mC(); // Kediler Classında mC Çalıştı
        k2.mM(); // Memeliler Classında mM Çalıştı

        Memeli k3 = new Kedi();
        System.out.println("k3.m = " + k3.m); // 1
        System.out.println("k3.a = " + k3.a); // 0
        System.out.println("k3.c = " + k3.c); // 6
        k3.mA(); // Hayvanlar Classında mA Çalıştı
        k3.mM(); // Memeliler Classında mM Çalıştı
        k3.mC(); // Kediler Classında mC Çalıştı

        Hayvan k4 = new Kedi();
        System.out.println("k4.m = " + k4.m); // 3
        System.out.println("k4.a = " + k4.a); // 0
        System.out.println("k4.c = " + k4.c); // 9
        //System.out.println("k4.d = " + k4.d); // Hayvan referansıyla Kedi Objesinde d değişkenine ulaşamayız
        k4.mA(); // Hayvanlar Classında mA Çalıştı
        k4.mM(); // Memeliler Classında mM Çalıştı
        //k4.mC(); // Hayvan Classında mC metodu yok.
    }
    // Note :1 Alt sınıfta, üst sınıfta tanımlı bir özellik (field) ile aynı ada
    // sahip bir özellik tanımlanır. Bu durumda:
    //
    //Parent class değişkeni, parent class referansıyla erişildiğinde görünür.
    //Child class değişkeni, child class referansıyla erişildiğinde görünür.


    // Note :2 Metotlar polymorphism kurallarına göre çalışır. Eğer bir metot hem parent
    // hem child sınıfta tanımlıysa, nesne tipine bakılarak uygun olan metot
    // çalıştırılır (dynamic binding).


    // Java’da metotlar overriding ile çalışırken, özellikler shadowing ile çalışır.
}
