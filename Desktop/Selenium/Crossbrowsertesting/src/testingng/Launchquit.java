package testingng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class Launchquit
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void launch(String nameofbrowser)
{
	

	if (nameofbrowser.equals("Chrome"))
	{
    driver= new ChromeDriver();
}
	

	if (nameofbrowser.equals("Safari"))
	{
    driver= new SafariDriver();
	}
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
}
	
@AfterMethod	
public void quit()	
{
	
}





}
