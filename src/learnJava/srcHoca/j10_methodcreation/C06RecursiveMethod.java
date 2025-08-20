package learnJava.srcHoca.j10_methodcreation;

import java.util.Scanner;

public class C06RecursiveMethod {
    /*
        Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
        çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
        Bu yüzden Recursive(özyineleme) ile yapılan hesaplamalar daha yavaş ve verimsizdir.
        Peki Recursive(özyineleme) neden kullanıyoruz?
        Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
    */

    public static void main(String[] args) { // main başlangıcı
        /*
        Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir
        1!=1 0!=1 2!=2*1... 6!=6*5*4*3*2*1
        Task : girilen sayının faktöriyelini hesaplayan method create ediniz.
         */

        // Kullanıcıdan sayı al
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int number = scan.nextInt();

        // sayının faktoriyeli hesaplanacak
        System.out.println("1 = " + faktoriyel(number));
    } // main sonu

    public static int faktoriyel(int num){
        if (num > 1) {
            System.out.print(num + "*");
            return num * faktoriyel(num -1);
        } else {
            //System.out.print("1");
            return 1;
        }
    }


}
