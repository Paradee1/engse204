package Lab2_12;

import java.util.Scanner;

public class Lab2_12 {

	public static void main(String[] rgs) {
		Scanner nw = new Scanner(System.in) ;
		
		String courseid = nw.nextLine();
		String coursename = nw.nextLine();
		String namestudent = nw.nextLine();
		
		Course co = new Course(courseid, coursename) ;
		
		Student st = new Student(namestudent, co) ;
		
		st.displayEnrollment();
	}

}

class Course {
	private String courseId ;
	private String courseName ;
	
	public Course(String courseId, String courseName) {
		this.courseId = courseId ;
		this.courseName = courseName ;
	}
	
	public String getCourseInfo() {
		return courseId + " : " + courseName ;
	}
}

class Student {
	private String studentName ;
	private Course enrolledCourse ;
	
	public Student(String studentName, Course enrolledCourse) {
		this.studentName = studentName ;
		this.enrolledCourse = enrolledCourse ;
	}
	
	public void displayEnrollment() {
		System.out.println("Student:"+studentName) ;
		System.out.println("Enrolles in:" +enrolledCourse.getCourseInfo()) ;
	}
}
