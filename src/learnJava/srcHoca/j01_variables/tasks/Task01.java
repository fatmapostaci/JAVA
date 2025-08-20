package learnJava.srcHoca.j01_variables.tasks;

public class Task01 {//class level

    /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */

    public static void main(String[] args) {//main level
        System.out.println("merhaba \"Dünya\"" );
        System.out.println("merhaba \'Dünya\'" );
        System.out.println("merhaba \nDünya" );
        System.out.println("merhaba \rDünya" );
        System.out.println("merhaba \tDünya" );
        System.out.println("merhaba \\ Dünya" );

        //  task01 ->   konsola   "Hello ", "World  \ /"   çıktısını print eden code create ediniz.

        System.out.println("Hello \", \"World  \\ /");

        // task02 -> JavaCAN kelimesini her harfini ayrı bir satira gelecek sekilde  print eden code create ediniz.


        // task03 -> "Java" ile hayat cok 'afilli'   çıktısını print eden code create ediniz.


        // task04 -> "Basari" gayrete
        // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..."
        // ifadesi  3 satır sonra ve satır basından 1 tab ileride  print eden code create ediniz.



    }//main sonu


}//class sonu