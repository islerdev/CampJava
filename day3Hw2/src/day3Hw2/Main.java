package day3Hw2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("Java");
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("C Sharp");
		Course course3 = new Course();
		course2.setId(3);
		course2.setCourseName("Temel Programlama");
		
		Course [] courses1 = {course1, course3};
		Course [] courses2 = {course2};
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setUserName("salih");
		instructor1.setFirstName("Salih");
		instructor1.setLastName("Demir");
		instructor1.setActive(true);
		instructor1.setCoursesOfInstructor(courses1);
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setInstructorId(2);
		instructor2.setUserName("kerem");
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Var");
		instructor2.setActive(true);
		instructor2.setCoursesOfInstructor(courses2);
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setStudentId(1);
		student1.setUserName("mehmet");
		student1.setFirstName("Mehmet");
		student1.setLastName("Demir");
		student1.setActive(true);
		student1.setCoursesOfStudent(courses1);
		
		User[] usersInstructor = {instructor1, instructor2};
		
		UserManager userManager2 = new InstructorManager();
		userManager2.addMultiple(usersInstructor);
		
		User[] usersStudent = {student1};
		
		UserManager userManager = new StudentManager();
		userManager.addMultiple(usersStudent);
		
		
		
		

	}

}
