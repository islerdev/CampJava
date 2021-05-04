package day3Hw2;

public class Instructor extends User {
	private int instructorId;
	private String firstName;
	private String lastName;
	private Course[] coursesOfInstructor;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, String firstName, String lastName, Course[] coursesOfInstructor) {
		this.instructorId = instructorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.coursesOfInstructor = coursesOfInstructor;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
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

	public Course[] getCoursesOfInstructor() {
		return coursesOfInstructor;
	}

	public void setCoursesOfInstructor(Course[] coursesOfInstructor) {
		this.coursesOfInstructor = coursesOfInstructor;
	}
	
	
}
