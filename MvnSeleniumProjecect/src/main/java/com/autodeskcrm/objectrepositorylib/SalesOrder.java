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
	WebElement editrecordlink;
	
	@FindBy(linkText="abcd")
	WebElement deleterecordlink;
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement createdvisibletext;
	
	@FindBy(name="search_text")
	WebElement searcheditox;
	
	@FindBy(name="search_field")
	WebElement searchindd;
	
	@FindBy(xpath="//input[@class='crmbutton small create' and @value=' Search Now ' and @name='submit']")
	WebElement searchbtn;
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	WebElement norecordfound;
	
	

	
	public void createsalesorderbtn() throws Throwable
	{
		
		wlib.waitForElemnet(createbtn);
		createbtn.click();
	
	}
	public void selectrecord()
	{
		wlib.waitForElemnet(editrecordlink);
		editrecordlink.click();
	}
	public void selectrecordfordelete()
	{
		deleterecordlink.click();
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
	
	public void verifyrecorddeleted(String deletedrecord)
	{
		searcheditox.sendKeys(deletedrecord);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.select(searchindd,"Subject");
		searchbtn.click();
		
		boolean b=norecordfound.isDisplayed();
		
		Assert.assertEquals(true, b);
		
		
	}
}
