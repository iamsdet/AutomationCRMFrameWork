package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.autodeskcrm.genericlib.BaseClass;
import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateNewSalesOrder 
{

	@FindBy(name="subject")
	WebElement subjectedtbox;
	
	@FindBy(xpath="//input[@name='account_id']/following-sibling::img")
	WebElement orglookup;
	
	@FindBy(linkText="sangeetha")
	WebElement orglink;
	
	@FindBy(name="bill_street")
	WebElement billingaddeditbox;
	
	@FindBy(name="ship_street")
	WebElement shippingaddeditbox;
	
	@FindBy(id="searchIcon1")
	WebElement productlookup;
	
	@FindBy(linkText="samsungj7prime")
	WebElement productlink;
	
	@FindBy(id="qty1")
	WebElement qtyeditbox;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement savebtn;
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	WebElement createdvisibletext;

	
	public void createsalesorder(String subjectname,String qty,String billadd,String shipadd)
	{
		subjectedtbox.sendKeys(subjectname);
		orglookup.click();
		
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.getWindowIDs();
		BaseClass.driver.switchTo().window(w.map.get("childID"));
		
		orglink.click();
		
		w.alertOk();
		
		BaseClass.driver.switchTo().window(w.map.get("parentID"));
		billingaddeditbox.sendKeys(billadd);
		shippingaddeditbox.sendKeys(shipadd);
		
		
		productlookup.click();
		
		w.getWindowIDs();
		BaseClass.driver.switchTo().window(w.map.get("childID"));
		
		
		productlink.click();
		BaseClass.driver.switchTo().window(w.map.get("parentID"));
		
		qtyeditbox.sendKeys(qty);
		savebtn.click();
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
