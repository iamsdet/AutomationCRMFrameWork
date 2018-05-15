package com.autodeskcrm.objectrepositorylib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class Home extends WebDriverCommonLib{
	
	@FindBy(linkText="Contacts")
	WebElement contactLnk;

	@FindBy(linkText="Organizations")
	WebElement orngLnk;
	
	@FindBy(linkText="Leads")
	WebElement leadLnk;
	
	@FindBy(xpath="//a[text()='Products']")
	WebElement productlink;
	
	@FindBy(linkText="Campaigns")
	WebElement campaignLnk;
	

	
	@FindBy(linkText="More")
	WebElement moredd;
	
	@FindBy(linkText="Purchase Order")
	WebElement purchaseorderlink;
	
	@FindBy(linkText="Vendors")
	WebElement vendorlink;
	
	public void naviagteToConatct(){
		contactLnk.click();
	}
	@FindBy(linkText="Sales Order")
	WebElement salesorderlink;
	
	
	public void navigateToSalesorder()
	{
		moredd.click();
		waitForElemnetMax(salesorderlink);
		salesorderlink.click();	
	}
	
	public void naviagteToOrganizations() throws Throwable{
		Thread.sleep(2000);
		orngLnk.click();
	}
	
	public void naviagteToLeads(){
		leadLnk.click();
	}
	
	public void navigateToProduct() throws Throwable
	{
		Thread.sleep(2000);
		productlink.click();
	}
	
	public void naviagteToCampaing(WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(moredd).perform();
		campaignLnk.click();
	}
	public void navigatetopurchaseorder(WebDriver driver)
	{
		mouseMouse(moredd);
		purchaseorderlink.click();
	}
	public void navigatetovendor(WebDriver driver)
	{
		mouseMouse(moredd);
		vendorlink.click();
	}
	
}
