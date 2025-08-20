package learnJava.srcHoca.j100projects.project02.zoomanagement;

import java.util.ArrayList;
import java.util.List;

public class ZooManagement {
/*
Hayvanat Bahçesi Yönetim Sistemi Projesi
Adım 1: Sınıf ve Nesne Temelleri
    Ana sınıf oluşturun:
    Animal adında bir sınıf tanımlayın.
    Bu sınıfta name, species, age gibi özellikler (fields) oluşturun.
    Tüm özellikler private olmalı ve getter-setter yöntemleriyle erişilmelidir (encapsulation).

Adım 2: Inheritance (Kalıtım)
    Alt sınıflar oluşturun:
    Mammal, Bird, Reptile gibi Animal sınıfından türeyen sınıflar tanımlayın.
    Her alt sınıf kendine özgü bir özellik eklesin (ör. Bird sınıfına canFly özelliği ekleyebilirsiniz).

Adım 3: Method Overloading
    Metotlarla farklı işlemler yapın:
    Animal sınıfında bir eat() metodu oluşturun.
    eat() metodunu parametresiz ve parametreli (ör. void eat(String food)) olmak üzere iki şekilde tanımlayarak method overloading kavramını uygulayın.

Adım 4: Uygulama (Main Method)
    Ana metodda örnekler oluşturun:
    Farklı hayvanlardan nesneler oluşturun (Lion, Parrot, Snake gibi).
    Nesnelerle getter ve setter yöntemlerini kullanarak veriler ekleyin ve ekrana yazdırın.
    eat() metodunu her nesne üzerinde çağırarak farklı kullanımlarını gösterin.

Ek Adım: Listeleme
    Liste yapısı ekleyin:
    Hayvanları bir ArrayList içinde saklayın.
    Döngü kullanarak listeyi ekrana yazdırın.
 */

    public static void main(String[] args) {
        Animal animal = new Animal("Minik","Tiger",5);
        System.out.println("animal.getName() = " + animal.getName());

        Bird bird = new Bird("Beyaz Kanat","Parrot",2,true);
        Bird bird2 = new Bird("Büyük Kanat","Eagle",2,true);
        Bird bird3 = new Bird("Büyülü Kanat","Hawk",2,true);
        Bird bird4 = new Bird("Bakımlı Kanat","Parrot",2,true);

        System.out.println("bird.getName() = " + bird.getName());
        bird.eat();
        bird.eat("ceed");

        Mammal mammal = new Mammal("Aslan Kral","Lion",9,false);
        System.out.println("mammal.isAquatic() = " + mammal.isAquatic());
        mammal.eat("meat",3);

        Reptile reptile = new Reptile("Kıvrak","Snake",3,false);
        reptile.setVenomous(true);
        reptile.eat();

        List<Bird> birdList = new ArrayList<>();
        List<Bird> eaglList = new ArrayList<>();

        birdList.add(bird);
        birdList.add(bird2);
        birdList.add(bird3);
        birdList.add(bird4);

        for (Bird kus: birdList){
            if (kus.getSpecies().equals("Parrot")){
                eaglList.add(kus);
            }
        }

        System.out.println(eaglList);

    }
}
