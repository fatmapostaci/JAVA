package learnJava.src.OCA;

public class DenemeImmutableRun {
    public static void main(String[] args) {
        DenemeImmutable de = new DenemeImmutable("a", 32);
        DenemeImmutable de2 = new DenemeImmutable("s", 1);
        System.out.println(de);
        System.out.println(de2.toString());
        de2 = de;
        System.out.println(de2);
    }
}
