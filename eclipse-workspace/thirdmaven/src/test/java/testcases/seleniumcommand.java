package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumcommand {
	
	
	@Test
	public void verifySeleniumcommands() throws InterruptedException {
		//set the driver exe path
		System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac64/chromedriver");
		 //intilizing the chrome driver for launching the chrome browser
		WebDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		
		WebElement ele= driver.findElement(By.xpath("//h5[text()=Element]"));
		
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		
		//js.executescripts("arguments[0].click(),"ele);
		
		//scrolling
		js.executeScript("argunment[0].scrollintoview();" ,ele);
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("span[text()='Text Box']")).click();
		//Textbox
		driver.findElement (By.id("userName")).sendKeys("sandeep kumar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[id='currentAddress']")).sendKeys("dallas,texas");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("permanentAddress")).sendKeys("USA");
		driver.findElement(By.cssSelector("svg")).sendKeys("USA");
		Thread.sleep(5000);
		WebElement submit=driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoview();",submit);
		submit.click();
		//driver.findElement(by"userName")).clear();
		Thread.sleep(2000);
		
		
		

}
}
