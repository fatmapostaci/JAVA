package learnJava.srcHoca.j100projects.project03;

import java.util.Scanner;

public class versioyon01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan bilgiler alınıyor
            String cinsiyet = getCinsiyet(scanner);
            int yas = getIntegerInput(scanner, "Yaş: ");
            double boyCm = getDoubleInput(scanner, "Boy (cm): ");
            double kilo = getDoubleInput(scanner, "Kilo (kg): ");
            double hareketSeviyesi = getHareketSeviyesi(scanner);

            // Hesaplamalar
            double bmi = calculateBMI(kilo, boyCm);
            double bazalMetabolizmaHizi = calculateBMR(cinsiyet, kilo, boyCm, yas);

            System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f%n", bmi);
            System.out.printf("Bazal Metabolizma Hızınız: %.2f kcal%n", bazalMetabolizmaHizi);

            if (bmi < 25) {
                double alinmasiGerekenKalori = calculateCalorieNeed(bazalMetabolizmaHizi, hareketSeviyesi);
                System.out.printf("Günlük alınması gereken kalori miktarı: %.2f kcal%n", alinmasiGerekenKalori);
            } else {
                double zayiflamaKalorisi = calculateWeightLossCalories(bazalMetabolizmaHizi, hareketSeviyesi);
                System.out.printf("Zayıflamak için günlük alınması gereken kalori miktarı: %.2f kcal%n", zayiflamaKalorisi);
            }

            scanner.close();
        }

        // Kullanıcıdan cinsiyet bilgisi alma
        private static String getCinsiyet(Scanner scanner) {
            System.out.print("Cinsiyet (Erkek/Kadin): ");
            return scanner.nextLine().trim().toLowerCase();
        }

        // Kullanıcıdan tamsayı veri alma
        private static int getIntegerInput(Scanner scanner, String prompt) {
            System.out.print(prompt);
            return scanner.nextInt();
        }

        // Kullanıcıdan ondalıklı veri alma
        private static double getDoubleInput(Scanner scanner, String prompt) {
            System.out.print(prompt);
            return scanner.nextDouble();
        }

        // Kullanıcıdan hareket seviyesi bilgisi alma
        private static double getHareketSeviyesi(Scanner scanner) {
            System.out.println("Hareket Seviyesi:");
            System.out.println("1 - Masa başı iş / Çok az - Hareketsiz (1.2)");
            System.out.println("2 - Az Aktif / Haftada 1-2 egzersiz (1.3)");
            System.out.println("3 - Orta Aktif / Haftada 3-5 egzersiz (1.55)");
            System.out.println("4 - Çok Aktif / Haftada 6-7 ağır egzersiz (1.7)");
            System.out.println("5 - Çok ağır egzersiz / Ağır iş (1.9)");
            System.out.print("Seçiminiz: ");
            return scanner.nextDouble();
        }

        // BMI hesaplama
        private static double calculateBMI(double kilo, double boyCm) {
            double boyMetre = boyCm / 100;
            return kilo / (boyMetre * boyMetre);
        }

        // Bazal Metabolizma Hızı hesaplama
        private static double calculateBMR(String cinsiyet, double kilo, double boyCm, int yas) {
            if (cinsiyet.equals("kadin")) {
                return (10 * kilo) + (6.25 * boyCm) - (5 * yas) - 161;
            } else if (cinsiyet.equals("erkek")) {
                return (10 * kilo) + (6.25 * boyCm) - (5 * yas) + 5;
            } else {
                throw new IllegalArgumentException("Geçersiz cinsiyet bilgisi!");
            }
        }

        // Günlük alınması gereken kalori miktarı hesaplama
        private static double calculateCalorieNeed(double bmr, double hareketSeviyesi) {
            return bmr * hareketSeviyesi;
        }

        // Zayıflamak için alınması gereken kalori miktarı hesaplama
        private static double calculateWeightLossCalories(double bmr, double hareketSeviyesi) {
            double zayiflamaKalorisi = calculateCalorieNeed(bmr, hareketSeviyesi) - 500;
            return Math.max(zayiflamaKalorisi, bmr);
        }
    }

