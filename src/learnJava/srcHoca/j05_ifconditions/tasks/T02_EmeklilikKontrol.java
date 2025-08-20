package learnJava.srcHoca.j05_ifconditions.tasks;

import java.util.Locale;
import java.util.Scanner;

public class T02_EmeklilikKontrol {

    /*
  TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
 */

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Kullanıcıdan cinsiyet, yaş ve prim gün sayısı bilgilerini alıyoruz
                System.out.print("Lütfen cinsiyetinizi giriniz (KADIN/ERKEK): ");
                String cinsiyet = scanner.next().toUpperCase(); // Kullanıcının girdiği karakterleri büyük harfe çeviriyoruz.

                System.out.print("Lütfen yaşınızı giriniz: ");
                int yas = scanner.nextInt();

                System.out.print("Lütfen prim gününüzü giriniz: ");
                int primGunu = scanner.nextInt();

                // Kadınlar için emeklilik kontrolü
                if (cinsiyet.equals("KADIN")) {
                    if (yas >= 60 && primGunu >= 6000) {
                        System.out.println("Emekli olabilirsiniz!");
                    } else {
                        int kalanYas = 60 - yas;
                        int kalanPrim = 6000 - primGunu;

                        if (kalanYas > 0) {
                            System.out.println("Emekli olabilmeniz için " + kalanYas + " yıl daha çalışmanız gerekiyor.");
                        }

                        if (kalanPrim > 0) {
                            System.out.println("Emekli olabilmeniz için " + kalanPrim + " prim günü daha gerekiyor.");
                        }
                    }
                }
                // Erkekler için emeklilik kontrolü
                else if (cinsiyet.equals("ERKEK")) {
                    if (yas >= 65 && primGunu >= 7000) {
                        System.out.println("Emekli olabilirsiniz!");
                    } else {
                        int kalanYas = 65 - yas;
                        int kalanPrim = 7000 - primGunu;

                        if (kalanYas > 0) {
                            System.out.println("Emekli olabilmeniz için " + kalanYas + " yıl daha çalışmanız gerekiyor.");
                        }

                        if (kalanPrim > 0) {
                            System.out.println("Emekli olabilmeniz için " + kalanPrim + " prim günü daha gerekiyor.");
                        }
                    }
                } else {
                    System.out.println("Geçersiz cinsiyet girdiniz! Lütfen KADIN veya ERKEK olarak giriniz.");
                }


            }
        }


