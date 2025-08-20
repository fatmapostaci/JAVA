package learnJava.srcHoca.j32enum.enum04;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Iller.ADANA.plakaNumarasi = " + Iller.ADANA.getPlakaNumarasi());
        System.out.println("Iller.AFYON.plakaNumarasi = " + Iller.AFYON.getPlakaNumarasi());
        String il = Iller.AFYON.getSehirAdi();
        System.out.println("Iller.AFYON.bolge = " + Iller.AFYON.getBolge());

        System.out.println("Arrays.toString(Iller.values()) = " + Arrays.toString(Iller.values()));

        Iller arananIl = Iller.fromPlakaKodu(3);
        System.out.println("arananIl = " + arananIl);
    }
}
