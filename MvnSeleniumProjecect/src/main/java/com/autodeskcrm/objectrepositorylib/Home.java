package com.autodeskcrm.objectrepositorylib;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class Home extends WebDriverCommonLib{
	
	@FindBy(linkText="Contacts")
	WebElement contactLnk;

	@FindBy(linkText="Organizations")
	WebElement orngLnk;
	
	@FindBy(linkText="Leads")
	WebElement leadLnk;
	
	@FindBy(linkText="Campaigns")
	WebElement campaignLnk;
	
	@FindBy(linkText="More")
	WebElement moredd;
	
	public void naviagteToConatct(){
		contactLnk.click();
	}
	public void naviagteToOrganizations(){
		waitForElemnetMax(orngLnk);
		orngLnk.click();
	}
	
	public void naviagteToLeads(){
		leadLnk.click();
	}
	
	public void naviagteToCampaing(WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(moredd).perform();
		campaignLnk.click();
	}
	
}
