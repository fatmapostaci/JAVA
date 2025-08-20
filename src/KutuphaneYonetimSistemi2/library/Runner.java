package KutuphaneYonetimSistemi2.library;

import java.util.Scanner;

import KutuphaneYonetimSistemi2.utilities.TryCatch;

public class Runner {

    public static void main(String[] args) {

        // MainPage, LibraryManagementSystem'i calıstiracak
        Scanner scanner = new Scanner(System.in);

        // Örnek verileri eklemek icin
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addSampleMembers();

        // Uygulama baslatma
        boolean exit = false;
        while (!exit) {

            // Menü seceneklerini gösterme
            lms.memberMenu();

            // Kullanicidan secenek almak icin
            System.out.println("Bir secenek girin: ");
            int choice = TryCatch.intInput();

            // Secime göre işlem yap
            exit = lms.handleMenuChoice(choice);
        }

        System.out.println("Programdan cikiliyor... 🚪");
    }
}