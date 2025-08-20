package learnJava.src.dersler.gun28;

import java.time.Duration;
import java.time.LocalTime;

public class C01StringBuilder {
         /*
   String = > daha yavas ,Immutable==> degismez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

    1) Java pass-by-value kullanir. -> makyaj dublor
    2) String Class'i immutable Class'dir. meth datayı değiştirmez

   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

   StringBuffer =mutable==>degisebilir,less efficient/ daha yavas (String Builderdan yavaş Stringden hızlı) ,
   StringBuffer synchronized,thread safe.


   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
      StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
      "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
      "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
      "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
      Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
				 */

    public static void main(String[] args) {
        // task-> 3333 tekrarlı loop ile String variable ve StringBuilder obj run time surelerini karşılaştıran code create ediniz
    String str = "";
        LocalTime strBasl = LocalTime.now();
    for (int i = 0; i<3333; i++){
       str = str.concat(String.valueOf(i));
       //str.concat(i+"");
        // str+=i;
    }
        LocalTime strBitis = LocalTime.now();
        Duration strSuresi = Duration.between(strBasl,strBitis);

    StringBuilder strBuilder = new StringBuilder();

        LocalTime strBuildBasl = LocalTime.now();
        for (int i = 0; i<3333; i++){
        strBuilder.append(i);
        }
        LocalTime strBuildBitis = LocalTime.now();
        Duration strBuildSuresi = Duration.between(strBuildBasl,strBuildBitis);

        System.out.println("strSuresi = " + strSuresi);
        System.out.println("strBuildSuresi = " + strBuildSuresi);


    }
}
