package learnJava.srcHoca.j07_stringmanipulations;

public class C01_Concat {
        /*
        concat() -> methodu içinde parametre aldığı String variable'ı çaliştığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapar.
         */

    public static void main(String[] args) {

        String qa = "Ayşe ";
        String teamLead = "Nesli ";

        System.out.println("(qa + teamLead) = " + (qa + teamLead)); // Ayşe Nesli
        System.out.println( "concat öncesi qa = " + qa); // Ayşe
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));// Ayşe Nesli
        System.out.println( "concat sonrası qa = " + qa); // Ayşe
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));

                /*
        hap bilgi->String meth. variable'de kalici degil gecici degisiklik yapar
        String'de kalici degisiklik yapabilmek icin atama yapmak gerekir
         */
        qa = qa.concat(teamLead); // Atama sonrasında qa nin değeri kalıcı olarak değişir.
        System.out.println("Atama sonrası qa = " + qa);

        /*
        hap Bilgi-> Concat meth. parametre olarak String harici bir deger alirsa o degeri Stringe cevirip concat(Birlestirme) yapar
        concat meth String type harici bir type girilirse bu data type Stringe cevirmek gerekir.Concat String harici kabul etmez
         */
        //System.out.println("teamLead.concat(23) = " + teamLead.concat(23)); // CTE data çeşidi String olmalı
        System.out.println("teamLead.concat(23) = " + teamLead.concat(23 +"")); // CTE data çeşidi String olmalı
        System.out.println("teamLead.concat(String.valueOf(23)) = " + teamLead.concat(String.valueOf(23)));
        System.out.println("teamLead.concat(Integer.toString(23)) = " + teamLead.concat(Integer.toString(23)));
        System.out.println("teamLead.concat(\" \").concat(23+\"\").concat(\"!\").concat(true +\"\") = " + teamLead.concat(" ").concat(23 + "").concat("!").concat(true + ""));
    }
}
