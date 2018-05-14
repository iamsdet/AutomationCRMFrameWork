package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SalesOrderInfoPage 
{
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement createdvisibletext;
	
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
