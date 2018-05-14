package com.autodeskcrm.objectrepositorylib;

import java.awt.Desktop.Action;

import org.apache.poi.hssf.record.NoteStructureSubRecord;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class Common extends WebDriverCommonLib{
	
	@FindBy(xpath="//img[contains(@src,'user.PNG')]")
	WebElement adminImg;
	
	
	@FindBy(linkText="Sign Out")
	WebElement singOutLnk;
	
	public void logout(WebDriver driver) {
		
		
	    mouseMouse(adminImg);
	    waitForElemnetMax(singOutLnk);
	    singOutLnk.click();
		
	}
}
