package day4Hw3.Concrete;

import day4Hw3.Abstract.ReturnOrderService;
import day4Hw3.Entities.Order;
import day4Hw3.Entities.ReturnOrder;
import day4Hw3.Entities.User;

public class ReturnOrderManager implements ReturnOrderService {

	@Override
	public void add(ReturnOrder returnOrder, Order order, User user) {
		System.out.println("�ade kayd� ger�ekle�ti.");
		
	}

	@Override
	public void delete(ReturnOrder returnOrder, Order order, User user) {
		System.out.println("�ade iptal edildi");
		
	}

	

}
