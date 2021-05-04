package day4Hw3.Entities;


import java.time.LocalDate;
import java.time.LocalTime;
import day4Hw3.Abstract.Entity;

public class ReturnOrder implements Entity {
	private int id;
	private int returnOrderId;
	private int orderId;
	private int userId;
	private int gamerId;
	private LocalDate returnDate;
	private LocalTime returnTime;
	
	public ReturnOrder() {
		
	}
	
	public ReturnOrder(int id, int returnOrderId, int orderId, int userId, int gamerId, LocalDate returnDate,
			LocalTime returnTime) {
		super();
		this.id = id;
		this.returnOrderId = returnOrderId;
		this.orderId = orderId;
		this.userId = userId;
		this.gamerId = gamerId;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReturnOrderId() {
		return returnOrderId;
	}

	public void setReturnOrderId(int returnOrderId) {
		this.returnOrderId = returnOrderId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate localDate) {
		this.returnDate = localDate;
	}

	public LocalTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalTime returnTime) {
		this.returnTime = returnTime;
	}
}
