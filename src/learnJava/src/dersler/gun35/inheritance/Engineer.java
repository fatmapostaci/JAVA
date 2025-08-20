package learnJava.src.dersler.gun35.inheritance;

public class Engineer extends Human{

    private  String projectType;
    private String field;

    public Engineer(String name, String field, String projectType) {
        super(name);
        this.projectType = projectType;
        this.field = field;
    }

    @Override
    public String introduceYourself(){
        return "\nMy name is " + name + ", I work as an " + field + " . I am " + projectType +"." ;
    }

    @Override
    public String toString() {
        return "Engineer-> " +
                " Adı = " + name + " , " +
                " Yaşı = " + age + " , " +
                " Uzmanlık Alanı = " + field +
                " Çalıştığı Proje = " + projectType ;
    }
}
