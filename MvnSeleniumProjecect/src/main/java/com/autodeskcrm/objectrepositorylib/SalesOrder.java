package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrder 
{

	@FindBy(xpath="//img[@alt='Create Sales Order...']")
	WebElement createbtn;
	
	public void createsalesorderbtn() throws Throwable
	{
		Thread.sleep(2000);
		createbtn.click();
	
	}
}
