package day3Hw2;

public class Student extends User {
	private int studentId;
	private String firstName;
	private String lastName;
	private Course[] coursesOfStudent;
	
	public Student() {
		
	}
	
	public Student(int studentId, String firstName, String lastName, Course[] coursesOfStudent) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.coursesOfStudent = coursesOfStudent;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Course[] getCoursesOfStudent() {
		return coursesOfStudent;
	}

	public void setCoursesOfStudent(Course[] coursesOfStudent) {
		this.coursesOfStudent = coursesOfStudent;
	}
}
