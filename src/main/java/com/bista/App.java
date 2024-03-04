package com.bista;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
		//chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
    	chromeOptions.addArguments("--remote-allow-origins=*");
    	
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	System.out.println("Selenium test scripts execution started...");
    	
    	//open browser and hit url
    	
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
 
    	
    	Thread.sleep(1000);
    	
    	System.out.println("Executing script...");
   	  
	   	driver.get("http://18.215.43.254:8081/contact.html");
	   	driver.findElement(By.id("inputName")).sendKeys("Tek");
	   	driver.findElement(By.id("inputNumber")).sendKeys("5132500234");
	   	driver.findElement(By.id("inputMail")).sendKeys("hello@gmail.com");
	   	driver.findElement(By.id("inputMessage")).sendKeys("My message");
	   	driver.findElement(By.id("my-button")).click();
	   	  
	   	driver.close();
	   	System.out.println("Test executed successfully.");
    	
    	
    }
}
