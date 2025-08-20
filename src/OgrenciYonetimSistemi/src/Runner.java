package OgrenciYonetimSistemi.src;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Course matematik = new Course("MATH101","Matematik",3);
        Course sosyalBilgiler = new Course("SOS102","Sosyal Bilgiler",2);
        CoursesAction.courses.add(matematik);
        CoursesAction.courses.add(sosyalBilgiler);


        Student ahmet = new Student("Ahmet","Postacı","ahmetpostaci@gmail.com");
        Student zeynep = new Student("Zeynep","Postacı","zeyneppostaci@gmail.com");
        StudentActions.ogrList.add(ahmet);
        StudentActions.ogrList.add(zeynep);

        menuGiris();

    }
    private static void showMainMenu() {
        System.out.println("----------------------------");
        System.out.print("Hoşgeldiniz! - Seçim yapın:" +
                "\n1 - Öğrenci Menu" +
                "\n2 - Course Menu" +
                "\n3 - Çıkış" +
                "\nSeçim: ");
    }
    public static void menuGiris() {
        Scanner scanner = new Scanner(System.in);
        OgrenciIsleri ogrenciIsleri = new OgrenciIsleri();
        boolean devam = true;
        while (devam) {

            showMainMenu();

            int secim = scanner.nextInt();
            switch (secim) {
                case 1 -> ogrenciIsleri.ogrenciMenu();
                case 2 -> ogrenciIsleri.courseMenu();
                case 3 -> devam = ogrenciIsleri.exitProgram(devam);
                default ->
                        System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }



}
