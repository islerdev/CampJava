package day4Hw2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Engin","Demiroð",new Date(1985,1,1), "11111111111"));		
		
		
	}	

}
