package OCA.src.Q200;
import java.util.ArrayList;
import java.util.List;
class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}
public class Test {
    public static void main(String[] args) {
        List ps=new ArrayList();
        Patient p2=new Patient("Mike");
        ps.add(p2); // burada deger bir daha baska bir degere assign yapilmak zorunda degil cunku burada ekleme
        // yapiliyor
// insert code here
        int f=ps.indexOf(p2); // bu satır yok

        if (f>=0){
            System.out.println("Mike found");
        }
    }

}
/* Which code fragment, when inserted at line 14, enables the code to print Mike Found?
A)  int f=ps.indexOf(p2);

B)  int f=ps.indexOf(Patient("Mike"));

C)  int f=ps.indexOf(new Patient "Mike");

D)  Patient p = new Patient("Mike");
    int f=ps.indexOf(p);

Answer A


*/
