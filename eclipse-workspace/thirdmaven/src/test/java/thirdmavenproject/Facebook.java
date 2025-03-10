

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Facebook {
	
	public void verifyfacebook() throws Exception{
	System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
    driver.get("https://connect.secure.wellsfargo.com/auth/login/present?origin=cob&LOB=CONS");
    driver.findElement(By.cssSelector("#j_username")).sendKeys("bikash");
    driver.findElement(By.name("j_password")).sendKeys("bikash");
    driver.findElement(By.xpath("xpathvalue")).click();
    driver.findElement(By.id("GTLPUZQM")).click();
    Thread.sleep(5000);
    driver.quit();
    driver.close();
	
	
	
	

}
}