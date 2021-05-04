package day3Hw2;

public class User {
	private int id;
	private String userName;
	private boolean isActive;
	
	public User() {
		
	}
	
	public User(int id, String userName, boolean isActive) {
		this.id = id;
		this.userName = userName;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
