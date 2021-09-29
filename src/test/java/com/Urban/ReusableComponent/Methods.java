package com.Urban.ReusableComponent;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Urban.Utilities.PropertyFileReader;

public class Methods {

	//public static WebDriver driver;
	public static void loadURL(WebDriver driver) throws IOException {
		driver.get(PropertyFileReader.loadfile().getProperty("url"));
		timelapse(driver);
	}
	
	public static void timelapse(WebDriver driver) throws NumberFormatException, IOException {
		int wait = Integer.parseInt(PropertyFileReader.loadfile().getProperty("implicitWait"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	public static void clicking(By selector,WebDriver driver) throws InterruptedException {
		driver.findElement(selector).click();
		Thread.sleep(1500L);
	}
	 public static boolean Tab(By selector,WebDriver driver) {//tab
	 Actions actions = new Actions(driver);
	 try {
		 WebElement move=driver.findElement(selector);//storage      
	        actions.moveToElement(move).build().perform();	
	        Thread.sleep(1500L);
	        return true;
	 }
	 catch(Exception e) {
		 System.out.println(String.format("Element %s doesnt exist", selector));
		 return false;
	 }
	 }
	 public static boolean tabClick(By selector,WebDriver driver) {//tabClick
		 Actions actions = new Actions(driver);
		 try {
			    WebElement move1=driver.findElement(selector);
		        actions.moveToElement(move1).click().build().perform();
		        Thread.sleep(1500L);
		        return true;
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector));
			 return false;
		 }
	 }
	 public static void getEmail(By selector,WebDriver driver,String keys) throws InterruptedException {
			 Thread.sleep(1000L);
			driver.findElement(selector).click();
			driver.findElement(selector).sendKeys(keys);
		    Thread.sleep(1000L);
		}
		public static void getPassword(By selector,WebDriver driver,String keys) throws InterruptedException {
			driver.findElement(selector).click();
			driver.findElement(selector).sendKeys(keys);
			Thread.sleep(1000L);		
		}
	 public static void verifyTitle(By selector,WebDriver driver) {
		 try {
			    String verify=driver.findElement(selector).getText();
		        Assert.assertEquals(verify,"Dressing Table");
		        System.out.println("Verifying the landing page title: "+driver.findElement(selector).getText());//PageTitle
		 }
		 catch(Exception e) {
			 System.out.println("Title you are expect doesnt exist");
		 }
	 }
	 public static void count(By selector1,By selector2,WebDriver driver) {
		 try {
			 System.out.println("No Of Links Present in the url: "+driver.findElements(selector1).size());//NoOfLinks
		     System.out.println("No Of products Present in the url: "+driver.findElements(selector2).size());//NoOfproducts
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector1));
			 System.out.println(String.format("Element %s doesnt exist", selector2));
		 }
	 }
	 public static void matTypes(By selector1,By selector2,WebDriver driver) throws InterruptedException {
		 String verify=driver.findElement(selector1).getText();
	        Assert.assertEquals(verify,"Mattress By Range");
	        System.out.println("Verifying the landing page title: "+driver.findElement(selector1).getText());//PageTitle
			 List<WebElement> list=driver.findElements(selector2);
			 for(int i=0;i<driver.findElements(selector2).size();i++) {
		        System.out.println(list.get(i).getText());
			 }
			 Thread.sleep(1500L);
		 }
	 public static void Title_img(By selector1,By selector2,WebDriver driver) {
		 String verify=driver.findElement(selector1).getText();
	     Assert.assertEquals(verify,"Wooden Sofa Sets");
	     System.out.println("Verifying the landing page title: "+driver.findElement(selector1).getText());//PageTitle
	     driver.findElement(selector2).click();
	 }
	 public static void tabCart(WebDriver driver) {
		 try {
			 Set<String> s=driver.getWindowHandles();
			 Iterator<String> i=s.iterator();
			 String parent=i.next();
			 String child=i.next();
			 driver.switchTo().window(child);
		 }
		 catch(Exception e) {
			 System.out.println("Cannot switch tabs");
		 }
	 }
	 public static void addCart(By selector,WebDriver driver) {
		 try {
			 driver.findElement(selector).click();
		 }
		 catch(Exception e) {
			 System.out.println("Button no found");
		 }
	 }
	 public static void verifyCart(By selector,WebDriver driver) {
		 try {
			 driver.findElement(selector).click();
			 System.out.println("Add cart verified");
		 }
		 catch(Exception e) {
			 System.out.println("Button no found");
		 }
	 }
	 public static void clickSearch(By selector,WebDriver driver,String key) throws InterruptedException {
		 driver.findElement(selector).click();
		 driver.findElement(selector).sendKeys(key);
		 Thread.sleep(1000L);
		 driver.findElement(selector).sendKeys(Keys.ARROW_UP);
		 driver.findElement(selector).sendKeys(Keys.ENTER);
	 }
	 public static void verifyPriceRange(By selector,WebDriver driver) {
		 System.out.println("Price Range changes verified");
		 driver.findElement(selector).click();
	 }
	 public static void listPrice(By selector,WebDriver driver) {
		 List<WebElement> list=driver.findElements(selector);
		 System.out.println("Highest Price of the Product present in the page is  : "+list.get(0).getText());
	     /*for(int i=0;i<list.size();i++) {
	      System.out.println("List of Products Price : "+list.get(i).getText());
	     }*/
	 }
	 public static void offerdetails(By selector1,By selector2,WebDriver driver) {
		 System.out.println("NoOf procducts offers 20% discount: "+driver.findElements(selector1).size());
		 System.out.println("NoOf Sold Out procducts: "+driver.findElements(selector2).size());
	 }
	 public static void newArrival(By selector,WebDriver driver) {
	 System.out.println("Total NoOf New Arrival Products: "+driver.findElements(selector).size());
	 }
	 public static void colorChoose(By selector1,By selector2,WebDriver driver) {
		 try {
			 driver.findElement(selector1).click();
			 System.out.println(driver.findElement(selector2).getText());
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector1));
			 System.out.println(String.format("Element %s doesnt exist", selector2));
		 }
	 }
	 public static void sizeTV(By selector,WebDriver driver) {
		 try {
			 System.out.println("NoOf Products: "+driver.findElements(selector).size());
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector));
		 }
	 }
	 public static void productDetails(By selector,WebDriver driver) {
		 try {
			 List<WebElement> list=driver.findElements(selector);
			 for(int i=0;i<list.size();i++) {
			      System.out.println("Product Details : "+list.get(i).getText());
			  }
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector));
		 }
	 }
	 public static void Greetings(By selector1,By selector2,WebDriver driver) {
		 try {
			 String verify=driver.findElement(selector1).getText();
		     Assert.assertEquals(verify,"Gift Cards");
		     System.out.println("Verifying the landing page title: "+driver.findElement(selector1).getText());//PageTitle
		     System.out.println(driver.findElement(selector2).getText());
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector1));
			 System.out.println(String.format("Element %s doesnt exist", selector2));
		 }
	 }
}
