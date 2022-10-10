package DataAccess;

import Entities.Course;

public class HybernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hybetnate ile VeriTabanına loglandı : "+course.getCourseTitle());
    }
}
