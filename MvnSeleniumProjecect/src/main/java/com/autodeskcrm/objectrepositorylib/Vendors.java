package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vendors 
{
	@FindBy(xpath="//img[@title='Create Vendor...']")
	WebElement createnewvendorimg;
	
	public void navigatetocreatenewVendor()
	{
		createnewvendorimg.click();
	}
}
