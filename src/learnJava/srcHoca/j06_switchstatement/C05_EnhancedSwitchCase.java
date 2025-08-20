package learnJava.srcHoca.j06_switchstatement;

public class C05_EnhancedSwitchCase {

    // Söz dizimi farklıdır. Java 14 ile birlikte,
    // switch artık bir ifade (expression) olarak kullanılabiliyor
    // ok (->) notasyonu ile ifadeler yazılabiliyor.
    // Sonuç döndürebiliyor.
    // Her durum için break kullanımı zorunlu değil;
    // Ayrıca "fall-through" varsayılan olarak yoktur, yani bir case'den diğerine geçilmez.

    // girilen gün sayısına göre haftanın gününü döndüren switch yazalım:

    public static void main(String[] args) {

        int day = 4;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday"; // Değer atamasını switch içinde manuel olarak yapmalısınız
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("dayName = " + dayName);

        String dayN =switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> {
                System.out.println("yazdı da yazdı");

                if (true){
                    System.out.println("gibi birşey");
                }
                yield "Friday";
            }
            default -> "geşerli gün giriniz";
        };
        System.out.println("dayN = " + dayN);

        // Birden fazla değeri kontrol eden case ler yazmak daha kolaydır.
        switch (day) {
            case 1:
            case 2:
            case 3:
                System.out.println("First half of the week");
                break;
            case 4:
            case 5:
                System.out.println("Second half of the week");
                break;
        }

        String result = switch (day) {
            case 1, 2, 3 -> "First half of the week"; // Virgül ile ayırarak birden fazla değeri tek bir case bloğunda tanımlayabilirsiniz.
            case 4, 5 -> "Second half of the week";
            default -> "Invalid day";
        };
    }

}
