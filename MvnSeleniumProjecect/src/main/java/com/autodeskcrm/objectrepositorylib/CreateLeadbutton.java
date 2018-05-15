package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadbutton {
	@FindBy(xpath="//img[@title='Create Lead...']")
	WebElement CreateBtn;
	public void navigateToCreateLeadPAge(){
		CreateBtn.click();
		}
}
