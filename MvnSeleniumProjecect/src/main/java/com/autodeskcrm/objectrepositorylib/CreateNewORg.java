package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateNewORg extends WebDriverCommonLib{

	
	 @FindBy(name="accountname")
	 WebElement orgNAmeEdt;
	 
	 @FindBy(name="website")
	 WebElement orgWebSite;
	 
	 @FindBy(xpath="(//input[@accesskey='S'])[1]")
	 WebElement saveBtn;
	 
	 @FindBy(id="dtlview_Organization Name")
	 WebElement orgNAmeInfo;
	 
	 @FindBy(name="accounttype")
	 WebElement orgTypedd;
	 
	 
	 public WebElement getOrgNAmeInfo() {
		return orgNAmeInfo;
	}
	public void createOrg(String orgNAme){
		 orgNAmeEdt.sendKeys(orgNAme);
		 saveBtn.click();
	 }

	 
	 public void createOrg(String orgNAme,String orgType){
		 orgNAmeEdt.sendKeys(orgNAme);
	     select(orgTypedd, orgType);
		 saveBtn.click();
	 }
	 
}
