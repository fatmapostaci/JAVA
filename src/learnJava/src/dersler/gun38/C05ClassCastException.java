package learnJava.src.dersler.gun38;

public class C05ClassCastException {
    //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE

    public static void main(String[] args) {
        Object obj = "123";
        System.out.println("obj = " + obj); // ClassCastException

        try {
            String objStr = (String) obj;
            System.out.println("objStr = " + objStr);
        } catch (ClassCastException e){
            System.out.println("Stringe dönüştürülemeyen bir obje ile uğraşıyoruz");
            String str =obj.toString();
            System.out.println("objStr = " + str);
        }

        try {
            int intObj = (int)obj;
            System.out.println("intObj = " + intObj);
        } catch (ClassCastException e){
            System.out.println("int dönüştürülemeyen bir obje ile uğraşıyoruz");
            String str =obj.toString();
            int intObj = Integer.parseInt(str);
            System.out.println("intObj = " + intObj);

        }



    }
}
