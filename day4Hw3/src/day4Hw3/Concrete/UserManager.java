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
			System.out.println("Kullan�c� eklendi: " + user.getUserName());
		}
		else {
			System.out.println("Kullan�c� do�rulanamad�: " + user.getUserName());
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: " + user.getUserName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getUserName());
		
	}

}
