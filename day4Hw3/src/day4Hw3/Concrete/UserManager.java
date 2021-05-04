package day4Hw3.Concrete;

import day4Hw3.Abstract.UserCheckService;
import day4Hw3.Abstract.UserService;
import day4Hw3.Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user))
		{
			System.out.println("Kullanýcý eklendi: " + user.getUserName());
		}
		else {
			System.out.println("Kullanýcý doðrulanamadý: " + user.getUserName());
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getUserName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getUserName());
		
	}

}
