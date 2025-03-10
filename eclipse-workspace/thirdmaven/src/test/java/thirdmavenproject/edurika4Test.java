package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class edurika4Test {

  @Test
  public void mainTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","  /Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	
	  //WebDriver driver = new ChromeDriver();
	  //driver.manage().window();
	 // driver.manage().deleteAllCookies();
	//  driver.get("https://demoqa.com/automation-practice-form/");
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form#google_vignette");
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  driver.quit();
	  
	  driver.findElement(By.id("firstName")).sendKeys("Bikash");
	  driver.findElement(By.id("lastName")).sendKeys("dhungana");
	  driver.findElement(By.id("userEmail")).sendKeys("Bikashdhungana651@gmail.com");
	  driver.findElement(By.id("gender-radio-1")).sendKeys("MALE");
	  driver.findElement(By.id("userNumber")).sendKeys("4156249892");	
	  driver.findElement(By.xpath("//div[@class='css-1g6gooi']")).sendKeys("bikash");
	 // Thread.sleep(5000);
	  driver.findElement(By.className("custom-control-label")).click();
	  driver.findElement(By.xpath("1")).sendKeys("bikash");
	  driver.findElement(By.id("currentAddress")).sendKeys("1188 folsom Street san francisco,CA,94103");
	  driver.findElement(By.id("permanentAddress")).sendKeys("USA");
	  driver.findElement(By.id("uploadPicture")).sendKeys("picture");
	 
	 
	
}}