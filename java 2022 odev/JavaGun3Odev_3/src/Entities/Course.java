package Entities;

public class Course {
    private int id;

    public Course(int id, String courseTitle, int price) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int views) {
        this.price = views;
    }

    private String courseTitle;
    private int price;

}
