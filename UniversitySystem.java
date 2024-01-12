// UniversitySystem.java
public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Doe");

        Course course1 = new Course(101, "Introduction to Programming");
        Course course2 = new Course(102, "Data Structures");

        Registration registration1 = new Registration(501, student1, course1);
        Registration registration2 = new Registration(502, student2, course2);

        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        System.out.println();

        System.out.println("Course Information:");
        course1.displayCourseInfo();
        course2.displayCourseInfo();
        System.out.println();

        System.out.println("Registration Information:");
        registration1.displayRegistrationInfo();
        registration2.displayRegistrationInfo();
    }
}
