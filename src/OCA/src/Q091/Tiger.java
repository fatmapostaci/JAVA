package OCA.src.Q091;

import java.util.ArrayList;
import java.util.List;

public class Tiger extends Cat {
    public static void main(String[] args) {



    }
}
/*91.	Given the following class declarations:
    >public abstract class Animal
    >public interface Hunter
    >public class Cat extends Animal implements Hunter
    >public class Tiger extends Cat

      Which answer fails to compile?

     A) ArrayList<Animal> myListA=new ArrayList<>();
        myListA.add(new Tiger());

     B) ArrayList<Hunter>   myListB=new ArrayList<>();
     myListB.add(new Cat());

     C)ArrayList<Hunter>myListC=new ArrayList<>();
        myListC.add(new Tiger());

      D)ArrayList<Tiger> myListD=new ArrayList<>();
       myListD.add(new Cat());

      E)ArrayList<Animal>myListE=new ArrayList<>();
        myListE.add(new Cat());

       ***********Normalde butun variable nameler myList di ayni isim verince hata verdigi icin asagida numaralandirdim.
     */