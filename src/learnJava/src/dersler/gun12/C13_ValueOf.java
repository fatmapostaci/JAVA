package learnJava.src.dersler.gun12;

public class C13_ValueOf {
        /*
         Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
         Stringlerle matematiksel islemler yapabilmemizi saglar.

         valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
         valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
         */
        public static void main(String[] args) {

            // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz.
            String b1="10000";
            String b2="12000";
            System.out.println(b1 + b2); // 1000012000




            int intb1 = Integer.valueOf(b1);
            int intb2 = Integer.valueOf(b2);
            System.out.println("Bağış toplamı = " + (intb1 + intb2));

            String b3="$10.000";
            String b4="$12.000";

            System.out.println("b3 = " + b3);
            Integer b3Int = Integer.valueOf( b3.replaceAll("[$.]",""));
            System.out.println("b3Int = " + b3Int);
            Integer b4Int = Integer.valueOf( b4.replaceAll("[$.]","") );
            System.out.println("b4Int = " + b4Int);
            // String db3 = b3.replace("$","");
            //db3 = db3.replace(".","");

            String db3 = b3.replaceAll("[$.]","");
            Integer intb3 = Integer.valueOf(db3);
            String db4 = b4.replaceAll("[$.]","");
            int intb4 = Integer.valueOf(db4);
            System.out.println("Toplam Bağiş = " + (intb3 + intb4));

        // Yeni Tc nonuz eskisini yanyana yazdırılarak oluşuyorsa yei tc yi print eden kod yazınız
            int tc=98765432;
            System.out.println("tc = " + tc + tc);
            System.out.println("yeni tc = " + (tc + tc)); // 197530864
            String tcStr = String.valueOf(tc);
            System.out.println("Yeni Tc Nonuz = " + tcStr + tcStr);

         /*
       Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */
            String strA="$13.99";
            String strB="$17.55";
            strA = strA.replace("$","");
            strB = strB.replace("$","");

            double doubleA = Double.parseDouble(strA);
            double doubleB = Double.parseDouble(strB);
            double toplam = doubleA + doubleB;
            String doviz ="$";

            System.out.println("Sayıların toplamı = " +doviz+ toplam);


        }

}
