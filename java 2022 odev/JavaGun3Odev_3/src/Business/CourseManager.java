package Business;

import DataAccess.CourseDao;
import Entities.Course;
import Logger.Logger;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[]  loggers;

    public CourseManager(CourseDao courseDao, Logger[]  loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course,Course[] courses) throws Exception {
        for (Course course1: courses) {
            if(course1.getCourseTitle()==course.getCourseTitle())
            {
                throw new Exception("Aynı isimde kurs bulunmaktadır.");
            }}

            if(course.getPrice()<=0)
            {
                throw new Exception("Kurs fiyatı 0 veya negatif olamaz.");
            }
            courseDao.add(course);
            for (Logger logger: loggers
                 ) {
                logger.log(course.getCourseTitle());
            }
        }
    }