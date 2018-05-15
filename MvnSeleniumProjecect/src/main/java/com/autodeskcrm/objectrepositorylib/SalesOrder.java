package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class SalesOrder 
{
	public WebDriverCommonLib wlib=new WebDriverCommonLib();
	
	@FindBy(xpath="//img[@alt='Create Sales Order...']")
	WebElement createbtn;
	
	@FindBy(linkText="vinod_Oar_123")
	WebElement recordlink;
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement createdvisibletext;
	
	
	
	public void createsalesorderbtn() throws Throwable
	{
		
		wlib.waitForElemnet(createbtn);
		createbtn.click();
	
	}
	public void selectrecord()
	{
		wlib.waitForElemnet(recordlink);
		recordlink.click();
	}

	public void verifysalesorder() 
	{
		String expvalue="Sales Order Information";
		String actvalue=createdvisibletext.getText();
		System.out.println(actvalue);
		boolean b=actvalue.contains(expvalue);
		System.out.println(b);
		Assert.assertEquals(true, b);
		
	}
}
