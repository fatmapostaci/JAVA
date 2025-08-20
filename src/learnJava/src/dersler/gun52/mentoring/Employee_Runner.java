package learnJava.src.dersler.gun52.mentoring;

import dersler.gun50.Tasks.SeedMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee_Runner {

    public static void main(String[] args) {
        Employee e1 = new Employee("Semgul", 34, "IT", 57.000);
        Employee e2 = new Employee("Mertay", 24, "General Operation", 35.000);
        Employee e3 = new Employee("Fatma", 36, "General Operation", 47.000);
        Employee e4 = new Employee("Tugba", 25, "IT", 55.000);
        Employee e5 = new Employee("Mehmet", 33, "General Operation", 41.000);
        Employee e6 = new Employee("Rabia", 22, "Project Office", 25.000);
        Employee e7 = new Employee("Aziz", 35, "Project Office", 25.000);



        List<Employee> employeeList = new ArrayList<>(List.of(e1,e2,e3,e4,e5,e6,e7));

        // T A S K 01) Maaşı 30.000'den fazla olan çalışanları listele ve adlarını büyük harfle yazdır:

        employeeList.stream()
                .filter(t->t.getSalary()>30.000)
                .map(t->t.getName().toUpperCase())
                .forEach(System.out::println);

        // T A S K 02) Çalışanların yaş ortalamasını bul (yaş filtresi: sadece 30-50 yaş aralığı):
        System.out.println(employeeList.stream()
                .filter(t -> t.getAge() > 30 && t.getAge() < 50)
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble());  //34.5

        // T A S K 03) Her departmanda çalışan sayısını gruplayarak yaz:

        Map <String,Long> mapOfEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println(mapOfEmployees);

        // T A S K 04) İlk 3 yüksek maaşlı çalışanı bul ve listele:
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .peek(e->{
                    if(e.equals(employeeList.get(0))){
                        System.out.println("İlk 3 yüksek maaşlı çalışan: ");
                    }
                })
                .map(Employee::getName)
                .forEach(SeedMethods::yazdir);

//update etme işlemi için peek yerine map kullanarak işlem yapmalıyız.
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(e->{
                    if(e.equals(employeeList.get(0))){
                        e.setAge(e.getAge()+1);
                    }
                    return e;
                })
                .map(Employee::getName)
                .forEach(SeedMethods::yazdir);

        System.out.println(employeeList);
        System.out.println(e1);

        // T A S K 05) Her çalışanı maaşlarına göre maaş zammı hesaplayarak (örnek: %10) yeni maaşla göster:

        employeeList.stream()
                .peek(e->{
                    if( e.equals(employeeList.getFirst()))
                        System.out.println("Her çalışanı maaşlarına göre maaş zammı hesaplayarak (örnek: %10) yeni maaşla");
                })
                // Çalışan ismiyle birlikte maaşı %10 zamlı ve 2 ondalık basamaklı formatta oluşturur.
                .map(e -> e.getName() + " : " + String.format("%.2f", e.getSalary()* 1.10 ))
                .forEach(System.out::println);


        // T A S K 06) Eğer maaşı 35,000 TL'nin altında olan çalışan varsa, bu çalışanların maaşını %20 artırın.
        employeeList.stream()
                .peek(e->{ if(e.equals(employeeList.getFirst()))
                    System.out.println("Eğer maaşı 35,000 TL'nin altında olan çalışan varsa, bu çalışanların maaşını %20 artır");})
                .filter( e -> e.getSalary() < 35.000 )
                .peek(e-> System.out.println("Zamdan önce: " +e.getName() +" : "+ e.getSalary()))
                .map(e -> {
                    e.setSalary( e.getSalary()*1.2 );
                    return e;

                })
                .peek(e-> System.out.println("Zamdan sonra : " +e.getName() +" : "+ e.getSalary()))
                .map(e-> e.getName() +" : " + String.format("%.2f" , e.getSalary( )))
                .forEach(System.out::println);

        //ikinci yol
        employeeList.stream()
                .peek(e->{ if(e.equals(employeeList.getFirst()))
                    System.out.println("Eğer maaşı 35,000 TL'nin altında olan çalışan varsa, bu çalışanların maaşını %20 artır");})
                .filter( e -> e.getSalary() < 35.000 )
                .peek(e-> System.out.println("Zamdan önce: " +e.getName() +" : "+ e.getSalary()))
                .forEach( e -> {
                    e.setSalary(e.getSalary()*1.2) ;
                    System.out.println("Zamdan sonra: "+ e.getName()+ " : " + String.format("%.2f", e.getSalary()));
                } );


        // T A S K 07) "IT" departmanındaki tüm çalışanların isimlerinin sonuna " - Senior" ekleyin.
        employeeList.stream()
                .filter( e-> e.getDepartment().equals("IT"))
                .map(  e -> e.getDepartment() + "Departmanı personeli : " +  e.getName().concat(" - Senior ") )
                .forEach(System.out::println);

        // T A S K 08) İsim uzunluğu 5'ten küçük olan çalışanların maaşına 15,000 TL ek yapın.
        System.out.println(" İsim uzunluğu 5'ten küçük olan çalışanların maaşına 15,000 TL ek " );
        employeeList.stream()
                .filter( e-> e.getName().length()<5)
                .forEach(e->{
                    e.setSalary( e.getSalary()*1.5);
                            System.out.println( e.getName()+ " : " + String.format("%.2f", e.getSalary() ) );
                        });
    }
}
