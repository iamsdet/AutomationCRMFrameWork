package com.autodeskcrm.salesorderTest;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodeskcrm.genericlib.BaseClass;
import com.autodeskcrm.genericlib.ExcelLib;
import com.autodeskcrm.objectrepositorylib.CreateNewORg;
import com.autodeskcrm.objectrepositorylib.CreateNewProduct;
import com.autodeskcrm.objectrepositorylib.CreateNewSalesOrder;
import com.autodeskcrm.objectrepositorylib.Home;

import com.autodeskcrm.objectrepositorylib.Orgnizations;
import com.autodeskcrm.objectrepositorylib.Product;
import com.autodeskcrm.objectrepositorylib.SalesOrder;
import com.autodeskcrm.objectrepositorylib.SalesOrderInfoPage;
import com.autodeskcrm.objectrepositorylib.editingSalesOrderpage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * 
 * 
 * @author Vinod
 * 
 */
@Listeners(com.autodeskcrm.genericlib.SampleList.class)
public class SalesOrderTest extends BaseClass
{
	ExcelLib elib = new ExcelLib();
	/**
	 * 1. login to CRm
	 * 2. navigate to Org Page
	 * 3. create new Org button
	 * 4. create Org
	 * 5. navigate to product page
	 * 6. create a new product button
	 * 7. create product
	 * 8. navigate to sales order page
	 * 9. create new sales order
	 * 10. verify new sales order
	 * 11. logout
	 * @throws Throwable 
	 */
	@Test
	public void createSalesOrderTest() throws Throwable
	{
		ExtentTest logger =  extent.startTest("createSalesOrderTest");
		
		/*read the data from Excel */
		
		String orgName = elib.getExcelData("salesorder", 1, 2);
		String productName=elib.getExcelData("salesorder", 1, 3);
		String productQty=elib.getExcelData("salesorder", 1, 4);
		String subject=elib.getExcelData("salesorder", 1, 5);
		String qty=elib.getExcelData("salesorder", 1, 6);
		String billadd=elib.getExcelData("salesorder", 1, 7);
		String shipadd=elib.getExcelData("salesorder", 1, 8);
		
		/* step 2 : navigate to ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page ");
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.naviagteToOrganizations();
		
		/* step 3 : navigate to creata ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		Orgnizations orgPage = PageFactory.initElements(driver, Orgnizations.class);
		orgPage.navigateToCreateOrgPAge();
		
		/* step 4 : create org */
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		CreateNewORg createOrgpage  = PageFactory.initElements(driver, CreateNewORg.class);
		createOrgpage.createOrg(orgName);
		
		/* step 5 : navigate to products */
		logger.log(LogStatus.INFO, "navigate to products ");
		Home homePage2 = PageFactory.initElements(driver, Home.class);
		homePage2.navigateToProduct();
		
		/*step 6 : navigate to create product page*/
		logger.log(LogStatus.INFO, "navigate to product page ");
		Product p=PageFactory.initElements(driver, Product.class);
		p.navigateToCreateProductPage();
		
		/*step 7 : create product*/
		logger.log(LogStatus.INFO, "navigate to create product Page ");
		CreateNewProduct cp=PageFactory.initElements(driver, CreateNewProduct.class);
		cp.createNewProduct(productName, productQty);
		
		/*step 8 : navigate to sales order page*/
		logger.log(LogStatus.INFO, "navigate to sales order Page ");
		Home hpage3=PageFactory.initElements(driver, Home.class);
		hpage3.navigateToSalesorder();
		/*step 9: navigate to create sales order page*/
		logger.log(LogStatus.INFO," navigate to create sales order page" );
		SalesOrder s=PageFactory.initElements(driver, SalesOrder.class);
		s.createsalesorderbtn();
		
		/*step 10 : create sales order*/
		logger.log(LogStatus.INFO, "navigate to creatte sales order Page ");
		CreateNewSalesOrder cs=PageFactory.initElements(driver, CreateNewSalesOrder.class);
		cs.createsalesorder( subject,qty,billadd,shipadd);
		
		/*step 11 : verify sales order*/
		logger.log(LogStatus.INFO, "verifysales order  ");
		SalesOrder sales=PageFactory.initElements(driver, SalesOrder.class);
		sales.verifysalesorder();
		extent.endTest(logger);
	
	}
	
	/**
	 * 1. login to CRm
	 * 2. navigate to sales order page
	 * 3. select any record
	 * 4. click on edit
	 * 5. modify sales order 
	 * 6. verify modified sales order
	 * @throws Throwable 
	 */
	@Test
	public void modifySalesOrderTest() throws Throwable
	{
		ExtentTest logger =  extent.startTest("modifySalesOrderTest");
		String newsubject=elib.getExcelData("salesorder", 4, 2);
		
		/* step 2 : navigate to salesorder page */
		logger.log(LogStatus.INFO, "navigate to salesorder page");
		
		Home hpage=PageFactory.initElements(driver, Home.class);
		hpage.navigateToSalesorder();
		
		/* step 3: select one record*/
		logger.log(LogStatus.INFO, "select one record");
		
		SalesOrder spage=PageFactory.initElements(driver, SalesOrder.class);
		spage.selectrecord();
		
		/*sstep 4 : navigate to sales order info page and go for edit*/
		logger.log(LogStatus.INFO, " navigate to sales order info page and go for edit");
		
		SalesOrderInfoPage sinfopage=PageFactory.initElements(driver, SalesOrderInfoPage.class);
		sinfopage.editrecord();
		
		/*step 5: modify record*/
		logger.log(LogStatus.INFO, "modify record");
		editingSalesOrderpage epage=PageFactory.initElements(driver, editingSalesOrderpage.class);
		epage.modifyrecor(newsubject);
		
		
		
		extent.endTest(logger);
		
		
		
		
	}
	
}
