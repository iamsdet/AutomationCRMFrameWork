package com.f5solutioncrm.leadtest;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodeskcrm.genericlib.BaseClass;
/**
 * @author Sunny
 */
import com.autodeskcrm.genericlib.ExcelLib;
import com.autodeskcrm.objectrepositorylib.CreateLeadbutton;
import com.autodeskcrm.objectrepositorylib.CreateNewLead;
import com.autodeskcrm.objectrepositorylib.Home;
import com.autodeskcrm.objectrepositorylib.LeadsInfoPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@Listeners(com.autodeskcrm.genericlib.SampleList.class)

public class LeadTest extends BaseClass {
	ExcelLib lib=new ExcelLib();
	/*
	 * 1.Login to CRM
	 * 2.Navigate to Lead Page
	 * 3.Create New Leads Button
	 * 4.Create leads
	 * 5.Verify Msg
	 * 6.Logout
	 */
	@Test
	public void CreateLeadTest() throws Throwable{
		ExtentTest log=extent.startTest("CreateLeadTest");
		/* Read the data from excel */
		String fname=lib.getExcelData("Leads",1, 2);
		String lname=lib.getExcelData("Leads",1, 3);
		String cname=lib.getExcelData("Leads",1, 4);
		/* Navigate to Lead Page */
		log.log(LogStatus.INFO, "Navigate to Lead Page");
		Home leadPage=PageFactory.initElements(driver, Home.class);
		leadPage.naviagteToLeads();
		/* Create New Leads Button */
		log.log(LogStatus.INFO, "Create New Leads Button");
		CreateLeadbutton createBtn=PageFactory.initElements(driver, CreateLeadbutton.class);
		createBtn.navigateToCreateLeadPAge();
		/* Create leads */
		log.log(LogStatus.INFO, "Create leads");
		CreateNewLead createlead=PageFactory.initElements(driver, CreateNewLead.class);
		createlead.createleads(fname, lname, cname);
		/* Verify Msg */
		log.log(LogStatus.INFO, "Verify Msg");
		LeadsInfoPage msg=PageFactory.initElements(driver, LeadsInfoPage.class);
		String actmsg=msg.getLeadsinfo().getText();
		boolean result=actmsg.contains(fname);
		Assert.assertTrue(result);
		extent.endTest(log);
	}
	/*
	 * 1.Login to CRM
	 * 2.Navigate to Lead Page
	 * 3.Create New Leads Button
	 * 4.Create leads
	 * 5.Verify Msg
	 * 6.Logout
	 */
	@Test
	public void CreateLeadWithStatusTest() throws Throwable{
		ExtentTest log=extent.startTest("CreateLeadTest");
		/* Read the data from excel */
		String fname=lib.getExcelData("Leads",2, 2);
		String lname=lib.getExcelData("Leads",2, 3);
		String cname=lib.getExcelData("Leads",2, 4);
		String lstatus=lib.getExcelData("Leads",2, 5);
		/* Navigate to Lead Page */
		log.log(LogStatus.INFO, "Navigate to Lead Page");
		Home leadPage=PageFactory.initElements(driver, Home.class);
		leadPage.naviagteToLeads();
		/* Create New Leads Button */
		log.log(LogStatus.INFO, "Create New Leads Button");
		CreateLeadbutton createBtn=PageFactory.initElements(driver, CreateLeadbutton.class);
		createBtn.navigateToCreateLeadPAge();
		/* Create leads */
		log.log(LogStatus.INFO, "Create leads");
		CreateNewLead createlead=PageFactory.initElements(driver, CreateNewLead.class);
		createlead.createleadsWithStatus(fname, lname, cname, lstatus);
		/* Verify Msg */
		log.log(LogStatus.INFO, "Verify Msg");
		LeadsInfoPage msg=PageFactory.initElements(driver, LeadsInfoPage.class);
		String actmsg=msg.getLeadsinfo().getText();
		boolean result=actmsg.contains(fname);
		Assert.assertTrue(result);
		extent.endTest(log);
	}
	/*
	 * 1.Login to CRM
	 * 2.Navigate to Lead Page
	 * 3.Select Leads
	 * 4. leads
	 * 5.Verify Msg
	 * 6.Logout
	 */
	@Test
	public void ModifyLeadTest() throws Throwable{
		ExtentTest log=extent.startTest("CreateLeadTest");
		/* Read the data from excel */
		String fname=lib.getExcelData("Leads",2, 2);
		String lname=lib.getExcelData("Leads",2, 3);
		String cname=lib.getExcelData("Leads",2, 4);
		String lstatus=lib.getExcelData("Leads",2, 5);
		/* Navigate to Lead Page */
		log.log(LogStatus.INFO, "Navigate to Lead Page");
		Home leadPage=PageFactory.initElements(driver, Home.class);
		leadPage.naviagteToLeads();
		/* Create New Leads Button */
		log.log(LogStatus.INFO, "Create New Leads Button");
		CreateLeadbutton createBtn=PageFactory.initElements(driver, CreateLeadbutton.class);
		createBtn.navigateToCreateLeadPAge();
		/* Create leads */
		log.log(LogStatus.INFO, "Create leads");
		CreateNewLead createlead=PageFactory.initElements(driver, CreateNewLead.class);
		createlead.createleadsWithStatus(fname, lname, cname, lstatus);
		/* Verify Msg */
		log.log(LogStatus.INFO, "Verify Msg");
		LeadsInfoPage msg=PageFactory.initElements(driver, LeadsInfoPage.class);
		String actmsg=msg.getLeadsinfo().getText();
		boolean result=actmsg.contains(fname);
		Assert.assertTrue(result);
		extent.endTest(log);
	}
}
