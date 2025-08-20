package learnJava.src.dersler.gun30;

public class ElektrikHesap {
    int toplamTuketim;
    static double oran;
    double fatura;

    public ElektrikHesap() {
        oran = 0.7;
    }

    public int tuketimEkle(int tuketim){
       return toplamTuketim +=tuketim;
    }

    public double odenecekTutar(){
       fatura = oran*toplamTuketim;
        return fatura ;
    }
}
