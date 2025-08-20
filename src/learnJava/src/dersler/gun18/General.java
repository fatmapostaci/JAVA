package learnJava.src.dersler.gun18;

public class General {
    public static void main(String[] args) {
        Addition add = new Addition();
        int sum=add.addIntegerValues(3,4);
        System.out.println("sum = " + sum);
        int sumStatic = Addition.addStaticMethod(3,4);
        System.out.println("sumStatic = " + sumStatic);
        General deneme = new General();
        deneme.metin1();
        metin2();

    }
    public void metin1(){
        System.out.println( "main beni göremez,obje oluşturunca gör" +
                "ünür olurum");
    }
    public static void metin2(){
        System.out.println("main beni tanır, çünkü bende bir asilzadeyim");
    }

}
