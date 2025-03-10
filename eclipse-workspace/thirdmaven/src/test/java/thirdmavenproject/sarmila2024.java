package thirdmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class sarmila2024 {
	public void verifysarmila() {
	
System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");

WebDriver driver=new ChromeDriver();
driver.manage().window().fullscreen();
driver.manage().deleteAllCookies();
driver.get("https://www.ebay.com/");




}}