package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HandlingWindows {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
	
	driver.findElement(By.className(
	
	
	
	
		
		
	
	
		
		
		
		
		
		
		
		
	}

}
