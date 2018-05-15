package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsInfoPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	WebElement leadsinfo;

	public WebElement getLeadsinfo() {
		return leadsinfo;
	}
	
}
