package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class edurika5Test {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver"," /Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window();
	  driver.manage().deleteAllCookies();
	  driver.get("https://demoqa.com/automation-practice-form/");
	  driver.findElement(By.cssSelector("bikash"));
	  driver.findElement(By.xpath("//div[@xpath='1']")).sendKeys("bikash");
	  Thread.sleep(5000);
	 //close the browser
	  driver.quit();
 driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1188 folsom street san francisco");
  	  
	  
	  
	  
	  
  }
}
