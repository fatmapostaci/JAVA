package OgrenciYonetimSistemi.src;

import java.util.List;
import java.util.Scanner;

public class OgrenciIsleri {

    static Scanner scanner = new Scanner(System.in);

    public StudentActions studentActions = new StudentActions();
    public CoursesAction coursesAction = new CoursesAction();


    /*
-----------------------start of course methods------------------------------------------------------------------------------------------
 */
    private static void showCourseMenu(){
        System.out.println("----------------------------");
        System.out.print("Course Menu - Seçim yapın:" +
                "\n1 - Course Ara" +
                "\n2 - Course Ekle" +
                "\n3 - Course Sil" +
                "\n4 - Ana Menuye Dön" +
                "\n5 - Çıkış" +
                "\nSeçim: ");
    }

    //courseMenu method is public, it is called from Runner Class
    public void courseMenu() {
        boolean devam = true;

        while (devam) {

            showCourseMenu();

            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    searchCourse();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    devam = returnToMainMenu(devam);
                    break;
                case 5:
                    devam = exitProgram(devam);
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
        }
    }

    private void deleteCourse() {
        System.out.print("\nSilmek istediğiniz dersin ID sini giriniz : ");
        String dersId = scanner.next().toUpperCase();

        boolean isCourseDeleted = coursesAction.removeCourse(dersId);
        if(isCourseDeleted)
            System.out.println("Ders kaydı silindi. Güncel ders listesi görüntüleniyor \n" + coursesAction.getCourses());
    }

    private void addCourse() {
        System.out.print("\nEklemek istediğiniz dersin adını giriniz : ");
        String courseName = scanner.next();
        System.out.print("\nEklemek istediğiniz dersin ID sini giriniz : ");
        String courseId = scanner.next();

        Course newCourse = new Course(courseId, courseName, 4);
        List<Course> updatedCourseList = coursesAction.addCourse(newCourse);
        System.out.println("Kayıt başarılı. Güncel ders listesi görüntüleniyor \n" + updatedCourseList);

    }

    private void searchCourse() {
        System.out.print("\nSorgulamak istediğiniz dersin ID sini giriniz : ");
        String ogrenciId = scanner.next();

        Course course = coursesAction.searchCourse(ogrenciId);
        System.out.println("Aradığınız ders bilgileri :  " + course);
    }


/*
---------------------start of student methods------------------------------------------------------------------------------------------
 */
    private void showStudentMenu() {
        System.out.println("----------------------------");
        System.out.print("Ogrenci Menu - Seçim yapın:" +
                "\n1 - Öğrenci Ara" +
                "\n2 - Öğrenci Ekle" +
                "\n3 - Öğrenci Sil" +
                "\n4 - Öğrenciye Ders Kaydı Yap" +
                "\n5 - Öğrenciden Ders Kaydı Sil" +
                "\n6 - Öğrencinin Aldığı Dersleri Listele" +
                "\n7 - Ana Menuye Dön" +
                "\n8 - Çıkış" +
                "\nSeçim: ");
    }

    //ogrenciMenu method is public, it is called from Runner Class
    public void ogrenciMenu() {
        boolean devam = true;

        while (devam) {

            showStudentMenu();

            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                   searchStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                   deleteStudent();
                    break;
                case 4:
                    addCourseToStudent();
                    break;
                case 5:
                    deleteCourseFromStudent();
                    break;
                case 6:
                    displayStudentCourses();
                    break;
                case 7:
                    devam = returnToMainMenu(devam);
                    break;
                case 8:
                    devam = exitProgram(devam);
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
        }
    }

    private void displayStudentCourses() {

        System.out.print("\nÖğrencinin ID sini giriniz : ");
        String studentId = scanner.next();

        Student student = studentActions.searchStudent(studentId);

        studentActions.displayStudentCourses(student);
    }

    private void deleteCourseFromStudent() {

        System.out.print("\nÖğrencinin ID sini giriniz : ");
        String studentId = scanner.next();
        Student student = studentActions.searchStudent(studentId);

        System.out.print("\nSilmek istediğiniz dersin ID sini giriniz : ");
        String courseId = scanner.next();
        Course course = coursesAction.searchCourse(courseId);

        studentActions.deleteCourseFromStudent(student,course);
    }

    private void addCourseToStudent() {

        System.out.print("\nDers alacak öğrencinin ID sini giriniz : ");
        String studentId = scanner.next();
        Student student = studentActions.searchStudent(studentId);

        System.out.print("\nÖğrencinin almak istediği dersin ID sini giriniz : ");
        String courseId = scanner.next();
        Course course = coursesAction.searchCourse(courseId);

        studentActions.addCourseToStudent(student,course);

    }


    private void deleteStudent() {
        System.out.println("\nSilmek istediğiniz öğrencinin ID sini giriniz:");
        String ogrenciId = scanner.next();

        boolean isDeleted = studentActions.removeStudent(ogrenciId);
        if(isDeleted)
            System.out.println("Öğrenci kaydı silindi. ");
        else
            System.out.println( ogrenciId + ": Öğrenci kaydı silinemedi. ");
    }

    private void addStudent() {


        List<Student> updatedStudentList = studentActions.addStudent();
        System.out.println("Kayıt başarılı. Güncel öğrenci listesi görüntüleniyor. \n" + updatedStudentList);

    }

    private void searchStudent() {
        System.out.print("\nSorgulamak istediğiniz öğrencinin ID sini giriniz : ");
        String ogrenciId = scanner.next();

        Student ogrenci = studentActions.searchStudent(ogrenciId);   //tuğba hocamın methodu çağırlır
        System.out.println("Aradığınız öğrenci bilgileri :  " + ogrenci);

    }

    /*
    ---------start of shared (default) methods------------------
     */
    boolean exitProgram(boolean devam) {
        System.out.println("Çıkış yapılıyor...\n");
        devam = false;
        System.exit(0);
        return devam;
    }

    boolean returnToMainMenu(boolean devam) {
        System.out.println("Ana Menüye Dönülüyor...\n");
        devam=false;
        Runner.menuGiris();
        return devam;
    }
























/*
    private static void userSil() {
        System.out.println("\nÇıkarmak istediğiniz kullanıcının adını giriniz:");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        String userName = scanner.next();
        int index = userList.indexOf(userName);
        if (index != -1) {
            userList.remove(index);
            passwordList.remove(index);
            System.out.println("Kullanıcı başarıyla silindi! Güncel kullanıcı listesi:");
            System.out.println(userList);
        } else {
            System.out.println("Kullanıcı bulunamadı!");
        }
    }*/
}
