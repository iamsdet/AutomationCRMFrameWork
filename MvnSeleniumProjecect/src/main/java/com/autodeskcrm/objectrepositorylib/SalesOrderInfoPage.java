package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class SalesOrderInfoPage extends WebDriverCommonLib
{
	@FindBy(name="Edit")
	WebElement editbtn;
	
	@FindBy(name="Delete")
	WebElement deletebtn;
	
	public void editrecord()
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForElemnet(editbtn);
		editbtn.click();
		
	}
	
	public void deleterecord()
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForElemnet(deletebtn);
		deletebtn.click();
		
		
		wlib.alertOk();
	}
	
	
	
}
