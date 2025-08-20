package learnJava.srcHoca.j01_variables;

public class C01_HelloWorld {  // Class baslangici
    // Single line comment -> tek satır yorum yapılır -> ide buraya yazılan komutu okumaz.
    /*
        multiple line comment -> coklu satır yorumu yazmak için kullanılır
        bu araya yazılan kodlar derlenmez
        Başarı gayrete aşıktır.
     */


    // CTRL + C tuşuna imlec herhangi bir yerde iken basılırsa tüm satır kopyalanır
    // CTRL + D tuşuna imlec herhangi bir yerde iken basılırsa üst satır kopyalanır
    // CTRL + Z tuşuna  basılırsa son işlem geri alınır.

    public static void main(String[] args) { // main baslangici
        System.out.println("Hello World1!");
        System.out.println("Hello World2!");
        System.out.println("Hello World3!");
        System.out.println("Hello World4!");
        System.out.println("Hello World! "); // "sout" kısa yolu ile pratik şekilde yazdıralabilir

        System.out.println();
        System.out.println("Hello World!");
        System.out.print("merhaba World! ");
        System.out.println("habari World!");
        System.out.print("anlasildi \nmi \nacaba ? ");
                /*
        print() : yazdirma isleminden sonra komut ayni satirdan devam ettirir
        println() : yazdirma iseminden saonra komut alt satirdan devam eder
        java'da space(bosluk bir karakter olarak tanimlanir(derlenir)
         */

                /*
        java run edildiginde calismaya ilk olarak main method'dan baslar
        daha sonra yukaridan asagi ve soldan saga dogru sirasiyla islem yapar
         */

    } // main sonu

} // Class sonu


// Java candır... :)