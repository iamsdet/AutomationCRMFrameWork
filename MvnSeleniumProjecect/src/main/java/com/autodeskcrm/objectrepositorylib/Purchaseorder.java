package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchaseorder 
{
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	WebElement createnewpurchaseimg;
	
	public void navigatetocreatenewpurchaseorder()
	{
		createnewpurchaseimg.click();
	}
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[*]/td[2]/a[text()='laptop80")
	WebElement newporderlink;

	public WebElement getNewporderlink() {
		return newporderlink;
	}
	
}
