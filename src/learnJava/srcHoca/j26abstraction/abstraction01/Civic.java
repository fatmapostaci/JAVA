package learnJava.srcHoca.j26abstraction.abstraction01;

public class Civic extends Honda{

        /*
    extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
    java CTE verdi
    çözüm:
    a) Unımplemented (uyarlanmamış) method implement edilmeli
    b)parent Honda class'dan abstract keyword kaldırılmalı
    c)concrete olan child Civic class abstract tanımlanmalı
  */

    //concrete child Class abs. meth tanımlanır mı? -> Hayır
    @Override
    public void motor() {
        System.out.println("1.6 motor bu model için yeterli");
    }

    @Override
    public void koltuk() {
        System.out.println("Kumaş koltuklar ile ekonomik bir araç oluşturuldu");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapılı hafif malzemeler kullanıldı");
    }


}
