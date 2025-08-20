package learnJava.src.dersler.gun37;

public class MethodOverriding {
    /*
    Method Overriding Kuralları
    1.Metot Adı ve Parametre Listesi Aynı Olmalı:

Override edilen metot, aynı isim ve aynı parametre listesine sahip olmalıdır
(method signature aynı olmalıdır).

    2.Erişim Belirleyicisi (Access Modifier) Kısıtlaması:

Overriding metodu, override edilen metottan daha kısıtlayıcı bir erişim belirleyicisi kullanamaz.
Örnek: protected bir metot private olarak override edilemez.
Ancak, daha geniş bir erişim kullanılabilir (ör. protected → public).
Return Tipi (Return Type) Uyumlu Olmalı:

    3.Return tipi, ya aynı olmalı ya da covariant olmalıdır.
Covariant return type: Alt sınıfın dönüş türünü kullanabilirsiniz (örneğin List yerine ArrayList).
Metodun Statik Olmaması Gerekir:

    4.Statik metotlar override edilemez, ancak method hiding ile yeniden tanımlanabilir.

    5.Final ve Private Metotlar Override Edilemez:

final metotlar miras alınabilir, ancak override edilemez.
private metotlar, sadece tanımlandığı sınıf içinde geçerlidir ve alt sınıfta görünmez, dolayısıyla override edilemez.

    6.Throws İfadesi Uyumu:

Override edilen metodun throws ile fırlattığı checked exception'lar:
Aynı exception ya da daha dar bir türev sınıfı (alt sınıfı) olabilir.
Daha geniş kapsamlı exception fırlatılamaz.

    7. @Override Notasyonu Kullanımı:

@Override notasyonu, override ettiğiniz metotların derleme zamanında kontrol edilmesini sağlar.
Zorunlu değildir, ancak kullanımı önerilir.

Superclass Metodunu Kullanma:

    8.Overridden metodu çağırmak için super anahtar kelimesi kullanılabilir.

    9.Polimorfizm ile Kullanım:

Override edilen metotlar, bir superclass referansı kullanılarak çağrıldığında alt sınıfın (subclass) metodu çalışır.


        Animal myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog barks // sound like Dog
     */

}
