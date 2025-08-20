package learnJava.src.dersler.gun41.mentoring;

public class Runner {

    public static void main(String[] args) {

        Arac binekArac = new Binek("34EA456",2000,"Volvo",5);
        binekArac.aracBilgileriniGoster();
        System.out.println("Binek araç kiralama bedeli: "+ binekArac.kirala(3));

        Binek childBinekArac = new Binek("34EA456",2000,"Volvo",5);
        childBinekArac.kirala(3);

        //obje type ı Binek olursa, kendine özel metholara ulaşabilir
        //onje type ı Arac olduğunda, child classının methodunu çağıramıyorum.
        childBinekArac.binekSeyahatEdiyor();


        Arac ticariArac = new Ticari("35ASD5453",700,"Doblo",8);
        ticariArac.aracBilgileriniGoster();
        System.out.println("Ticari araç kiralama bedeli: "+ ticariArac.kirala(6));

    }
}
