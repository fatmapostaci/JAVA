package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class Task03 {
/*
Task:  Bir cümledeki kelimeleri sırayla yazdır, ancak belirli bir kelimeyi
    gördüğünde (örneğin Java o kelimeyi atla (continue kullan).
    Eğer cümlede son kelimesi geçerse döngüyü sonlandır (break kullan).
 */
public static void main(String[] args) {

    //Scanner sc = new Scanner(System.in);
    //System.out.println(" Bir cümle girin. ");
    //String cumle = sc.nextLine();
    String cumle = "örneğin 'Java' o kelimeyi atla continue, kullan. Eğer cümlede 'son' kelimesi geçerse döngüyü sonlandır. ";
    cumle = cumle.replaceAll("\\p{Punct}","");  //metindeki noktalama işaretlerini temizler
    System.out.println("Son cumle = " + cumle);
    int kelime_sayisi=cumle.split(" ").length;
    System.out.println("Cümledeki kelime_sayisi = " + kelime_sayisi);

    String [] kelime_dizisi = cumle.split(" ");

    for (int i = 0; i < kelime_sayisi; i++) {
        String kelime = kelime_dizisi[i];
        if (kelime.equals("Java")) {
            continue;
        }
        if (kelime.equals("son")) {
            break;
        }
        System.out.println("kelime "+ i + "= "  + kelime);
    }


}
}
















