package learnJava.src.codeChallenge.gun1;

public class DataTypes {
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
    public static void main(String[] args) {
        //byte, short, integer,long, double, float data type'larının max ve min degerlerini print eden code create ediniz.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println();

        double byteMaxValue = Math.pow(2,8)/2-1;
        System.out.println("byteMaxValue = " + byteMaxValue);
        double byteMinValue = byteMaxValue +1 - Math.pow(2,8); //0 sayısını da +1 adet olarak eklemeliyim
        System.out.println("byteMinValue = " + byteMinValue);

        double shortMaxValue = Math.pow(2,16)/2-1;  //manuel olarak bulmak istedim
        System.out.println("shortMaxValue = " + shortMaxValue);
        double shortMinValue = shortMaxValue+1 - Math.pow(2,16);  //0 sayısını da +1 adet olarak eklemeliyim
        System.out.println("shortMinValue = " + shortMinValue);

        double intMaxValue = Math.pow(2,32)/2-1;  // bu hesaplama sonucu neden 2.14 şeklinde görünüyor?  ->(int) e cast edince düzeldi
        System.out.println("intMaxValue = " + (int)intMaxValue);  //intMaxValue = 2.147483647E9   output değerin sonuna E9 neden eklemiştir? ->(int) e cast edince düzeldi
        double intMinValue = intMaxValue+1- Math.pow(2,32);
        System.out.println("intMinValue = " + (int)intMinValue);

        double longMaxValue = Math.pow(2,64)/2-1;  //
        System.out.println("longMaxValue = " + (long)longMaxValue);
        double longMinValue = longMaxValue+1- Math.pow(2,64);
        System.out.println("longMinValue = " + (long)longMinValue);

         /* Note : long kullanırken oluşabilecek bir durum:
         işlemci long datayı önce int olarak kaydetmeye çalışıyor , Int sınırını aşan
         datalarda  sonuna L eklerseniz a sorun yasamıyorsunuz
         */
        long buyuk1 = 2147483647;
        long buyuk2 = 2147483647L;
        //long buyuk3 = 21474836470;  //sonuna 1 basamak daha eklenince hata verdi,
                                    // buradaki durumda integer ın max_value suna kadar
                                    //hata görmüyor, ancak int sınır değeri aştığımızda
                                    //long olduğunu belirtmemizi istiyormuş
                                    //ÖNEMLİ****************************************
        long buyuk3_edited = 21474836470L;
        //long buyuk4 = 2147483648; //hata verdi
        long buyuk4_edited = 2147483648L;
        System.out.println("buyuk4_edited = " + buyuk4_edited);
        long buyuk5 = 2147483647+1; //int değerin min_valuesunu yazdırdı, başa döndü :)
        System.out.println(buyuk5);


    }
}
