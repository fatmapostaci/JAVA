package learnJava.src.dersler.gun30;

public class C03StaticKeyWord {
    final static int defaulNo = 400;
    static int ogrenciSayısı; // Class değişkeni, bütün objeler için aynı , hepsi bu değeri paylaşıyorlar

    int ogrenciId; // her ogrenci için faklı bir değeri olur


    public C03StaticKeyWord() {
        ogrenciSayısı ++; // Cons çağırıldığında ogrenciSayısı increment edilecek.
        ogrenciId = defaulNo +ogrenciSayısı ; // Cons çağırıldığında ogrenciId increment edilecek.
    }

    public static void main(String[] args) {
        C03StaticKeyWord ogr1 = new C03StaticKeyWord();
        C03StaticKeyWord ogr2 = new C03StaticKeyWord();
        C03StaticKeyWord ogr3 = new C03StaticKeyWord();

        System.out.println("ogr3.ogrenciId = " + ogr3.ogrenciId);
        System.out.println("ogr2.ogrenciId = " + ogr2.ogrenciId);
        System.out.println("ogr1.ogrenciId = " + ogr1.ogrenciId);
        System.out.println("ogr1.ogrenciId = " + ogr1.ogrenciSayısı);
        System.out.println("ogr3.ogrenciId = " + ogr3.ogrenciSayısı);

    }



}
