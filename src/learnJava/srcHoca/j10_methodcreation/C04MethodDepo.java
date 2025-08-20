package learnJava.srcHoca.j10_methodcreation;

public class C04MethodDepo {
    // Bu classta kullanacağım metodları depoladığımı düşünün
    public static int age = 35;
    public static void gecmeNotu(int yilSonuNotu){
        if (101 > yilSonuNotu && yilSonuNotu > 85 ){
            System.out.println("Tebrikler Taktir belgesi aldınız !");
        } else if (yilSonuNotu > 70 ){
            System.out.println("Tebrikler Teşekkür belgesi aldınız !");
        } else if (yilSonuNotu > 50) {
            System.out.println("Tebrikler sınıfı geçtiniz !");
        } else {
            System.out.println(" Seneyi tekrarlamanız daha iyi olacak ");
        }
    }
}
