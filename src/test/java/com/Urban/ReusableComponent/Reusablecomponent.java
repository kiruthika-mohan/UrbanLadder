package com.Urban.ReusableComponent;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Urban.ReusableComponent.Reusablecomponent;
import com.Urban.Utilities.PropertyFileReader;

public class Reusablecomponent {

	public static WebDriver driver;
	private static Logger log=LogManager.getLogger(Reusablecomponent.class.getName()); 
	public static WebDriver initializer()throws IOException {
    String browser=PropertyFileReader.loadfile().getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			log.info("Chrome driver invocked");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			 log.info("Firefox driver invocked");
		}
		else
		{
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			log.info("Edge driver invocked");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public static void getScreenshot(String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 File target = new File(".\\Screenshots\\" + name + ".png");
	try {
		FileUtils.copyFile(source, target);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("Screenshot taken");
	}

}
