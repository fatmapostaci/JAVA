package learnJava.src.codeChallenge.ALLSUBJECTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        //Bir ArrayList oluşturun ve içine 5 farklı şehir ismi ekleyin.
        List<String> arrList =new ArrayList<>( List.of("Ankara","İstanbul","İzmir","Sivas","Uşak"));
        //Tüm şehir isimlerini ekrana yazdırın.
        System.out.println(arrList);
        //Oluşturduğunuz ArrayList'e "Adana" şehrini en başa ekleyin.
        arrList.add(0,"Adana");
        //"İzmir" şehrini listeden kaldırın.
        arrList.remove("İzmir");
        System.out.println(arrList);
        //Listedeki 2. sıradaki elemanı "Eskişehir" ile değiştirin.
        arrList.set(1,"Eskişehir");
        System.out.println(arrList);
        //ArrayList'teki tüm şehir isimlerini bir for döngüsü ile yazdırın.
        for(String s : arrList)
            System.out.println(" " + s);
        //Kullanıcıdan bir şehir ismi girmesini isteyin.
        Scanner sc = new Scanner(System.in);
        System.out.print("(şehir ismi ArrayList içinde bulunuyor mu)şehir ismi gir: ");
        String sehir = sc.next();
        //Girilen şehir ismi ArrayList içinde bulunuyorsa ekrana "Şehir listede var." yazdırın.
        if(arrList.contains(sehir)){
            System.out.println("Şehir listede var.");
        }
        //Aksi halde "Şehir listede yok." yazdırın.
        else System.out.println("Şehir listede yok.");
        //Şehirleri alfabetik olarak sıralayın.
        Collections.sort(arrList);
        System.out.println(arrList);
        //ArrayList'i tamamen temizleyin.
         arrList.clear();
        //Listenin boş olduğunu kontrol ederek ekrana "Liste boş." yazdırın.
        if (arrList.isEmpty())
            System.out.println("Liste boş");
        else System.out.println("Liste boş değil ");

    }

}
