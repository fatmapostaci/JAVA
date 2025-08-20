package learnJava.src.codeChallenge.gun3;

import java.util.Scanner;

public class Task09 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        String mesaj = "Hello1";
        String yeni_mesaj = "Hello1";
        String yeni_mesaj2= new String("Hello1");
        //mesaj = mesaj + "World";
        if (mesaj==yeni_mesaj)
            System.out.println("mesaj ve yeni_mesaj: Adresleri Eşit " );
        if (mesaj.equals(yeni_mesaj))
            System.out.println("mesaj.equals(yeni_mesaj) = " + mesaj.equals(yeni_mesaj));
        if(yeni_mesaj==yeni_mesaj2)
            System.out.println("yeni_mesaj2 ve yeni_mesaj: Adresleri Eşit ");
        if (yeni_mesaj2.equals(yeni_mesaj))
            System.out.println("yeni_mesaj2.equals(yeni_mesaj) = " + yeni_mesaj2.equals(yeni_mesaj));

        Scanner sc = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String str = sc.next();
        boolean flag = false;
        if (str.contains("xyz"))
            flag = true;
        System.out.println("flag = " + flag);
    }


}
