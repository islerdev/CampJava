package day4Hw3;

import java.time.LocalDate;
import java.time.LocalTime;

import day4Hw3.Adapters.MernisServiceAdapter;
import day4Hw3.Concrete.OrderManager;
import day4Hw3.Concrete.UserManager;
import day4Hw3.Entities.Campaign;
import day4Hw3.Entities.Game;
import day4Hw3.Entities.Order;
import day4Hw3.Entities.ReturnOrder;
import day4Hw3.Entities.User;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameId(1);
		game1.setGameName("CS Go");
		game1.setGamePrice(26.95);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("BÜYÜK YAZ FIRSATI");
		campaign1.setDiscountPercentage(50);
		
		

		User user1 = new User(1,1, "Engin", "Demiroð", "engin", 1985, "12345678910", true);
	
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		
		
		
		Order order1 = new Order();
		order1.setId(1);
		order1.setOrderId(10001);
		order1.setOrderDate(LocalDate.now());
		order1.setOrderTime(LocalTime.now());
		
		
		OrderManager orderManager = new OrderManager();
		orderManager.add(order1, game1, campaign1, user1);
		
		System.out.println("----------------------");
		
		orderManager.delete(order1, game1, user1, new ReturnOrder());

	}

}
