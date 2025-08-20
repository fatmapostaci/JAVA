package learnJava.src.dersler.gun6;

public class Task02_DataTypes {

    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */

//byte, short, integer,long, double, float data type'larının max ve min degerlerini print eden code create ediniz.
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);


        /* Note : long kullanırken oluşabilecek bir durum:
         işlemci long datayı önce int olarak kaydetmeye çalışıyor , Int sınırını aşan
         datalarda  sonuna L eklerseniz a sorun yasamıyorsunuz
         */

        long buyuk = 2147483645; // int sınırı içinde
        long buyuk2 = 214748364L;
        // long buyuk3 = 21474836470; // int sınırını asınca hata veriyor

        long buyuk3 = 21474836470L;



    }
}
