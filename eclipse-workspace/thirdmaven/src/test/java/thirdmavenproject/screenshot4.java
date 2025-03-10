package thirdmavenproject;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class screenshot4 {
	public void verifyscreenshot() throws IOException {
		Date currentdate = new Date(0);
		//System.out.println(currentdate);
		String screenshotfilename= currentdate.toString().replace("  ","-").replace(" "," -");
		System.out.println(screenshotfilename);
		
		
		
	System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.com/");
	TakesScreenshot ts =(TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source , new File("./screenshot/"+screenshotfilename+".png"));
	System.out.println("the screenshot is taken bikash");
	driver.quit();
	
	
	
	
	

}}
