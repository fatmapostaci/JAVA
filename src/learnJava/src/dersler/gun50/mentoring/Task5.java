package learnJava.src.dersler.gun50.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {

         List<LocalDate> dates = List.of(
                 LocalDate.of(2025, 1, 1),
                 LocalDate.of(2025, 6, 6),
                LocalDate.of(2023, 5, 10),
                LocalDate.now().plusDays(2)
                );

         // T A S K 01)  yalnızca bugünden sonra olan tarihleri filtrelemek ve yazdıralım.
        System.out.println("Bugün : "+LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Bugünden önceki tarihler");

        dates.stream().filter(t -> LocalDate.now().isAfter(t)).forEach(System.out::println);
        System.out.println("Bugünden sonraki tarihler");
        dates.stream().filter(t -> LocalDate.now().isBefore(t)).forEach(System.out::println);

        System.out.println("ikinci yol");
        dates.stream().filter( t-> t.isAfter(LocalDate.now())).forEach(System.out::println);


    }
}
