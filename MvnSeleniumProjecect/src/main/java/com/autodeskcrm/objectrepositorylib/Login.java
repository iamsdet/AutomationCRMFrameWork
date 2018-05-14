package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	//private elements
	@FindBy(name="user_name")
	private WebElement userEdt;
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	@FindBy(xpath="//div[@class='errorMessage']")
	private WebElement errorMsg;
	
	//getters to provide read acesses 
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getErrorMsg() {
		return errorMsg;
	}
    //Reusable business libraries
	public void login(String userNAme , String password){
		userEdt.sendKeys(userNAme);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}

}
