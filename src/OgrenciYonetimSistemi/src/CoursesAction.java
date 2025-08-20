package OgrenciYonetimSistemi.src;

import java.util.ArrayList;
import java.util.List;

public class CoursesAction implements ICourseService {

    static List<Course> courses = new ArrayList<>();



    @Override
    public List<Course> addCourse(Course newCourse) {
        if (newCourse.getCourseName() != null && !courses.contains(newCourse.getCourseName())) {

            courses.add(newCourse);
            return courses;
        }
        throw new CourseNotFoundException("Böyle bir kurs adı yoktur");

    }

    @Override
    public boolean removeCourse(String courseId)  {
        for (Course course : courses) {

            if (course.getCourseId().equals(courseId)) {
                courses.remove(course);
                return true;
            }
        }
        throw new CourseNotFoundException("Girmiş olduğunuz : " +  courseId + "sayılı kurs mevcut değildir");


    }

    @Override
    public Course searchCourse(String courseId)  {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        throw new CourseNotFoundException("Girmiş olduğunuz : " +  courseId + "sayılı kurs mevcut değildir");

    }

    public List<Course> getCourses() {
        return courses;
    }

}
