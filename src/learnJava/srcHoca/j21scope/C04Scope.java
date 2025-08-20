package learnJava.srcHoca.j21scope;

public class C04Scope {

    public static void main(String[] args) {
        // C01InstanceVariables classından nonstatic methodu çalıştıralım
        C01InstanceVariables obj1 = new C01InstanceVariables();
        obj1.nonstaticMethod(); // non-staticmethodlar obje üzerinden çağrılır
        C01InstanceVariables.staticMethod(obj1);

        // C02StaticVariable classından nonstatic methodu çalıştıralım
        C02StaticVariable obj2 = new C02StaticVariable();
        obj2.nonstaticMethod();
        obj2.staticMethod(); // Bad Conduct ->
        C02StaticVariable.staticMethod();

    }
}
