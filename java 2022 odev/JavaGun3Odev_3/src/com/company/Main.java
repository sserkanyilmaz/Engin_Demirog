package com.company;

import Business.CategoryManager;
import Business.CourseManager;
import DataAccess.HybetnateCategoryDao;
import DataAccess.JdbcCourseDao;
import Entities.Category;
import Entities.Course;
import Entities.Educator;
import Logger.DbLogger;
import Logger.Logger;
import Logger.FileLogger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1,"Java ile yazılımcı yetiştirme kampı",123);
        Course course2 = new Course(1,"CSharp ile yazılımcı yetiştirme kampı",1);
        Educator educator1 = new Educator(1,"Engin Demirog");
        Category category1 = new Category(1,"Yazılım");
        Category category2 = new Category(2,"Web");


        Category[] categories = new Category[]{new Category(2,"Otomasyon")};
        Course[] courses = new Course[]{new Course(3,"Python ile yazılımcı yetiştirme kampı",1)};
        Logger[] loggers ={ new DbLogger(),new FileLogger()};
        CourseManager courseManager= new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1,courses);
        courseManager.add(course2,courses);

        CategoryManager categoryManager = new CategoryManager(new HybetnateCategoryDao() , loggers);
        categoryManager.add(category1,categories);




    }
}
