package day4Hw3.Concrete;

import day4Hw3.Abstract.UserCheckService;
import day4Hw3.Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

	

}
