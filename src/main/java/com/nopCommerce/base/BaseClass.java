package com.nopCommerce.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.nopCommerce.actiondrivers.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	//public static WebDriver driver1;
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	
	public static Logger logger;
	@BeforeTest
	public static void Readconfig() 
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir")+"\\Configurations\\config.properties");
			//driver=new ChromeDriver();
			prop.load(ip);
			
			Logger logger=Logger.getLogger("ecommerce");
			PropertyConfigurator.configure("Log4j.properties");
			
			
			
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}



		
		
	
	
	public static void launchApp()
	{
		 
		
		WebDriverManager.chromedriver().setup();
		String browserName=prop.getProperty("browser");
		
		if(browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver_win32 (1)/chromedriver.exe");
			
			driver.set(new ChromeDriver());
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			// driver = new FirefoxDriver();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			// driver = new InternetExplorerDriver();
			driver.set(new InternetExplorerDriver());
		}
		getDriver().manage().window().maximize();
		Action.implicitWait(getDriver(), 20);
		Action.pageLoadTimeOut(getDriver(), 30);
		getDriver().get(prop.getProperty("url"));
		
		 
		
	}
	
	
	
	
	
	
	
	
}
