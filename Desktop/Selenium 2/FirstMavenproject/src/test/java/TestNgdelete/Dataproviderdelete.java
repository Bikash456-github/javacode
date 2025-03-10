package TestNgdelete;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdelete {

	@DataProvider(name="std_details")
	public Object testdata()
	{
		Object databikash [][]=new Object [2][2];
		databikash[0][0]="Bikashdhungana651@gmail.com";
		databikash[0][1]="Sarmilaamerica123$";
		databikash[1][0]="Sarmilasubedi240@gmail.com";
		databikash[1][1]="Apple123$";
		
		return databikash;
	}
	@Test (dataProvider="std_details")
	public void testcase1(String username,String password)
	{
ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		
		
	}	
}
