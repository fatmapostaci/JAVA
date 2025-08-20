package learnJava.src.dersler.gun11;

public class C07_IsEmpty {
/*
  String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
  isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
  Yani o String'in length() 0 demektir.
  length()==0 demek isEmpty() true verir demektir.
 */

    public static void main(String[] args) {
        String str = "Madem geldin dünyaya otur çalış Javaya!";
        System.out.println("str.isEmpty() = " + str.isEmpty()); // false
        System.out.println("str.isBlank() = " + str.isBlank()); // false

        String str1 = " ";
        System.out.println("str1.length() = " + str1.length()); // 1
        System.out.println("str1.isEmpty() = " + str1.isEmpty()); // false

        String str2 = "";
        System.out.println("str2.length() = " + str2.length()); // 0
        System.out.println("str2.isEmpty() = " + str2.isEmpty()); // true


        String str3 = null;
       // System.out.println("str3.length() = " + str3.length()); // RTE referansı olmayan string ile işlem yapılamaz
       // System.out.println("str3.isEmpty() = " + str3.isEmpty()); // RTE

        // isBlank string whitespace karakterlerden oluşuyorsa veya empty ise true döner.
        String str4 = "              ";
        System.out.println("str4.length() = " + str4.length());
        System.out.println("str4.isEmpty() = " + str4.isEmpty()); // false
        System.out.println("str4.isBlank() = " + str4.isBlank()); // true
        System.out.println("str2.isBlank() = " + str2.isBlank()); // true


    }
}
