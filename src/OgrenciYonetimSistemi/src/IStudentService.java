package OgrenciYonetimSistemi.src;

import java.util.List;

public interface IStudentService {


    List<Student> addStudent();

    boolean removeStudent(String id);

    Student searchStudent(String id);

}
