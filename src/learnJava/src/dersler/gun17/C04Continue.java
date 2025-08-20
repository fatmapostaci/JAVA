package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class C04Continue {
        /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
    */

    public static void main(String[] args) {
        // Task-> girilen bir metindeki ' ' karakterlerini kaldırarak yeni metni print eden code cerate ediniz.
        // orn:     Birşeyler yazdım gitti rastgele --> Birşeyleryazdımgittirastgele
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        String newText = "";

        for (int i = 0; i < text.length();i++){
            if (text.charAt(i) == ' '){
                continue;
            }
            newText= newText + text.charAt(i);
        }
        System.out.println("newText = " + newText);

        // Alternatif çözüm ünerisi
        for (int i = 0; i < text.length();i++){
            if (text.charAt(i) == ' '){
                continue;
            }
            System.out.print(text.charAt(i));
        }

    }
}
