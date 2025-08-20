package learnJava.src.dersler.gun29.mentoring;

public class C02StringBuilder {

    public static void main(String[] args) {
        //StringBuilder create etme -> Decleration
        //1.yol
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        // String buildera karakter ekleme -> concat etmek:
        sb1.append("Java öğrenmek");
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append(" çaba gerektiriyor");
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("1234");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        //capasity asiminda yenicapasity=eskicapasity*2+2 seklinde hesaplanir

        System.out.println("------------- 2. Yol ------------------");
        //2.yol
        StringBuilder sb2 = new StringBuilder("Java öğrenmek");
        //initialize edilmis sb capasity=16+ilkdeger.length()

        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());
        sb2.append("çaba gerektiriyor ");
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());


        //trimtosize()->capasity'deki length fazlasi degerleri siler
        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //3.yol
        StringBuilder sb3 = new StringBuilder(17);
        sb3.append("Java öğrenmek");
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

        sb3.append("çaba gerektiriyor");
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

         sb3.subSequence(2,4);
        System.out.println(sb3);

        StringBuilder test = new StringBuilder(2+" sdf" +3+2+"sdf  ");
        System.out.println(test);

        StringBuilder test2 = new StringBuilder(2);
        System.out.println(test);

        test.insert(0,"A");
        System.out.println(test);

        //sb'de istenen index karakteri alma

        //sb'deki belli araliktaki karakterleri alma

        //Sb'deki istenen index char'i silme

        //Sb'de istenen aralikta index karakterleri silme

        //sb'e char ve charlari girdi yapma insert
/*
        insert(int offset, CharSequence s, int start, int end)
            offset: Eklemeye başlanacak pozisyon.
            s: Eklenecek CharSequence (örneğin, String, StringBuilder, vb.).
            start: Kaynağın başlangıç indeksidir (dahil).
            end: Kaynağın bitiş indeksidir (hariç).
         */

        //sb'deki istenen index char'i update(set) etme

        //sb'deki istenen index birden fazla char set etme

        //sb obj string variableye cevirme

        //str variableyi sb variableye cevirme

        /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
         */


        //sb esitligi
        //trick-> SB'de equals() meth ayni == gibi hem referans hemde value karsilastirmasi yapar true veya false retur eder

        //SB'de karakterleri indexe gore ters cevirme yani tersten yazma


    }
}
