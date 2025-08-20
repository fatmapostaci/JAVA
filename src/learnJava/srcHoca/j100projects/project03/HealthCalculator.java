package learnJava.srcHoca.j100projects.project03;

import java.util.Scanner;

public class HealthCalculator {
    static String c_RED    = "\u001B[31m";
    static String BOLD     = "\033[0;1m";
    static String c_RESET  = "\u001B[0m";
    static String c_BLUE   = "\u001B[34m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN  = "\u001B[32m";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgileri al
        System.out.print("Cinsiyet (Erkek/Kadin): ");
        String cinsiyet = scanner.nextLine().trim().toLowerCase();

        System.out.print("Yaş: ");
        int yas = scanner.nextInt();

        System.out.print("Boy (cm): ");
        double boyCm = scanner.nextDouble();
        double boyMetre = boyCm / 100;

        System.out.print("Kilo (kg): ");
        double kilo = scanner.nextDouble();

        System.out.println(BOLD+c_BLUE+"Hareket Seviyesi:");
        System.out.println(c_RED+"1 - Masa başı iş / Çok az - Hareketsiz (1.2)");
        System.out.println(c_RESET+c_PURPLE+"2 - Az Aktif / Haftada 1-2 egzersiz (1.3)");
        System.out.println("3 - Orta Aktif / Haftada 3-5 egzersiz (1.55)");
        System.out.println("4 - Çok Aktif / Haftada 6-7 ağır egzersiz (1.7)");
        System.out.println("5 - Çok ağır egzersiz / Ağır iş (1.9)");
        System.out.print("Seçiminiz: ");
        double hareketSeviyesi = scanner.nextDouble();

        // Hesaplamalar
        double bmi = calculateBMI(kilo, boyMetre);
        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f%n", bmi);

        double bazalMetabolizmaHizi = calculateBMR(cinsiyet, kilo, boyCm, yas);
        System.out.printf("Bazal Metabolizma Hızınız: %.2f kcal%n", bazalMetabolizmaHizi);

        double alinmasiGerekenKalori = calculateDailyCalories(bazalMetabolizmaHizi, hareketSeviyesi, bmi);
        if (bmi < 25) {
            System.out.printf("Günlük alınması gereken kalori miktarı: %.2f kcal%n", alinmasiGerekenKalori);
        } else {
            System.out.printf("Zayıflamak için günlük alınması gereken kalori miktarı: %.2f kcal%n", alinmasiGerekenKalori);
        }

        scanner.close();
    }

    /**
     * BMI hesaplama metodu.
     * @param kilo Kullanıcının kilosu (kg).
     * @param boyMetre Kullanıcının boyu (metre).
     * @return BMI değeri.
     */
    public static double calculateBMI(double kilo, double boyMetre) {
        return kilo / (boyMetre * boyMetre);
    }

    /**
     * Bazal Metabolizma Hızı (BMR) hesaplama metodu.
     * @param cinsiyet Kullanıcının cinsiyeti (erkek veya kadın).
     * @param kilo Kullanıcının kilosu (kg).
     * @param boyCm Kullanıcının boyu (cm).
     * @param yas Kullanıcının yaşı.
     * @return BMR değeri.
     */
    public static double calculateBMR(String cinsiyet, double kilo, double boyCm, int yas) {
        if (cinsiyet.equals("kadin")) {
            return (10 * kilo) + (6.25 * boyCm) - (5 * yas) - 161;
        } else if (cinsiyet.equals("erkek")) {
            return (10 * kilo) + (6.25 * boyCm) - (5 * yas) + 5;
        } else {
            throw new IllegalArgumentException("Geçersiz cinsiyet bilgisi!");
        }
    }

    /**
     * Günlük alınması gereken kalori miktarını hesaplayan metot.
     * @param bmr Bazal Metabolizma Hızı.
     * @param hareketSeviyesi Kullanıcının hareket seviyesi katsayısı.
     * @param bmi Kullanıcının BMI değeri.
     * @return Alınması gereken günlük kalori miktarı.
     */
    public static double calculateDailyCalories(double bmr, double hareketSeviyesi, double bmi) {
        double alinmasiGerekenKalori = bmr * hareketSeviyesi;

        if (bmi > 25) { // Zayıflama durumu
            double zayiflamaKalorisi = alinmasiGerekenKalori - 500;
            if (zayiflamaKalorisi < bmr) {
                return bmr; // Günlük kalori bazal metabolizma hızından düşük olamaz
            }
            return zayiflamaKalorisi;
        }

        return alinmasiGerekenKalori;
    }
}
