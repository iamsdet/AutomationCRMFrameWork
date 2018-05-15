package com.autodeskcrm.purchaseodertest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodeskcrm.genericlib.BaseClass;
/**
 * 
 * @author Anantha Krishna
 *
 */
import com.autodeskcrm.genericlib.ExcelLib;
import com.autodeskcrm.genericlib.WebDriverCommonLib;
import com.autodeskcrm.objectrepositorylib.CreateNewProduct;
import com.autodeskcrm.objectrepositorylib.CreateNewPurchaseOrder;
import com.autodeskcrm.objectrepositorylib.CreatenewVendor;
import com.autodeskcrm.objectrepositorylib.Home;
import com.autodeskcrm.objectrepositorylib.Products;
import com.autodeskcrm.objectrepositorylib.PurchaseOrderInfoPage;
import com.autodeskcrm.objectrepositorylib.Purchaseorder;
import com.autodeskcrm.objectrepositorylib.Vendors;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
 

@Listeners(com.autodeskcrm.genericlib.SampleList.class)
public class PurchaseorderTest extends BaseClass
{
	ExcelLib elib=new ExcelLib();
	/**
	 * 1.login to crm
	 * 2.navigate to vendor
	 * 3.create new vendor
	 * 4.navigate to product
	 * 5.craete new product
	 * 6.navigate to purchase order
	 * 7.click on create new purchase order
	 * 8.crate new  purchase order
	 * 9.verify purchase order
	 * 10.logout
	 * @throws Throwable 
	 * 
	 */
	@Test
	public void createPurchaseorderTest() throws Throwable
	{
		ExtentTest log=extent.startTest("createPurchaseorderTest");
		/*read the data from excel*/
		String expvalue="Purchase Order Information";
		String vname=elib.getExcelData("porder", 1, 2);
		String subname=elib.getExcelData("porder", 1, 3);
		String baddress=elib.getExcelData("porder", 1, 4);
		String saddress=elib.getExcelData("porder", 1, 5);
		String quntity=elib.getExcelData("porder", 1, 6);
		String prodname=elib.getExcelData("porder", 1, 7);
		String qunt=elib.getExcelData("porder", 1, 8);
		/*step2:navigate to vendor */
		log.log(LogStatus.INFO,"navigate to vendor");
		Home hm=PageFactory.initElements(driver, Home.class);
		hm.navigatetovendor(driver);
		
		/*step 3: create new vendor*/
		log.log(LogStatus.INFO, "create new vendor");
		Vendors v=PageFactory.initElements(driver, Vendors.class);
		v.navigatetocreatenewVendor();
		
		CreatenewVendor cnew=PageFactory.initElements(driver, CreatenewVendor.class);
		cnew.createnewvendor(vname);
		
		/*step4:navigate to product*/
		log.log(LogStatus.INFO, "navigate to product");
		hm.navigateToProduct();
		
		/*step5:create new product*/
		log.log(LogStatus.INFO, "create new product");
		Products p=PageFactory.initElements(driver, Products.class);
		p.navigateToCreateProductPage();
		
		CreateNewProduct prod=PageFactory.initElements(driver, CreateNewProduct.class);
		prod.createNewProduct(prodname, qunt);
		
		/*step6:navigate to purchase order*/
		log.log(LogStatus.INFO, "navigate to purchase order");
		hm.navigatetopurchaseorder(driver);
		
		/*step7:click on create new purchase order*/
		log.log(LogStatus.INFO, "click on create new purchase order");
		Purchaseorder porder=PageFactory.initElements(driver, Purchaseorder.class);
		porder.navigatetocreatenewpurchaseorder();
		
		/*step8:crate new  purchase order*/
		log.log(LogStatus.INFO, "crate new  purchase order");
		CreateNewPurchaseOrder crnew=PageFactory.initElements(driver, CreateNewPurchaseOrder.class);
		crnew.createnewPOrder(subname);
		crnew.getVendorlookup().click();
		
		WebDriverCommonLib weblib=new WebDriverCommonLib();
		weblib.getWindowIDs();
		String pid=weblib.map.get("parentID");
		String cid=weblib.map.get("childID");
		driver.switchTo().window(cid);
		crnew.getVendorlink().click();
		driver.switchTo().window(pid);
		crnew.createnewPOrder(baddress, saddress, quntity);
		
		crnew.getProductlookup().click();
		weblib.getWindowIDs();
		String prid=weblib.map.get("parentID");
		String chid=weblib.map.get("childID");
		driver.switchTo().window(chid);
		crnew.getProductlink().click();
		driver.switchTo().window(prid);
		
		crnew.getSavebutton().click();
		
		/*step9:verify purchase order*/
		log.log(LogStatus.INFO, "verify purchase orde");
		PurchaseOrderInfoPage page= PageFactory.initElements(driver, PurchaseOrderInfoPage.class);
		String actualtext=page.getVerifytext().getText();
		System.out.println(actualtext);
		boolean vlue=actualtext.contains(expvalue);
		System.out.println(vlue);
		Assert.assertEquals(true, vlue);
		extent.endTest(log);
	}
	
