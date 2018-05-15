package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.genericlib.WebDriverCommonLib;

public class CreateNewPriceBook extends WebDriverCommonLib{

	@FindBy(xpath="//img[@title='Create Price Book...']")
	WebElement createlink;
	
	@FindBy(name="bookname")
	WebElement booknm;
	
	@FindBy(name="button")
	WebElement savebuttn;
	
	@FindBy(id="qccombo")
	WebElement dropdwn;
	
	@FindBy(name="selected_id")
	WebElement checkbox;
	
	@FindBy(xpath="//form[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[@value='Mass Edit']")
	WebElement Masseditbtn;
	
	@FindBy(xpath="//form[@id='massdelete']/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td[6]/a[text()='del']")
	WebElement DeleteBtn;
	
	@FindBy(name="search_text")
	WebElement searchttxt;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	WebElement searchnw;
	
	
	
	public void createPriceBook(String Bookname)
	{
		createlink.click();
		booknm.sendKeys(Bookname);
		savebuttn.click();
	}
	
	public void quickCreateBook(String Bookname)
	{
		WebDriverCommonLib lib=new WebDriverCommonLib();
		lib.select(dropdwn, "New PriceBook");
		booknm.sendKeys(Bookname);
		savebuttn.click();
	}
	
	public void createMassEdit(String Bookname) {
		checkbox.click();
		Masseditbtn.click();
		booknm.sendKeys(Bookname);
		savebuttn.click();
	}
	
	public void deletePriceBook() {
		DeleteBtn.click();
		WebDriverCommonLib lib=new WebDriverCommonLib();
		lib.alertOk();
	}
	
	public void searchText() {
		searchttxt.sendKeys("PB36");
		searchnw.click();
		PriceBookInfoPage Infopage=new PriceBookInfoPage();
		Infopage.searchText1();
		
	}


}
