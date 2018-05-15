package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.genericlib.BaseClass;
import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateCAmpaign {
	
	
	@FindBy(xpath="(//a[text()='More'])")
	WebElement moreclick;
	
	@FindBy (linkText="Campaigns")
	WebElement campaignlnk;
	
	@FindBy(xpath="(//img[@alt='Create Campaign...'])")
	WebElement createbtn;

	@FindBy(xpath="(//input[@name='campaignname'])")
	WebElement campaignedt;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])")
	WebElement savebtn;
	
	
	
	@FindBy(xpath="//input[@name='product_name']/following-sibling::img[@align='absmiddle']")
	WebElement lookupbtn;
	
	
	
	@FindBy(linkText="Laptop")
	WebElement lnk;
	
	
	@FindBy(xpath="//img[@id='aidCampaignInformation']")
	WebElement campbtn;
	
	
	@FindBy(name="Edit")
	WebElement edtbtn;
	
	
	@FindBy(name="campaignname")
	WebElement campText;
	
	
	
	public void navigateTomorePAge(){
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(moreclick).perform();
		
	}
	public void navigateTocampaignpage(String Cname){
		campaignlnk.click();
		createbtn.click();
		campaignedt.sendKeys(Cname);
		//lookupbtn.click();
		//WebDriverCommonLib webc=new WebDriverCommonLib();
		//webc.getWindowIDs();
		//String childID=webc.map.get("childID");
		//BaseClass.driver.switchTo().window(childID);
	
		//lnk.click();
		//BaseClass.driver.switchTo().window(webc.map.get("parentID"));
		savebtn.click();
		
	}
	
	public void navigateTocampaignpageWithpPdt(String Cname) throws Exception{
		
		
		
		
		
		WebDriverCommonLib webc=new WebDriverCommonLib();
		
		
		webc.waitForElemnetMax(moreclick);
		campaignlnk.click();
		createbtn.click();
		campaignedt.sendKeys(Cname);
		lookupbtn.click();
		
		webc.getWindowIDs();
		String childID=webc.map.get("childID");
		BaseClass.driver.switchTo().window(childID);
	
		lnk.click();
		BaseClass.driver.switchTo().window(webc.map.get("parentID"));
		savebtn.click();
		
	}
	public void NavigateToEditPage(String Cname2){
		campbtn.click();
		edtbtn.click();
		campText.clear();
		campaignedt.sendKeys(Cname2);
		savebtn.click();
		
		
	}


}
