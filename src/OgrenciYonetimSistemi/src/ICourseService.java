package OgrenciYonetimSistemi.src;

import java.util.List;

public interface ICourseService {


    List<Course> addCourse(Course courseName);

    boolean removeCourse(String id);


    Course searchCourse(String id);


}
