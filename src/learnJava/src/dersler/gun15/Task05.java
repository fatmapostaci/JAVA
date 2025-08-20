package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
        Scanner scanf = new Scanner(System.in);
        System.out.print("isim soyisim: ");
        String isim_soyisim = scanf.nextLine();
        isim_soyisim=isim_soyisim.replaceFirst(" ",""); //BOŞLUK KARAKTERİNİ SİL
        String yeni_isim_soyisim="";
        for (int i=0;i<isim_soyisim.length();i++){
            yeni_isim_soyisim += isim_soyisim.substring(i,i+1).concat(" ");//HER KARAKTERDEN SONRA BOŞLUK KARAKTERİ EKLER
        }
        System.out.println("yeni_isim_soyisim = " + yeni_isim_soyisim);
    }

}
