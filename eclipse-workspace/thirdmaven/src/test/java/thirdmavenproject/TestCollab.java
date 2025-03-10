package thirdmavenproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCollab {
	
	@Test
	public void LaunchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","  /Users/bikashdhungana/Downloads/chromedriver-mac-arm64/chromedriver");
		                                                         
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		
		
		

}}
