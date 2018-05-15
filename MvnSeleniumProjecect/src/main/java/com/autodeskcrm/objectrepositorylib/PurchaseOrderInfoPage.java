package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class PurchaseOrderInfoPage extends WebDriverCommonLib 
{
	@FindBy(xpath="//td[text()='Subject']/following-sibling::td[1]")
	WebElement movele;
	
	@FindBy(xpath="//span[@id='crmspanid']/a")
	WebElement editlink;
	
	@FindBy(id="txtbox_Subject")
	WebElement subjtext;
	
	@FindBy(name="button_Subject")
	WebElement savebuton;
	
	public WebElement getVerifytext() {
		return verifytext;
	}

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement verifytext;
	
	public void editporder(String newsubname)
	{
	WebDriverCommonLib web=new WebDriverCommonLib();
	mouseMouse(movele);
	editlink.click();
	subjtext.clear();
	subjtext.sendKeys(newsubname);
	savebuton.click();
	}
		
	
	
}
