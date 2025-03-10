package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.testng.annotations.Test;

public class EDURIKA6Test {
// @Test
//  public void f() throws InterruptedException {
// 
////System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver-mac-arm64/chromedriver");
//System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver-mac-arm64/chromedriver");
// WebDriver driver = new ChromeDriver();
// driver.manage().window();
// driver.manage().deleteAllCookies();
// driver.get("https://demoqa.com/automation-practice-form");
// 
// driver.findElement(By.id("currentAddress")).sendKeys("1188 folsom street ");
// driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("San francisco 94103 CA");
// Thread.sleep(5000);
// driver.findElement(By.className("css-1g6gooi")).sendKeys("bikash");
// Thread.sleep(5000);
// driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("03/17/1992");
//	 
//	  
//  }
  
  @Test
  public void LaunchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window();
		 driver.manage().deleteAllCookies();
		 driver.get("https://demoqa.com/automation-practice-form");
		 
		 driver.findElement(By.id("currentAddress")).sendKeys("1188 folsom street ");
		 driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("San francisco 94103 CA");
		 Thread.sleep(5000);
		 driver.findElement(By.className("css-1g6gooi")).sendKeys("bikash");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("03/17/1992");
			 
		}
}
