package com.autodeskcrm.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.autodeskcrm.objectrepositorylib.Common;
import com.autodeskcrm.objectrepositorylib.Login;
import com.relevantcodes.extentreports.ExtentReports;



public class BaseClass {
	public static WebDriver driver;
	
	public ExtentReports extent;
	@BeforeSuite
	public void configBeforeSuite(){
		 extent = new ExtentReports("./test-out/advanceReport.html");
		 extent.loadConfig(new File("./extent-config.xml"));
	}
	

	@BeforeClass
	public void configBM(){
		String bNAme = System.getProperty("browser");
		System.out.println("====launch the Browser=====");
		if(bNAme.equals("firefox")){
		 driver = new FirefoxDriver();
		}else if(bNAme.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", 
					"./src/main/resources/resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(bNAme.equals("ie")){
			System.setProperty("webdriver.ie.driver",
					"./src/main/resources/resource/IEDriverserver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void configBeforeMtd() throws Throwable{
		FileInputStream fis = new FileInputStream("./userData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);

		String url = System.getProperty("url");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);                                     
		//login to APP
		Login lp = PageFactory.initElements(driver, Login.class);
		lp.login(pObj.getProperty("username"), pObj.getProperty("password"));
	}
	
	@AfterMethod(groups={"smokeTest","regressionTest"})
	public void configAfterMtd(){
		//logout
		Common c = PageFactory.initElements(driver, Common.class);
		c.logout(driver);
	}

	@AfterClass(groups={"smokeTest","regressionTest"})
	public void configAM(){
		System.out.println("=====close the browser====");
		driver.close();
	}
	
	@AfterSuite
	public void configAfterSuite(){
		extent.flush();
		extent.close();
	}

}
