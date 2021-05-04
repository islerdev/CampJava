package day4Hw3.Concrete;

import day4Hw3.Abstract.OrderService;
import day4Hw3.Entities.Campaign;
import day4Hw3.Entities.Game;
import day4Hw3.Entities.Order;
import day4Hw3.Entities.ReturnOrder;
import day4Hw3.Entities.User;

public class OrderManager implements OrderService {

	public void add(Order order, Game game, Campaign campaign, User user) {
		order.setPaid(game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountPercentage()/100));
		System.out.println("Sat�n alan: " + user.getUserName()
				+ "\n" + "Kampanya: " + campaign.getCampaignName() + "\n" + 
				"Kampanya �ncesi fiyat: " + game.getGamePrice() 
				+ "\n" + "Kampanya sonras� fiyat: " + order.getPaid()
				+ "\n" + "Sipari� No: " + order.getOrderId() + "\n" + "Sipari� Tarihi: " + order.getOrderDate() + " " + order.getOrderTime());
		
		
	}
	
	public void delete(Order order, Game game, User user, ReturnOrder returnOrder) {
		
		
		//�ade no, Sipari� no ile 2'nin �arp�m�yla elde edildi.
		
		System.out.println("Sipari� iade edildi: " + (order.getOrderId()) + "\n" + "�ade Eden: " + user.getUserName() + "\n" + "�ade No: " + (order.getOrderId()*2));
		
		
		ReturnOrderManager returnOrderManager = new ReturnOrderManager();
		returnOrderManager.add(returnOrder, order, user);
		
	}

}
