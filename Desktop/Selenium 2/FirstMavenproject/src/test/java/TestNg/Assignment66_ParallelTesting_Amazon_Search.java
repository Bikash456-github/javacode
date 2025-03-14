package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Assignment66_ParallelTesting_Amazon_Search {
WebDriver driver;

@Test
@Parameters("browser")
	public void Launchamazon(String nameofbrowser){
	//browser initilization
	if (nameofbrowser.equalsIgnoreCase("Chrome"))
	{
		ChromeDriver driver= new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-orig");
		driver=new ChromeDriver();
	}
	if (nameofbrowser.equals("safari"))
	{
		
		driver=new SafariDriver();
	}
	//before configuration
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
//initracting with web elements
	WebElement e1=driver.findElement(By.xpath("//input[@id='gh-ac']"));
	e1.sendKeys("i phone 16"+Keys.ENTER);
	}
	@AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
	
	
	
        }	
	}	
}
