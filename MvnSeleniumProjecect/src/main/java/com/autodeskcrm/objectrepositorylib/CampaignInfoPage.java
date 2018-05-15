package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignInfoPage {
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'Campaign Information')]")
	WebElement infomsg;
	public WebElement CampInfo(){
		return infomsg;
		
	}
	

}
