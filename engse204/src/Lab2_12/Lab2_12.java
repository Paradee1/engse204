package Lab2_12;

import java.util.Scanner;

public class Lab2_12 {

    public static void main(String[] rgs) {

        Scanner nw = new Scanner(System.in);

        // รับข้อมูลรหัสวิชา
        String courseid = nw.nextLine();

        // รับข้อมูลชื่อวิชา
        String coursename = nw.nextLine();

        // รับข้อมูลชื่อนักศึกษา
        String namestudent = nw.nextLine();

        // สร้างออบเจ็กต์ Course โดยส่งรหัสวิชาและชื่อวิชาไปยัง constructor
        Course co = new Course(courseid, coursename);

        // สร้างออบเจ็กต์ Student โดยส่งชื่อ และออบเจ็กต์ Course
        Student st = new Student(namestudent, co);

        // แสดงข้อมูลการลงทะเบียนเรียน
        st.displayEnrollment();

        nw.close();
    }
}

class Course {

    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseId + " : " + courseName;
    }
}

class Student {

    private String studentName;
    private Course enrolledCourse;

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}
