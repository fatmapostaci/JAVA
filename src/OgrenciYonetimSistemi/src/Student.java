package OgrenciYonetimSistemi.src;

import java.util.List;

public class Student {

    //Grup Üyesi 1: Student sınıfını oluşturun; id, isim, soyisim, email gibi özellikleri ekleyin.

    private String isim;
    private String soyisim;
    private static int counter=1;
    private String id;
    private String email;
    private List<Course> courseList;

    public Student() {
    }

    public Student(String isim, String soyisim, String email) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id = isim+counter;
        counter++;
        System.out.println(id);
        this.email = email;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", id='" + getId() + '\'' +
                ", email='" + getEmail() + '\'' +
                "\n";
    }
}
