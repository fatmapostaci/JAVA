package learnJava.srcHoca.j25exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03CheckedExeptions {
    /*
            Dosya okuma/yazma işlemi bu işlemlerde hata ihtimali yüksek olduğu için  hata kontrolü zorunlu tutuluyor.
            bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surunlara karşılk gelen hatalara Checked Exception denir
            Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


           Bir code create edilirken olasi exception'lar ongorulup exception olustugunda Java'nin ne yapmasini istedigimiz
           belirtilmelidir.


                    1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                    2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                Class'inin parent class
        */

    //public static void main(String[] args) throws FileNotFoundException, IOException {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "src/j25exceptions/herhangibirsey";
        readMyFile(path);
        Thread.sleep(2000);
    }

// Note: throws key wordü ile exception bir metodda handle edilirse bu metodun her kullanıldıgı metodda exception tekrar handle edilimelidir
    public static void readMyFile(String yol) throws IOException {
        FileInputStream fis = new FileInputStream(yol);
        //fis-> path(yolu:kaynagı) tanımlanan file erişim saglayan obj create edildi
        // FileNotFoundException -> erişilmesi gereken filepath (dosya kaynagı) yanlışsa isitisnası:adres yanlışsa

            /*
            int initial = fis.read();
            int second = fis.read();
        System.out.println("initial = " + (char)initial);
        System.out.println("second = " + (char)second);
             */

        int k;
        while ((k = fis.read()) != -1) {  //fis obj ile read() meth erisilebilen dosyadaki her bir char'in ascii degeri -1 olana kadar tekrar tanimlandi
            System.out.print((char) (k)); //k int ascii olan file degeri char icin casting yapildi->type donusumu

        }
    }

}
