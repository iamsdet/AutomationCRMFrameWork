package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class PriceBookInfoPage extends WebDriverCommonLib{
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement Priceinfopg;
	
	@FindBy(xpath="//form[@id='massdelete']//span[@class='genHeaderSmall']")
	WebElement capturetxt;
	
	public void priceBookInfoPage()
	{
		String actval=Priceinfopg.getText();
		boolean res=actval.contains("Price Book");
		Assert.assertEquals(true, res);
	}
	
	public void searchText1()
	{
		WebDriverCommonLib elib=new WebDriverCommonLib();
		elib.waitForElemnet(capturetxt);
		String captxt=capturetxt.getText();
		boolean res=captxt.contains(" No PriceBook ");
		Assert.assertEquals(true, res);
	}

} 
