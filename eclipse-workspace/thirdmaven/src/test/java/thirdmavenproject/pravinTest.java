package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class pravinTest {
  @Test
  public void f() throws InterruptedException {
	 // System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac64/chromedriver");
	  System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	  
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");

		driver.findElement(By.name("username")).sendKeys("Bikash456");
		driver.findElement(By.cssSelector("input[name='account.firstName']")).sendKeys("Bikash");
		Thread.sleep(5000);
		driver.findElement(By.name("account.phone")).sendKeys("4156249892");		
		driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("Dhungana");
		driver.findElement(By.name("account.email")).sendKeys("Bikashdhungana651@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("account.address1")).sendKeys("1188 folsom street");
		driver.findElement(By.name("account.address2")).sendKeys("San francisco");
		driver.findElement(By.name("account.city")).sendKeys("san francisco 2");
		driver.findElement(By.name("account.state")).sendKeys("CA");
		driver.findElement(By.cssSelector("input[name='account.zip']")).sendKeys("94103");
		driver.findElement(By.cssSelector("input[name='account.country']")).sendKeys("America");
		Select sel =new Select (driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		sel.selectByVisibleText("japanese");
		Select Sel = new Select (driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		Sel.selectByVisibleText("CATS");
		Thread.sleep(5000);
  }
}
