package learnJava.srcHoca.j26abstraction.abstraction05;

import java.time.LocalDate;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Kedi kedi1 = new Kedi();
        kedi1.setIsim("Pamuk");
        kedi1.setVahsi(false);
        kedi1.setDogumTarihi(LocalDate.of(2022,8,23));
        System.out.println("kedi1 = " + kedi1);
        kedi1.gunlukUykuSuresi();
        kedi1.yemekMiktari();
        kedi1.yumakIleOynar();

        System.out.println("Kartal..........");
        Kartal kartal1 = new Kartal();
        kartal1.setIsim("Hızlı");
        kartal1.setVahsi(true);
        kartal1.setDogumTarihi(LocalDate.of(2021,12,12));
        System.out.println("kartal1 = " + kartal1);
        kartal1.tavşanAvlar();
        kartal1.yemekMiktari();

        Kedi kedi2 = new Kedi();
        kedi2.setIsim("Mila");
        kedi2.setVahsi(false);
        kedi2.setDogumTarihi(LocalDate.of(2020,12,25));

        Kartal kartal2 = new Kartal();
        kartal2.setIsim("Bubble");
        kartal2.setVahsi(true);
        kartal2.setDogumTarihi(LocalDate.of(2022,11,12));

        ArrayList<Kedi> kediList = new ArrayList<>();

        ArrayList<Hayvan> hayvanList = new ArrayList<>();
        hayvanList.add(kedi1);
        hayvanList.add(kedi2);
        hayvanList.add(kartal1);
        hayvanList.add(kartal2);
        System.out.println("hayvanList = " + hayvanList);

        hayvanList.get(0).gunlukUykuSuresi(); // Farklı data türlerini kendi yöntemleriyle davranacak şekilde bir araya getirdik
        hayvanList.get(0).yiyecegi();

        hayvanList.get(3).gunlukUykuSuresi();
        hayvanList.get(3).yiyecegi();
        System.out.println("hayvanList.get(3).getIsim() = " + hayvanList.get(3).getIsim());

        // Parent data türü ile refere edildiğinde kendi türlerine ait metodları kullanamazlar
        //hayvanList.get(0).yumakIleOyna(); kedi olmasına ragmen yumak ile oynayamıyor

        ((Kedi)hayvanList.get(0)).yumakIleOynar(); // Cast ederek kendi türüne dönüştürebiliriz
        ((Kartal)hayvanList.get(3)).tavşanAvlar();

        System.out.println("Loop başlıyor");
        for (Hayvan hayvan:hayvanList){
            hayvan.yiyecegi();
            if (hayvan instanceof Kedi){
                Kedi kedi = (Kedi)hayvan;
                kedi.yumakIleOynar();
                kediList.add(kedi);
            } else if (hayvan instanceof Kartal) {
                ((Kartal)hayvan).tavşanAvlar();
            }
        }

    }


}
