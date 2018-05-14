package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orgnizations {
	
	@FindBy(xpath="//img[contains(@src,'btnL3Add')]")
	WebElement createNewOrgImg;
	
	public void navigateToCreateOrgPAge(){
		createNewOrgImg.click();
	}
	
	

}
