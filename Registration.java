// Registration.java
public class Registration {
    private int registrationId;
    private Student student;
    private Course course;

    public Registration(int registrationId, Student student, Course course) {
        this.registrationId = registrationId;
        this.student = student;
        this.course = course;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void displayRegistrationInfo() {
        System.out.println("Registration ID: " + registrationId);
        student.displayStudentInfo();
        course.displayCourseInfo();
        System.out.println();
    }
}
