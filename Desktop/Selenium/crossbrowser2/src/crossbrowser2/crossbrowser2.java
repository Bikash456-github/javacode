package crossbrowser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser2 {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Launchamazon(String nameofbrowser)
	{
	if (nameofbrowser.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	if (nameofbrowser.equals("safari"))
	{
		
		driver=new SafariDriver();
	}
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
}
}