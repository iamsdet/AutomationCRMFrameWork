package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OrgInfoPage {

	@FindBy(id="mouseArea_Organization Name")
	WebElement orgNAmeinfo;
	
	@FindBy(xpath="//span[@id='crmspanid']/a[text()='Edit']")
	WebElement orNameEditLnk;
	
	@FindBy(id="txtbox_Organization Name")
	WebElement ornNAmeEdit;
	
	@FindBy(xpath="//div[@id='editarea_Organization Name']/input[@value='Save']")
	WebElement orgNameSaveBtn;
	
	@FindBy(id="dtlview_Organization Name")
	WebElement organizationNAmeInfo;
	
	
	
	
	public WebElement getOrganizationNAmeInfo() {
		return organizationNAmeInfo;
	}




	public void modifyORgNAme(String newOrgNAme,WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(orgNAmeinfo).perform();
		orNameEditLnk.click();
		ornNAmeEdit.clear();
		ornNAmeEdit.sendKeys(newOrgNAme);
		orgNameSaveBtn.click();
		
	}
	
}
