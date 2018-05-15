package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateNewPurchaseOrder 
{
	@FindBy(name="subject")
	WebElement subjectedit;
	
	@FindBy(name="bill_street")
	WebElement billedit;
	
	@FindBy(name="ship_street")
	WebElement shipedit;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[4]/td[2]/img")
	WebElement vendorlookup;
	
	@FindBy(id="searchIcon1")
	WebElement productlookup;
	
	@FindBy(xpath="//table[@id='proTab']/tbody/tr[3]/td[3]/input")
	WebElement quntityedit;
	
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[*]/td[2]/a[text()='Apple4']")
	WebElement productlink;
	
	
	
	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getVendorlookup() {
		return vendorlookup;
	}

	public WebElement getProductlookup() {
		return productlookup;
	}

	@FindBy(name="button")
	WebElement savebutton;
	
	public WebElement getSavebutton() {
		return savebutton;
	}

	@FindBy(xpath="//table[@class='small']/tbody/tr[*]/td[1]/a[text()='Sony3']")
	WebElement vendorlink;
	
	public WebElement getVendorlink() {
		return vendorlink;
	}

	public void createnewPOrder(String subname)
	{
		subjectedit.sendKeys(subname);
		
	}
	
	public void createnewPOrder(String baddss,String shaddss,String quantity)
	{
		billedit.sendKeys(baddss);
		shipedit.sendKeys(shaddss);
		quntityedit.sendKeys(quantity);
	}
	
}
