

package com.autodeskcrm.orgtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodeskcrm.genericlib.BaseClass;
import com.autodeskcrm.genericlib.ExcelLib;
import com.autodeskcrm.objectrepositorylib.CreateNewORg;
import com.autodeskcrm.objectrepositorylib.Home;
import com.autodeskcrm.objectrepositorylib.OrgInfoPage;
import com.autodeskcrm.objectrepositorylib.Orgnizations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
/**
 * 
 * @author Deepak
 *
 */
@Listeners(com.autodeskcrm.genericlib.SampleList.class)
public class OrgTest  extends BaseClass{
	
	ExcelLib elib = new ExcelLib();
	/**
	 * 1. login to CRm
	 * 2. navigate to Org Page
	 * 3. create new Org button
	 * 4. create Org
	 * 5. verify Org
	 * 6. logout
	 * @throws Throwable 
	 */
	@Test
	public void createORgTest() throws Throwable{
		ExtentTest logger =  extent.startTest("createORgTest");
		
		/*read the data from Excel */
		String orgName = elib.getExcelData("Pricebook", 1, 2);
		
		/* step 2 : navigate to ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page ");
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.naviagteToOrganizations();
		
		/* step 3 : navigate to ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		Orgnizations orgPage = PageFactory.initElements(driver, Orgnizations.class);
		orgPage.navigateToCreateOrgPAge();
		
		/* step 4 : create org */
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		CreateNewORg createOrgpage  = PageFactory.initElements(driver, CreateNewORg.class);
		createOrgpage.createOrg(orgName);
		
		/* step 5 : verify org */
		logger.log(LogStatus.INFO, "verify the org deatils");
		OrgInfoPage orginfoPage = PageFactory.initElements(driver, OrgInfoPage.class);
		String actORgNAme = orginfoPage.getOrganizationNAmeInfo().getText();
		Assert.assertEquals(actORgNAme, orgName);
		
		extent.endTest(logger);
		
	}


	/**
	 * 1. login to CRm
	 * 2. navigate to Org Page
	 * 3. create new Org button
	 * 4. create Org with type
	 * 5. verify Org
	 * 6. logout
	 * @throws Throwable 
	 */
	@Test
	public void createORgWithTypeTest() throws Throwable{
		ExtentTest logger =  extent.startTest("createORgWithTypeTest");
		
		/*read the data from Excel */
		String orgName = elib.getExcelData("org", 4, 2);
		String orgType = elib.getExcelData("org", 4, 3);
		
		/* step 2 : navigate to ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page ");
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.naviagteToOrganizations();
		
		/* step 3 : navigate to ORg Page */
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		Orgnizations orgPage = PageFactory.initElements(driver, Orgnizations.class);
		orgPage.navigateToCreateOrgPAge();
		
		/* step 4 : create org  with Press type*/
		logger.log(LogStatus.INFO, "navigate to ORg Page");
		CreateNewORg createOrgpage  = PageFactory.initElements(driver, CreateNewORg.class);
		createOrgpage.createOrg(orgName,orgType);
		
		/* step 5 : verify org */
		logger.log(LogStatus.INFO, "verify the org deatils");
		OrgInfoPage orginfoPage = PageFactory.initElements(driver, OrgInfoPage.class);
		String actORgNAme = orginfoPage.getOrganizationNAmeInfo().getText();
		Assert.assertEquals(actORgNAme, orgName);
		
		extent.endTest(logger);
		
	}
	
}
