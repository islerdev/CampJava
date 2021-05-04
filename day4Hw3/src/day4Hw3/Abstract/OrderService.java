package day4Hw3.Abstract;

import day4Hw3.Entities.Campaign;
import day4Hw3.Entities.Game;
import day4Hw3.Entities.Order;
import day4Hw3.Entities.ReturnOrder;
import day4Hw3.Entities.User;

public interface OrderService {
	public void add(Order order, Game game, Campaign campaign, User user);
	
	public void delete(Order order, Game game, User user, ReturnOrder returnOrder);
}