	/**
	 * 1.login to crm
	 * 2.navigate to vendor
	 * 3.create new vendor
	 * 4.navigate to product
	 * 5.craete new product
	 * 6.navigate to purchase order
	 * 7.click on create new purchase order
	 * 8.crate new  purchase order
	 * 9.verify purchase order
	 * 10.edit created purchase order
	 * 11.verify updated purchase order
	 * 12.logout
	 * @throws Throwable 
	 */
	@Test
	public void modifypurchaseorderTest() throws Throwable
	{
		ExtentTest log=extent.startTest("createPurchaseorderTest");
		/*read the data from excel*/
		String expvalue="Purchase Order Information";
		String vname=elib.getExcelData("porder", 4, 2);
		String subname=elib.getExcelData("porder", 4, 3);
		String baddress=elib.getExcelData("porder", 4, 4);
		String saddress=elib.getExcelData("porder", 4, 5);
		String quntity=elib.getExcelData("porder", 4, 6);
		String prodname=elib.getExcelData("porder", 4, 7);
		String qunt=elib.getExcelData("porder", 4, 8);
		String newsub=elib.getExcelData("porder", 4, 9);
		
		/* step2:navigate to vendor */
		log.log(LogStatus.INFO,"navigate to vendor");
		Home hm=PageFactory.initElements(driver, Home.class);
		hm.navigatetovendor(driver);
		
		/*step 3: create new vendor*/
		log.log(LogStatus.INFO, "create new vendor");
		Vendors v=PageFactory.initElements(driver, Vendors.class);
		v.navigatetocreatenewVendor();
		
		CreatenewVendor cnew=PageFactory.initElements(driver, CreatenewVendor.class);
		cnew.createnewvendor(vname);
		
		/*step4:navigate to product*/
		log.log(LogStatus.INFO, "navigate to product");
		hm.navigateToProduct();
		
		/*step5:create new product*/
		log.log(LogStatus.INFO, "create new product");
		Products p=PageFactory.initElements(driver, Products.class);
		p.navigateToCreateProductPage();
		
		CreateNewProduct prod=PageFactory.initElements(driver, CreateNewProduct.class);
		prod.createNewProduct(prodname, qunt);
		/*step6:navigate to purchase order*/
		log.log(LogStatus.INFO, "navigate to purchase order");
		hm.navigatetopurchaseorder(driver);
		
		/*step7:click on create new purchase order*/
		log.log(LogStatus.INFO, "click on create new purchase order");
		Purchaseorder porder=PageFactory.initElements(driver, Purchaseorder.class);
		porder.navigatetocreatenewpurchaseorder();
		
		/*step8:crate new  purchase order*/
		log.log(LogStatus.INFO, "crate new  purchase order");
		CreateNewPurchaseOrder crnew=PageFactory.initElements(driver, CreateNewPurchaseOrder.class);
		crnew.createnewPOrder(subname);
		crnew.getVendorlookup().click();
		
		WebDriverCommonLib weblib=new WebDriverCommonLib();
		weblib.getWindowIDs();
		String pid=weblib.map.get("parentID");
		String cid=weblib.map.get("childID");
		driver.switchTo().window(cid);
		crnew.getVendorlink().click();
		driver.switchTo().window(pid);
		crnew.createnewPOrder(baddress, saddress, quntity);
		
		crnew.getProductlookup().click();
		weblib.getWindowIDs();
		String prid=weblib.map.get("parentID");
		String chid=weblib.map.get("childID");
		driver.switchTo().window(chid);
		crnew.getProductlink().click();
		driver.switchTo().window(prid);
		
		crnew.getSavebutton().click();
		
		/*step9:verify purchase order*/
		log.log(LogStatus.INFO, "verify purchase orde");
		PurchaseOrderInfoPage page= PageFactory.initElements(driver, PurchaseOrderInfoPage.class);
		String actualtext=page.getVerifytext().getText();
		
		System.out.println(actualtext);
		boolean vlue=actualtext.contains(expvalue);
		System.out.println(vlue);
		Assert.assertEquals(true, vlue);
		
		
		/*step10:edit created purchase order*/
		log.log(LogStatus.INFO, "edit created purchase order");
		
		page.editporder(newsub);
		/*step11:verify updated purchase order*/
		log.log(LogStatus.INFO, "verify updated purchase order");
		
		String exp="laptop80";
		hm.navigatetopurchaseorder(driver);
		weblib.waitForElemnetMax(porder.getNewporderlink());
		String text=porder.getNewporderlink().getText();
		
		System.out.println(text);
		boolean exp1=text.equals(exp);
		Assert.assertEquals(true, exp1);
		System.out.println("pass");
		extent.endTest(log);
	}
}
