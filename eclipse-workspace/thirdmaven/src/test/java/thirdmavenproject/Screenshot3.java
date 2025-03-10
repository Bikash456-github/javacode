package thirdmavenproject;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Screenshot3 {
	 public void f() throws InterruptedException, Exception {
	//System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
		
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver",
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./screenshot/screen.png"));
	System.out.println("the screenshot is takes");
	driver.quit();
	
	
	
	
	
	

}
}