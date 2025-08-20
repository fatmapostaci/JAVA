package learnJava.src.dersler.gun29.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ImmutableClasses {
            /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  LocalDate, BigDecimal, BigInteger java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */

    public static void main(String[] args) {
        System.out.println("*********** Immutable Class *****************");
        String name = "Mertay Bey";
        String yeniName = name.concat(" offer haberiniz hayırlı olsun :) ");
        // name = name.concat(" offer haberiniz hayırlı olsun :) ");
        System.out.println("name = " + name);
        System.out.println("yeniName = " + yeniName);

        System.out.println();
        System.out.println("*********** Immutable Class *****************");
        List<String> kelimeList = new ArrayList<>(Arrays.asList("Mertay", "Bey"));
        System.out.println("kelimeList değişiklik öncesi = " + kelimeList);
        kelimeList.add("offer");
        kelimeList.add("haberiniz");
        kelimeList.add("hayırlı");
        kelimeList.add("olsun");
        kelimeList.add(":) ");
        System.out.println("kelimeList değişiklik sonrası = " + kelimeList);
 }
}
