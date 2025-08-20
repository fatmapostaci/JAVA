package learnJava.src.codeChallenge.ALLSUBJECTS;
import java.lang.StringBuilder;
public class StringBuilders {
    public static void main(String[] args) {
        //Soru 1: append() Kullanımı
        //Bir StringBuilder nesnesi oluşturun ve içine "Merhaba" metnini ekleyin.
        //Sonuna " Dünya" metnini ekleyin.
        //Sonucu ekrana yazdırın.
        StringBuilder string = new StringBuilder("Merhaba");
        string.append(" Dünya");
        System.out.println(string);
        //
        //Soru 2: insert() Kullanımı
        //Bir StringBuilder nesnesi oluşturun ve içine "Java Programlama" metnini ekleyin.
        StringBuilder nesne = new StringBuilder("Java Programlama");
        //konuma "Dili " metnini ekleyin.
        nesne.insert(nesne.length(),"Dili");
        //Sonucu ekrana yazdırın.
        System.out.println(nesne);
        //Soru 3: replace() Kullanımı
        //Bir StringBuilder nesnesi oluşturun ve içine "Merhaba Dünya" metnini ekleyin.

        StringBuilder stringMerhaba = new StringBuilder("Merhaba Dünya");
        //İlk 7 karakteri "Hello" ile değiştirin.
        stringMerhaba.replace(0,7,"Hello");
        //Sonucu ekrana yazdırın.
        System.out.println(stringMerhaba);
        //Soru 4: delete() Kullanımı
        //Bir StringBuilder nesnesi oluşturun ve içine "Java Öğreniyorum" metnini ekleyin.
        StringBuilder s = new StringBuilder("Java Öğreniyorum");
        //ve 13. karakterler arasını silin.
        s.delete(0,13);
        //Sonucu ekrana yazdırın.
        System.out.println(s);
        //Soru 5: reverse() Kullanımı
        //Bir StringBuilder nesnesi oluşturun ve içine "Kodlama" metnini ekleyin.
        StringBuilder sB = new StringBuilder("Kodlama");
        //Metni ters çevirin.
        sB.reverse();
        //Sonucu ekrana yazdırın.
        System.out.println(sB);
    }

}
