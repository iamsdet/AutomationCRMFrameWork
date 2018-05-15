package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateNewLead extends WebDriverCommonLib {
	@FindBy(name="firstname")
	WebElement fname;
	@FindBy(name="lastname")
	WebElement lname;
	@FindBy(name="company")
	WebElement cname;
	@FindBy(name="leadstatus")
	WebElement statusdd;
	@FindBy(xpath="//input[@class='crmButton small save']")
	WebElement saveBtn;
	@FindBy(xpath="//a[text()='Tarun']")
	WebElement linkname;
	@FindBy(name="Edit")
	WebElement leadedt;
	public void createleads(String firstname,String lastname,String companyname){
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		cname.sendKeys(companyname);
		saveBtn.click();
	}
	public void createleadsWithStatus(String firstname,String lastname,String companyname,String status){
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		cname.sendKeys(companyname);
		select(statusdd, status);
		saveBtn.click();
	}
	public void ModifyLeadTest(){
		linkname.click();
		leadedt.click();
	}
}
