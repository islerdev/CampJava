package day3Hw2;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("E�itmen eklendi: " + user.getUserName());
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
