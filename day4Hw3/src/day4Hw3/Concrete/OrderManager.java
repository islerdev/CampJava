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
		System.out.println("Satýn alan: " + user.getUserName()
				+ "\n" + "Kampanya: " + campaign.getCampaignName() + "\n" + 
				"Kampanya öncesi fiyat: " + game.getGamePrice() 
				+ "\n" + "Kampanya sonrasý fiyat: " + order.getPaid()
				+ "\n" + "Sipariþ No: " + order.getOrderId() + "\n" + "Sipariþ Tarihi: " + order.getOrderDate() + " " + order.getOrderTime());
		
		
	}
	
	public void delete(Order order, Game game, User user, ReturnOrder returnOrder) {
		
		
		//Ýade no, Sipariþ no ile 2'nin çarpýmýyla elde edildi.
		
		System.out.println("Sipariþ iade edildi: " + (order.getOrderId()) + "\n" + "Ýade Eden: " + user.getUserName() + "\n" + "Ýade No: " + (order.getOrderId()*2));
		
		
		ReturnOrderManager returnOrderManager = new ReturnOrderManager();
		returnOrderManager.add(returnOrder, order, user);
		
	}

}
