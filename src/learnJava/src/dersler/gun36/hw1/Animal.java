package learnJava.src.dersler.gun36.hw1;
/*
Task:
Bir Animal (Hayvan) sınıfı oluşturun. Bu sınıfın:
name ve age adında iki özelliği olsun.
eat() ve sleep() adında iki metodu olsun. Metotlar ekrana basit bir mesaj yazsın (örn: "Hayvan yemek yiyor").
Dog ve Cat adında iki sınıf oluşturun ve Animal sınıfından miras alın.
Dog sınıfına:
bark() adında bir metot ekleyin.
Cat sınıfına:
meow() adında bir metot ekleyin.
Main metodunda Dog ve Cat nesneleri oluşturup tüm metodlarını çağırın.
 */
public class Animal {

    String name ;
    int age;

    int  eat(){
        System.out.println("animal eats");
        return 0;

    }

    void sleep(){
        System.out.println("animal sleeps");
    }

}
