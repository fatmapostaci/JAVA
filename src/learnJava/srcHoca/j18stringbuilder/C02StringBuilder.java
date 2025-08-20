package learnJava.srcHoca.j18stringbuilder;

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

        System.out.println("sb3 = " + sb3);

        //sb'de istenen index karakteri alma
        System.out.println("sb3.charAt(5) = " + sb3.charAt(5));

        //sb'deki belli araliktaki karakterleri alma
        System.out.println("sb3.substring(5) = " + sb3.substring(5)); // öğrenmekçaba gerektiriyor
        System.out.println("sb3.substring(5) = " + sb3.substring(0,5)); // Java
        CharSequence text =sb3.subSequence(0,5); // CharSequence text tabanlı classların parenti oluyor
        String textStr = (String)text;
        StringBuilder textBuild = new StringBuilder(text);

        //Sb'deki istenen index char'i silme
        System.out.println("sb3.deleteCharAt(3) = " + sb3.deleteCharAt(3));

        //Sb'de istenen aralikta index karakterleri silme
        System.out.println("sb3.delete(0,3) = " + sb3.delete(0, 4)); // öğrenmekçaba gerektiriyor

        //sb'e char ve charlari girdi yapma insert
        System.out.println("sb3.insert(8,\" \") = " + sb3.insert(8, " birden fazla ")); // öğrenmek birden fazla çaba gerektiriyor
        System.out.println("sb3.insert(0,sb1,0,5) = " + sb3.insert(0, sb1, 0, 5)); // Java öğrenmek birden fazla çaba gerektiriyor

        /*
        insert(int offset, CharSequence s, int start, int end)
            offset: Eklemeye başlanacak pozisyon.
            s: Eklenecek CharSequence (örneğin, String, StringBuilder, vb.).
            start: Kaynağın başlangıç indeksidir (dahil).
            end: Kaynağın bitiş indeksidir (hariç).
         */

        //sb'deki istenen index char'i update(set) etme
        sb3.setCharAt(5,'Ö');
        System.out.println("sb3 = " + sb3);

        //sb'deki istenen index birden fazla char set etme
        System.out.println("sb3.replace(14,20,\"...\") = " + sb3.replace(14, 20, "....."));

        //sb obj string variableye cevirme
        String sb3Str = sb3.toString();
        //sb3Str = sb3Str.replace(".....","daha");
        System.out.println("sb3Str = " + sb3Str);

        //str variableyi sb variableye cevirme
        StringBuilder sb4 = new StringBuilder(sb3Str);

        System.out.println("sb3 = " + sb3);
        System.out.println("sb3Str = " + sb3Str);
        System.out.println("sb4 = " + sb4);
        System.out.println("sb1 = " + sb1);

        System.out.println("sb3.compareTo(sb1) = " + sb3.compareTo(sb1));
        System.out.println("sb3.compareTo(sb4) = " + sb3.compareTo(sb4));
        /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
         */


        //sb esitligi
        //trick-> SB'de equals() meth ayni == gibi hem referans hemde value karsilastirmasi yapar true veya false retur eder
        System.out.println("(sb3 == sb4) = " + (sb3 == sb4)); // False
        System.out.println("sb3.equals(sb4) = " + sb3.equals(sb4)); // False
        System.out.println("sb3.equals(sb3Str) = " + sb3.equals(sb3Str)); // False

        //SB'de karakterleri indexe gore ters cevirme yani tersten yazma

        sb3.reverse();
        System.out.println("sb3 = " + sb3);

    }
}
