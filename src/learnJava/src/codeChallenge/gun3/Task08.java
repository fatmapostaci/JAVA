package learnJava.src.codeChallenge.gun3;

import java.util.Scanner;

public class Task08 {
    /* Task->
     * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        for (int i = 0; i < 4; i++) {
            System.out.print("Kelime girin: ");
            str += sc.next().trim().toLowerCase().replaceAll("[^A-Za-z0-9]","").concat(" ");
            }
        str= str.substring(0,1).toUpperCase().concat(str.substring(1,str.length()-1)).concat(".");
        System.out.println("str = " + str);

    }
}
