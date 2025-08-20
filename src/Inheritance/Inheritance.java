package Inheritance;

import inheritance.Teacher.PrimarySchoolTeacher;

public class Inheritance {
    public static void main(String[] args) {

        Doctor doktorAhmet = new Doctor();
        doktorAhmet.setName("Ahmet");
        doktorAhmet.setTus(false);
        System.out.println(doktorAhmet.introduceYourself());


        Doctor doktorZeynep = new Doctor("Zeynep", 95000,true, "Cardiology" );
        System.out.println(doktorZeynep.introduceYourself());

        Engineer muhendisFatma = new Engineer("Fatma", 12000, "Computer Engineer", "working on Java project");
        System.out.println(muhendisFatma.introduceYourself());

        // College Student
        Student_Collage studentKubra = new Student_Collage("Kübra", 03433, "Medeniyet University", 8);
        System.out.println(studentKubra.introduceYourself());
        studentKubra.joinAClub();

        //Kindergarten olarak güncellenecek
        Student_PrimarySchool studentMelike = new Student_PrimarySchool("Melike", 142,"Gülbahar Hatun Anaokulu",4,true);
        System.out.println(studentMelike.introduceYourself());
        studentMelike.sleep();

        //Primary School student
        Student_PrimarySchool ahmet = new Student_PrimarySchool("Ahmet",132,"Yenidoğu Okulları",3,true);
        System.out.println(ahmet.introduceYourself());


        //Primary school teacher
        PrimarySchoolTeacher elifOgretmen = new PrimarySchoolTeacher("Elif","Sınıf Öğretmeni",35000,true);
        System.out.println(elifOgretmen.introduceYourself());

        System.out.println();

        // BILSEM approval test
        System.out.println("Is Ahmet in BILSEM?= " + ahmet.isABilsemStudent());
        //teacher asks to comission for Ahmet
        elifOgretmen.gatherBilsemCommision(ahmet);
        System.out.println("Is ahmet in BILSEM? = " + ahmet.isABilsemStudent());
    }
}
