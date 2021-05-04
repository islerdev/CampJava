package day4Hw3.Concrete;

import day4Hw3.Abstract.CampaignService;
import day4Hw3.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
		
	}

}
