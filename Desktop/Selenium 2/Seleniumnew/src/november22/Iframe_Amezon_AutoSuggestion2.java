package november22;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Iframe_Amezon_AutoSuggestion2 {
@Test
	public static void main(String[] args)throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();

WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("Reebok Mens Advent Tr Track and Field Shoe"+Keys.ENTER);
WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
e2.click();
Set<String>s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
String parentid =i1.next();//parent winodw id
String childid=i1.next();//any child id
System.out.println(parentid);
System.out.println(childid);
driver.switchTo().window(childid);
WebElement buynow=driver.findElement(By.id("buy-now-button"));
buynow.click();
WebElement email=driver.findElement(By.id("ap_email"));
email.sendKeys("Bikashdhungana651@gmail.com");
email.click();
WebElement emailclick=driver.findElement(By.id("continue"));
emailclick.click();
WebElement passclick=driver.findElement(By.id("ap_password"));
passclick.sendKeys("Sarmilaamerica123$");
passclick.click();
WebElement emailclick2=driver.findElement(By.id("signInSubmit"));
emailclick2.click();
WebElement Cardnumber=driver.findElement(By.name("ppw-instrumentRowSelection"));
Cardnumber.click();
WebElement Card =driver.findElement(By.linkText("Enter card details"));
Card.click();

WebElement Handleiframe=driver.findElement(By.name("ApxSecureIframe"));
driver.switchTo().frame(Handleiframe);
WebElement Cardnumber2 =driver.findElement(By.linkText("Enter card details"));
Cardnumber2.sendKeys("4591562307594099");
WebElement ccv =driver.findElement(By.id("876"));
ccv.click();




/*
driver.switchTo().defaultContent();
*/
		
	}

}
