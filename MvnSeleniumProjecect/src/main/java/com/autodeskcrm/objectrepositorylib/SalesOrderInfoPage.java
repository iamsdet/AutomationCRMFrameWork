package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class SalesOrderInfoPage extends WebDriverCommonLib
{
	@FindBy(name="Edit")
	WebElement editbtn;
	
	public void editrecord()
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForElemnet(editbtn);
		editbtn.click();
		
	}
	
	
	
}
