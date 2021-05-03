package day4Hw2;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.getNationalityId()=="11111111111" && customer.getFirstName() == "Engin") {
			
		return true;
		}
		
		else {
			
		return false;
		
		}

	}
	
}
