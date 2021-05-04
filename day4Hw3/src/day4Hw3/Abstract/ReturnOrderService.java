package day4Hw3.Abstract;

import day4Hw3.Entities.Order;
import day4Hw3.Entities.ReturnOrder;
import day4Hw3.Entities.User;

public interface ReturnOrderService {
	
	void add(ReturnOrder returnOrder, Order order, User user);
	
	
	void delete(ReturnOrder returnOrder, Order order, User user);
	
}
