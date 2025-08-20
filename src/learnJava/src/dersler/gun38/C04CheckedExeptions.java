package learnJava.src.dersler.gun38;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04CheckedExeptions {


    public static void main(String[] args)  {
        String path = "src/j25exceptions/herhangibirsey";
        readMyFile(path);
        
    }

// Note: try catch block ile exception bir metodda handle edilirse
    public static void readMyFile(String yol)  {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(yol);

            int k=0;
            while (true) {
                try {
                    if (((k = fis.read()) == -1)) break;
                } catch (IOException e) {
                    System.out.println("belirttiğiniz dosyadaki karakter dilini bilmiyorum");
                    e.printStackTrace();

                }  //fis obj ile read() meth erisilebilen dosyadaki her bir char'in ascii degeri -1 olana kadar tekrar tanimlandi
                System.out.print((char) (k)); //k int ascii olan file degeri char icin casting yapildi->type donusumu

            }
        } catch (FileNotFoundException e) {
            System.out.println("Belirttiğiniz adrestte dosyayı bulamadım. Tekrar kontrol edermisiniz ");
            e.printStackTrace();

        }


    }

}
