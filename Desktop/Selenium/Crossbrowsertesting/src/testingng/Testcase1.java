package testingng;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Testcase1 extends Launchquit{	
@Test
public void logibn_to_amazon()
{
	
	WebElement e1=driver.findElement(By.xpath("//input[@id='gh-ac']"));
	e1.sendKeys("i phone 16 pro unlocked "+Keys.ENTER);
	
	
}
}	

