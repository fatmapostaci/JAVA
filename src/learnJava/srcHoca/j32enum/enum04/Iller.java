package learnJava.srcHoca.j32enum.enum04;

public enum Iller {
    ADANA (1,"Adana","Akdeniz") ,
    ADIYAMAN(2,"Adıyaman","GüneyDoğu"),
    AFYON(3,"Afyon","Ege"),
    AĞRI(4,"Ağrı","Doğu Anadolu"),
    AMASYA(5,"Amasya","Karadeniz");

    private final int plakaNumarasi ;
    private final String sehirAdi;
    private final String bolge;

    Iller(int plakaNumarasi, String sehirAdi, String bolge) {
        this.plakaNumarasi = plakaNumarasi;
        this.sehirAdi = sehirAdi;
        this.bolge = bolge;
    }

    public int getPlakaNumarasi() {
        return plakaNumarasi;
    }

    public String getSehirAdi() {
        return sehirAdi;
    }

    public String getBolge() {
        return bolge;
    }

    @Override
    public String toString() {
        return "{" +
                "plakaNumarasi=" + plakaNumarasi +
                ", sehirAdi='" + sehirAdi + '\'' +
                ", bolge='" + bolge + '\'' +
                '}';
    }

    public static Iller fromPlakaKodu(int kod) {
        for (Iller p : Iller.values()) {
            if (p.getPlakaNumarasi() == kod) {
                return p;
            }
        }
        throw new IllegalArgumentException("Geçersiz plaka kodu: " + kod);
    }
}
