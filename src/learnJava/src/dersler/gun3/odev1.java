package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        // ************************** Task 01 ***********************************
        /* TASK->
         Ask user to enter mid-term grade, final grade, and project grade
         Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
          Example:
              INPUT: mid-term grade=78
                     final grade = 66
                     project grade = 90
              OUTPUT: "Your grade is : 81,6"
         */
        int midTermGrade,finalGrade,projectGrade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Midterm Grade= ");
        midTermGrade =  scan.nextInt();

        System.out.print("Enter Final Grade= ");
        finalGrade =  scan.nextInt();

        System.out.print("Enter Project Grade= ");
        projectGrade =  scan.nextInt();

        System.out.println("Your grade is : " + ( midTermGrade*30 + finalGrade*50 + projectGrade*20 )/100);


    }
}
