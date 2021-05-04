package day3Hw2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("Öğrenci eklendi: " + user.getUserName());
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
