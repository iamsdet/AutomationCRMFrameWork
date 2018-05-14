package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewProduct 
{
	@FindBy(name="productname")
	WebElement productnameeditbox;
	
	@FindBy(id="qty_per_unit")
	WebElement qtyeditbox;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement savebtn;
	
	
	public void createNewProduct(String productName,String qty)
	{
		productnameeditbox.sendKeys(productName);
		
		qtyeditbox.sendKeys(qty);
		
		savebtn.click();
	}
	
}

