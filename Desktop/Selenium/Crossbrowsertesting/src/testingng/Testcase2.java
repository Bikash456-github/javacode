package testingng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Testcase2 extends Launchquit{	
@Test
public void Searchamazon() 
{

	
	
	WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	e1.click();
	WebElement e2=driver.findElement(By.id("username"));
	e2.sendKeys("Bikash");
	


	
}
}