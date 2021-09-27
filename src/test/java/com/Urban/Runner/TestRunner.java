package com.Urban.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Urban.ReusableComponent.Reusablecomponent;
import com.Urban.Utilities.DataDriven;
import com.Urban.Utilities.PropertyFileReader;
import com.Urban.pageObject.Cards;
import com.Urban.pageObject.Colours;
import com.Urban.pageObject.Decor;
import com.Urban.pageObject.Living;
import com.Urban.pageObject.Mattresses;
import com.Urban.pageObject.Searching;
import com.Urban.pageObject.Size;
import com.Urban.pageObject.Storage;
import com.Urban.pageObject.Study;
import com.Urban.pageObject.Urban;

public class TestRunner  {

	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Reusablecomponent.class.getName());
	@BeforeMethod
	public void beforeAllTest() throws IOException, InterruptedException {
		driver =Reusablecomponent.initializer();
		driver.get(PropertyFileReader.loadfile().getProperty("url"));
		driver.manage().window().maximize();
		Urban u=new Urban();
		u.Close(driver);
	}
	@Test(priority=0,dataProvider="getdata")
	public static void popup(String username,String password) throws IOException, InterruptedException {
		Urban u=new Urban();
		try
    	{
			u.login(driver);
			u.Email(driver, username);
			u.password(driver, password);
			u.signUp(driver);
			Reusablecomponent.getScreenshot("picture");
    	    log.info("The email or password you entered is incorrect. Please try again.");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Screenshot not taken");
    	}
	}
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		Object[][] data=new Object[1][2];
		data[0][0]=PropertyFileReader.loadfile().getProperty("username");
		data[0][1]=PropertyFileReader.loadfile().getProperty("password");
		
		return data;
	}
	@Test(priority=1)
	public static void testStorage() throws InterruptedException {
		Storage s=new Storage();
		s.storageTab(driver);
		log.info("StorageTab testcase passed Successfully");
	}
	@Test(priority=2)
	public static void testMattress() throws InterruptedException {
		Mattresses m=new Mattresses();
		m.matTab(driver);
		log.info("MattressesTab testcase passed Successfully");
	}
	@Test(priority=3)
		public static void testLiving() {
		Living l=new Living();
		l.livingTab(driver);
		log.info("LivingTab testcase passed Successfully");
	}
	@Test(priority=4,dataProvider="getdata1")
	public static void testSearching(String data) throws InterruptedException {
		Searching s=new Searching();
		s.searchTab(driver,data);
		log.info("SearchingTab testcase passed Successfully");
		Thread.sleep(1000L);
	}
	@DataProvider
	public Object[][] getdata1()
	{
		//array size from 0 but we have to give like below only while declaring array is size is 1
		Object[][] data=null;
		try
		{
			data=DataDriven.getexceldata();
		}
		catch(Exception e)
		{
			System.out.println("cannot reach excel");
		}
		return data;
	}
	@Test(priority=5)
	public static void testStudy() {
		Study s=new Study();
		s.studyTab(driver);
		log.info("StudyTab testcase passed Successfully");
	}
	@Test(priority=6)
	public static void testDecor() throws InterruptedException{
		Decor d=new Decor();
		d.decorTab(driver);
		log.info("DecorTab testcase passed Successfully");
	}
	@Test(priority=7)
	public static void testColours() {
		Colours c=new Colours();
		c.choose(driver);
		log.info("Product colours change testcase passed Successfully");
	}
	@Test(priority=8)
	public static void testSize() throws InterruptedException {
		Size s=new Size();
		s.TvUnitsTab(driver);
		log.info("TvUnitsTab testcase passed Successfully");
	}
	@Test(priority=9)
	public static void testCards() throws InterruptedException {
		Cards c=new Cards();
		c.cardstab(driver);
		log.info("GiftCardsTab testcase passed Successfully");
	}
	@AfterMethod
	public static void closebrowser() {
		driver.quit();
		driver=null;
	}
}
