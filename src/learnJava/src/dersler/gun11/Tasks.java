package learnJava.src.dersler.gun11;

import java.util.Scanner;

import static java.lang.System.in;

public class Tasks {
    public static void main(String[] args) {
       /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        //Task-> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
        Scanner scanf = new Scanner(in);
        System.out.println("Gmail hesabınızı girin: ");
        String mail = scanf.next();
        System.out.println(mail.endsWith("@gmail.com") ? "Kabul edildi" : "lütfen gmail uzantılı mail giriniz");

                /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */

        //str'nin son 10 karaterini print ediniz
        Scanner scanf2 = new Scanner(System.in);
        System.out.println("String girin: ");
        String str = "\"Madem geldin dünyaya otur çalış Javaya!";//scanf2.nextLine();
        System.out.println(str);
        System.out.println(str.substring(str.length() - 10));

        //str.nin ilk 10 karakterini print ediniz
        System.out.println(str.substring(0, 10));

//str'nin ilk karaterini print ediniz
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0, 1));

        //str'nin son karakterini print ediniz

        System.out.println(str.substring(str.length() - 1));


// task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. ->
        int i;
//        Scanner scanf2 = new Scanner(System.in);
        System.out.println("Kelime girin: ");
        String kelime = scanf2.next();
        for( i=kelime.length()-1;i>=0;i--)
            System.out.print(kelime.substring(i,i+1));
//            System.out.print(kelime.charAt(i));


        /*
  String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
  isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
  Yani o String'in length() 0 demektir.
  length()==0 demek isEmpty() true verir demektir.
 */


    }
}
