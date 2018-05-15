package com.autodeskcrm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products 
{
	 
	
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
		WebElement createbtn;
		
		public void navigateToCreateProductPage()
		{
			createbtn.click();
		}
	
}
