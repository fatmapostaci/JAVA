package OgrenciYonetimSistemi.src;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentActions implements IStudentService {

    static Scanner scan = new Scanner(System.in);
    static String isim;
    static String soyisim;
    static String eMail;
    static List<Student> ogrList = new ArrayList<>();


    @Override
    public List<Student> addStudent() {


        try {

            System.out.print("Lütfen ögrenci listesine eklemek istediginiz ismi giriniz");
            isim = scan.nextLine();

        } catch (Exception e) {
            System.out.print("Lütfen isminizi String olarak girin : ");
        }

        try {
            System.out.print("Soyismi girin");
            soyisim = scan.nextLine();

        } catch (Exception e) {
            System.out.print("Lütfen soyisminizi String olarak girin : ");
        }

        try {
            System.out.print("Email adresini girin : ");
            eMail = scan.nextLine();

        } catch (Exception e) {
            System.out.println("Lütfen E-Mail adresinizi dogru girdiginizden emin olun : ");
        }

        Student student = new Student(isim, soyisim, eMail);

        ogrList.add(student);

        return ogrList;
    }


    @Override
    public boolean removeStudent(String id) {

        try {
            for (Student student : ogrList) {
                if (student.getId().equals(id)) {
                    ogrList.remove(student);
                    return true;

                }
            }

        } catch (Exception e) {
            System.out.println("Bir seyler ters gitti, tekrar deneyin");
        }

        return false;
    }

    @Override
    public Student searchStudent(String id) {

        for (Student ogr : ogrList) {

            if (ogr.getId().equals(id)) {
                return ogr;
            }
        }
        throw new StudentNotFoundException("Aradiginiz ogrenci bulunamadi");
    }

    public void addCourseToStudent(Student student, Course course){

        if (!student.getCourseList().contains(course)){
            student.getCourseList().add(course);
            System.out.println("Course added successfully");
        }else {
            System.out.println("The course is already in the student's course list.");
        }

    }

    public void deleteCourseFromStudent(Student student, Course course){

        if (!student.getCourseList().contains(course)){
            student.getCourseList().remove(course);
            System.out.println("Course removed successfully");
        }else {
            System.out.println("The course is not in the student's course list.");
        }

    }

    public void displayStudentCourses(Student student){

        System.out.println(student.getCourseList());

    }


}
