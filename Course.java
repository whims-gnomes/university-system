// Course.java
public class Course {
    private int courseId;
    private String title;

    public Course(int courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseId + ", Title: " + title);
    }
}
