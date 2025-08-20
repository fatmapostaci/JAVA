package learnJava.srcHoca.j23encapsulation.tasks.task3;

import javax.swing.text.DateFormatter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {
    /*
    Task->
    Runner ve  Employees, class cerate ediniz
    Employees(Çalışanlar) class'ında;
    encapsulated variable'ları oluşturunuz;
    String name,
    int salary,
    String dob (date of birth) (Doğum tarihi)
    Runner class'ın içinde;
   obj ile
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
    Eğer employee 18 yaşından büyükse, Welcome to our company Fernando your salary is 80000. print ediniz.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. print ediniz.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have j12_Arrays.PassingArraysToMethods
    80000 salary print ediniz..
trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age

     */

    private String name;
    private int salary;
    private String dob;

    public Employees( String name,String dob) {
        this.name = name;
        this.dob = dob;
    }

    public int ageCalculator(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.now();  //bugünün tarihi
        Period ageP = Period.between(getDob(),today);   // yaşı Period type ında üretir
        return ageP.getYears();  //yaşı integer olarak return eder
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {

        if ( ageCalculator()>18){
            this.salary =80000;
            System.out.println("Welcome to our company "+ this.name +" your salary is " + getSalary());
        }
        else if (ageCalculator() == 18) {
            System.out.println("we can have make an interview with you after that you can have 80000 salary ");
            this.salary = 0;
        }
        else {
            System.out.println("come back when you are 18 years old");
            this.salary = 0;
        }
    }

    public LocalDate getDob() {
        // return dop;
        LocalDate bithdate = null;   //string doğum tarihini LocalDate formatına çevirir
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");  //doğum tarihi formatı
            bithdate = LocalDate.parse(dob,format);
        } catch (Exception e) {
            System.out.println("Hatalı formatta girdiniz.MM/dd/yyyy formatında tarih girin " +e.getMessage());
        }
        return bithdate;  //LocalDate type ında return eder
    }

    public void setDob(String dob) {
            this.dob=dob;
    }
}
