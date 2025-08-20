package learnJava.src.OCA;

public class StringManipulation {
    public StringManipulation() {
    }
//kolaydı
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}