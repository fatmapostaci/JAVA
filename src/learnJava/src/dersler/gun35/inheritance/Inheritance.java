package learnJava.src.dersler.gun35.inheritance;

import dersler.gun35.inheritance.Teacher.PrimarySchoolTeacher;

public class Inheritance {
    public static void main(String[] args) {

        Doctor doktorAhmet = new Doctor();
        doktorAhmet.setName("Ahmet");
        doktorAhmet.setTus(false);
        System.out.println(doktorAhmet.introduceYourself());


        Doctor doktorZeynep = new Doctor("Zeynep",true, "Cardiology" );
        System.out.println(doktorZeynep.introduceYourself());

        Engineer muhendisFatma = new Engineer("Fatma",  "Computer Engineer", "working on Java project");
        System.out.println(muhendisFatma.introduceYourself());

        Student_PrimarySchool studentMelike = new Student_PrimarySchool("Melike", 142,"Gülbahar Hatun Anaokulu",4,true);
        System.out.println(studentMelike.introduceYourself());
        studentMelike.sleep();

        Student_PrimarySchool ahmet = new Student_PrimarySchool("Ahmet",132,"Yenidoğu Okulları",3,true);
        System.out.println(ahmet.introduceYourself());
        System.out.println("ahmet.isABilsemStudent() = " + ahmet.isABilsemStudent());

        PrimarySchoolTeacher elifOgretmen = new PrimarySchoolTeacher("Elif","Sınıf Öğretmeni",true);
        elifOgretmen.gatherBilsemCommision(ahmet);
        System.out.println("ahmet.isABilsemStudent() = " + ahmet.isABilsemStudent());
    }
}
