package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner scanf = new Scanner(System.in);
        System.out.println("girilen bir metinde harf rakam ve özel karakter sayısını print edelim!");
        System.out.print("Metin girin: ");
        String metin = scanf.nextLine();

        int countDigit = 0, countCharacter = 0, countLetter = 0, i = 0;
        do {

            countCharacter = metin.length() - countDigit - countLetter;
            if (Character.isDigit(metin.charAt(i))) countDigit++;
            if (Character.isLetter(metin.charAt(i))) countLetter++;
            if (Character.isSpaceChar(metin.charAt(i))) countCharacter--;
            i++;

        } while (i < metin.length() - 1);

        System.out.println("countDigit = " + countDigit);
        System.out.println("countCharacter = " + countCharacter);
        System.out.println("countLetter = " + countLetter);


        //aynı soruyu regular expression ile de yapmak istedim
        //metindeki rakam olmayanları sil
        metin = metin.replaceAll("\\s", "");//metindeki boşlukları sil
        countDigit = (metin.replaceAll("\\D", "")).length();
        System.out.println("countDigit = " + countDigit);
        //metinde karakter olmayanları sil
        countCharacter = metin.replaceAll("\\w", "").length();
        System.out.println("countCharacter = " + countCharacter);
        //metinde rakamları sil, metinde karakterleri sil
        countLetter = metin.replaceAll("\\d", "").replaceAll("\\W", "").length();
        System.out.println("countLetter = " + countLetter);


    }

}
