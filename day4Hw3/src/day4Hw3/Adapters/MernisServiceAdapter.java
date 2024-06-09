package day4Hw3.Adapters;

import day4Hw3.Abstract.UserCheckService;
import day4Hw3.Entities.User;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		if(user.getNationalityId()=="12345678910" && user.getFirstName() == "Salih") {
			
			return true;
			}
			
			else {
				
			return false;
			
			}
	}

}
