package learnJava.srcHoca.j99_codechallenge.codechallenge03;

public class Task03 {
    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str1= "$13.99"
    // String str2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.
     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1) \\d    ==> tum rakamlar
           \\D    ==> tum rakam disi character ler
        2) \\w   ==> A->Z    a->z         0->9    _
           \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
        3) \\s   ==> space
           \\S   ==> space disindaki hersey  */
    public static void main(String[] args) {
        String str1 = "$13.99"; //"13.99"
        String str2 = "$10.55";

        // String değerleri double olabilecek formata dönüştür:

        str1 =str1.replaceAll("[^0-9.]","");
        str2 =str2.replaceAll("[^0-9.]","");

      //  str1=  str1.substring(1);
      //  str2=  str2.substring(1);

        /*
        String strb = str2.replace(".","_");
        String strbb = strb.replaceAll("\\W","");
        String str2son = strbb.replace("_",".");
         */

        // Stringi double dataya dönüştür
        double price1 = Double.parseDouble(str1);
        double price2 = Double.parseDouble(str2);

        double totalPrice = price1 +price2;
        System.out.println("totalPrice = $" + totalPrice);


    }
}







