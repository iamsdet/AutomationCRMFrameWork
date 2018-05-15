package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class editingSalesOrderpage 
{
	@FindBy(name="subject")
	WebElement subjecteditbox;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement savebtn;
	
	public void modifyrecor(String newsubject)
	{
		subjecteditbox.clear();
		subjecteditbox.sendKeys(newsubject);
		savebtn.click();
	}

}
