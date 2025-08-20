package learnJava.srcHoca.j25exceptions;

public class C07NumberFormatException {
    // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE

    public static void main(String[] args) {
        String str = "1,000";
        //int intStr = Integer.parseInt(str); // NumberFormatException

        int id;
        try {
            System.out.println("Try block kodu deniyor....");
            id = Integer.parseInt(str);
            System.out.println("Try Block sorun yakalamadı");

        } catch (NumberFormatException e) {
            System.out.println("sayı formatında olmayan karakterler var ...");
            e.printStackTrace();
        }

        System.out.println("Devam eden kodlarımız çalışmayı sürdürüyor");
    }
}
