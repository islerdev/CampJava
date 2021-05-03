package day4Hw2;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void save(Customer customer)  {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Veritaban�na kaydedildi: " + customer.getFirstName());
		}else {
			System.out.println("Ki�i do�rulanamad�: " + customer.getFirstName());
		}
							
}





	

	
}
