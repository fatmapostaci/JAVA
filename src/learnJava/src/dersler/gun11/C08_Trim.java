package learnJava.src.dersler.gun11;

public class C08_Trim {

             /*
          trim()-> İstediğimiz String’in başında veya sonunda varolan boşluk (space)’leri temizler.
         */

    public static void main(String[] args) {
        String str = "     Merhab Dünya !          ";
        System.out.println("str = [" + str +"]");
        System.out.println("str.trim() = [" + str.trim() +"]");
        System.out.println(str); // atama yapılmadığı için str değişmez.


        /*Bilgisayarda her dilin kendi alfabesi ve karakter seti olduğundan, farklı dillerde yazılmış
        metinlerde de çeşitli boşluk türleri olabilir. Java'daki trim() metodu, yalnızca İngilizce
        karakter setindeki (ASCII) klasik boşluk karakterini (space) tanır. Ancak, başka dillerdeki
        metinler veya bazı özel karakter setleri, başka türde boşluk karakterleri de içerebilir.
        Bu tür boşlukları trim() fark etmez. İşte bu yüzden strip() metodu eklendi. strip(),
        sadece İngilizce değil, Unicode standardındaki tüm boşluk karakterlerini algılayıp
        temizleyebilir
         */
        String textWithUnicodeSpace = "\u2003Java Öğreniyorum\u2003";
        System.out.println("textWithUnicodeSpace = [" + textWithUnicodeSpace + "]");
        System.out.println("after trim = [" + textWithUnicodeSpace.trim() + "]");
        System.out.println("after strip = [" + textWithUnicodeSpace.strip() + "]");


    }
}
