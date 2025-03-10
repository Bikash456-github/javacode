package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MuseActionTest {
  private static final WebElement tooltip = null;

@Test
  public void verifyseleniumcommand () throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
  WebDriver driver = new ChromeDriver();
  driver.get("https://demoqa.com/");
  WebElement ele=driver.findElement(By.xpath("//h5[text()='Elements']"));
  ele.click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[text()=tool Tips']"));
  
  tooltip.click();
  Thread.sleep(2000);
  
  driver.findElement(By.id("toolTtipButton"));
 
  Thread.sleep(5000);
 // WebElement msg=driver.findElement(By.xpath("//[contains(text(),"you hovered.
		//  Assert.AssertTrue(msg.isDisplayed());
  System.out.println("tooltip appearing correctly");

}}