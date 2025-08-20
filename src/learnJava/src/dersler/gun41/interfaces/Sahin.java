package learnJava.src.dersler.gun41.interfaces;

public class Sahin extends Tofask implements DisDonanim,IcDonanim,Lastik{
    @Override
    public void motor() {
        System.out.println("Pekde güçlü değil");
    }

    @Override
    public void yakit() {
        System.out.println("Gaz taktırırsan daha az yakar");
    }

    @Override
    public void kapi() {
        System.out.println("Kapıları farklı renkte boyandı");
    }

    @Override
    public void kaporta() {
        System.out.println("Bir iki ezik var");
    }

    @Override
    public void koltuk() {
        System.out.println("Kadife kumaş biraz garip kaçmış");
    }

    @Override
    public void klima() {
        System.out.println("Sıcak havalarda çok işe yarar");
    }

    @Override
    public void tavanAydinlatmasi(int seviye) {
        System.out.println("tavan ışıkları " + seviye+ " seviyesinde aydınlatma yapıyor.");
    }

    @Override
    public void lastikEbatı() {
        System.out.println("14 inch lastikler");
    }

    @Override
    public void jant() {
        System.out.println("Çelik jantlar güzelleştirdi");
    }
}
