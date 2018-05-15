package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatenewVendor 
{
	@FindBy(name="vendorname")
	WebElement vendoredit;
	
	@FindBy(xpath="(//table[@class='small']/tbody/tr[1]/td/div/input)[1]")
	WebElement savebutton;
	
	public void createnewvendor(String vname)
	{
		vendoredit.sendKeys(vname);
		savebutton.click();
	}
}
