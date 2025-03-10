package TestNgdelete;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Lunchamazon_searchshoes_Verifytestcase_passfail {
	@Test
public void Testamazon() throws InterruptedException		
{	
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.Amazon.in");
driver.manage().window().maximize();
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("shoes"+Keys.ENTER);
Thread.sleep(3000);

List  <WebElement >li=driver.findElements(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
int  x=li.size();
System.out.println("size of list of webElements"+x);
Assert.assertEquals((li.size())>20,true); 
}
@Test
public void Testamazon2() throws InterruptedException
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(3000);

	List<WebElement>li=driver.findElements(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
int x=li.size();
System.out.println("size of list of webelements"+x);
Assert.assertEquals((li.size())>20,true);


}}
