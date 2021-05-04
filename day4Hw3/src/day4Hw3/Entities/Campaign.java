package day4Hw3.Entities;

import day4Hw3.Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private int campaignId;
	private String campaignName;
	private int discountPercentage;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int campaignId, String campaignName, int discountPercentage) {
		super();
		this.id = id;
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
