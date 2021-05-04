package day4Hw3.Entities;


import java.time.LocalDate;
import java.time.LocalTime;

import day4Hw3.Abstract.Entity;

public class Order implements Entity {
	private int id;
	private int orderId;
	private int userId;
	private int gameId;
	private int campaignId;
	private LocalDate orderDate;
	private LocalTime orderTime;
	private double paid;
	
	public Order() {
		
	}
	
	public Order(int id, int orderId, int userId, int gameId, int campaignId, LocalDate orderDate, LocalTime orderTime, double paid) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.userId = userId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.paid = paid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate localDate) {
		this.orderDate = localDate;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime localTime) {
		this.orderTime = localTime;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}
}
