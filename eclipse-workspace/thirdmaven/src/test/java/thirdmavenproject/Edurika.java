package thirdmavenproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edurika {

	private static Object click;
	private static Duration timeout;

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//WebElement firstname=driver.findElement(By.name("firstname"));
		//WebElement lastname=driver.findElement(By.name("lastName"));
		driver.findElement(By.id("email")).sendKeys("Bikashdhungana651@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.name("pass")).sendKeys("Sarmilasubedi240@");
		Thread.sleep(5000);
		//driver.findElement(By.name("login")).sendKeys("sarmilasubedi240@");
		//(driver,firstname,10dureka");
	  
	    
	    WebElement forgotAccount= driver.findElement(By.linkText("forgotAccount?"));
	   
	   
	   
		
		
	}}

	

	
