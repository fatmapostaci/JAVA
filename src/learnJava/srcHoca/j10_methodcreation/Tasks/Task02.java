package learnJava.srcHoca.j10_methodcreation.Tasks;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
    String name = "meRTay";
    String name2 = "Ali";
    String lastName = "rastgEle";
    name = isimFormatter(name);
    name2 = isimFormatter(name2);

    lastName = isimFormatter(lastName);
     String fullName = name.
             concat(" ").
             concat(name2).
             concat(" ").
             concat(lastName);

        System.out.println("fullName = " + fullName);

    }

    public static String isimFormatter(String deger){
        return deger.
                substring(0,1).
                toUpperCase().      // ilk harfi Büyük yazdırdık
                concat(deger.substring(1).toLowerCase()); // takip eden harfleri kücük yazdırdık

    }
}// Class sonu
