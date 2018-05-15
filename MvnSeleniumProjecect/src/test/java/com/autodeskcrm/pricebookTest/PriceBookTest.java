package com.autodeskcrm.pricebookTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodeskcrm.genericlib.BaseClass;
import com.autodeskcrm.genericlib.ExcelLib;
import com.autodeskcrm.objectrepositorylib.CreateNewPriceBook;
import com.autodeskcrm.objectrepositorylib.Home;
import com.autodeskcrm.objectrepositorylib.PriceBookInfoPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


	/**
	 *
	 * @author Abhishek
	 */
	@Listeners(com.autodeskcrm.genericlib.SampleList.class)
	public class PriceBookTest extends BaseClass{	
	ExcelLib elib=new ExcelLib();
	/**
	 * 1.Login to CRM
	 * 2.Navigate to PriceBooks page
	 * 3.create new Pricebook button
	 * 4.Verify new Pricebook
	 * 5.Logout
	 * @throws Throwable 
	 */
		
		/*@Test(priority=1)
		public void createPriceBookTest() throws Throwable {
			ExtentTest logger =  extent.startTest("createPriceBookTest");	
			
			read the data from Excel 
			String pricebk = elib.getExcelData("Pricebook", 1, 2);
			
			Step-2 Navigate to PriceBooks Page
			logger.log(LogStatus.INFO, "Navigate to PriceBooks Page");
			Home homePage = PageFactory.initElements(driver, Home.class);
			homePage.naviagteToPriceBooks(driver);
			
			Step-3 Create to PriceBooks Page
			logger.log(LogStatus.INFO, "Create to PriceBooks Page");
		    CreateNewPriceBook CreatePage=PageFactory.initElements(driver, CreateNewPriceBook.class);
		    CreatePage.createPriceBook(pricebk);
		    
		    Step-4 Verify PriceBooks Page
		    logger.log(LogStatus.INFO, "Verify PriceBooks Page");
		    PriceBookInfoPage pinfo=PageFactory.initElements(driver, PriceBookInfoPage.class);
		    pinfo.priceBookInfoPage();
		    
		    extent.endTest(logger);
		}*/
	
		/**
		 * 1.Login to CRM
		 * 2.Navigate to QuickCreate Dropdown
		 * 3.Verify new Pricebook
		 * 4.Logout
		 * @throws Throwable 
		 */
			
			/*@Test
			public void createQuickPriceBook() throws Throwable {
				ExtentTest logger =  extent.startTest("createPriceBookTest");	
				
				read the data from Excel 
				String pricebk = elib.getExcelData("Pricebook", 1, 2);
				
				Step-2 Navigate to QuickCreate Dropdown
				logger.log(LogStatus.INFO, "Navigate to QuickCreate Dropdown");
				CreateNewPriceBook CreatePage =PageFactory.initElements(driver, CreateNewPriceBook.class);
				CreatePage.QuickCreateBook(pricebk);
				
			    Step-3 Verify PriceBooks Page
			    logger.log(LogStatus.INFO, "Verify PriceBooks Page");
			    PriceBookInfoPage pinfo=PageFactory.initElements(driver, PriceBookInfoPage.class);
			    pinfo.PriceBookInfoPage();
			    
			    extent.endTest(logger);
			}*/
			/**
			 * 1.Login to CRM app
			 * 2.Navigate to PriceBooks page
			 * 3.Go to CreateMassEdit 
			 * 4.logout
			 * @throws Throwable 
			 * 
			 * 
			 */
			/*@Test
			public void createMassEdit() throws Throwable
			{
                ExtentTest logger =  extent.startTest("createPriceBookTest");	
				
				read the data from Excel 
				String pricebk = elib.getExcelData("Pricebook", 1, 2);
				
				Step-2 Navigate to PriceBooks Page
				logger.log(LogStatus.INFO, "Navigate to PriceBooks Page");
				Home homePage = PageFactory.initElements(driver, Home.class);
				homePage.naviagteToPriceBooks(driver);
				
				Step-3 Navigate to QuickCreate Dropdown
				logger.log(LogStatus.INFO, "Navigate to QuickCreate Dropdown");
				CreateNewPriceBook CreatePage =PageFactory.initElements(driver, CreateNewPriceBook.class);
				CreatePage.CreateMassEdit(pricebk);
							    
			    extent.endTest(logger);
			}*/
            /**
             * 1.Login to CRM app.
             * 2.Navigate to Price Book Page.
             * 3.Delete the Pricebook record.
             * 4.Search for Particular record to verify
             * 5.Verify the record
             * 6.logout
             * @throws Throwable 
             * 
             */
           /* @Test(priority=2)
            public void DeletePriceBook() throws Throwable {
            	 ExtentTest logger =  extent.startTest("createPriceBookTest");	
 				
 				read the data from Excel 
 				String pricebk = elib.getExcelData("Pricebook", 1, 2);
 				
 				Step-2 Navigate to PriceBooks Page
 				logger.log(LogStatus.INFO, "Navigate to PriceBooks Page");
 				Home homePage = PageFactory.initElements(driver, Home.class);
 				homePage.naviagteToPriceBooks(driver);
 				
 				Step-3 Delete the Pricebook record
 				logger.log(LogStatus.INFO, "Delete the Pricebook record");
 				CreateNewPriceBook CreatePage =PageFactory.initElements(driver, CreateNewPriceBook.class);
 				CreatePage.deletePriceBook();
 				
 				Step-4 Search for particular record and Verify that
 				logger.log(LogStatus.INFO, "Search for particular record and Verify that");
 				CreateNewPriceBook CreatePage1 =PageFactory.initElements(driver, CreateNewPriceBook.class);
 				CreatePage1.searchText();
 				
 				extent.endTest(logger);
            }*/
	
	
	
	}
