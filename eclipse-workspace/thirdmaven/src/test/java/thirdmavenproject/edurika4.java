package thirdmavenproject;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v104.runtime.model.WebDriverValue;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class edurika4 {

	
	public static void main(String[] args)  throws InterruptedException{
		 WebDriver driver = WebDriverValue.chromedriver().create();
		 	driver.get("https://slack.com/");
		 	System.out.println(driver.getTitle());
		 	
	
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.toolsqa.com/selenium-training?q=headers#enroll-form");
		 driver.findElement(By.id("first-name")).sendKeys("Bikash");
		 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Dhungana");
		 driver.findElement(By.name("email")).sendKeys("Bikashdhungana651@gmail.com");
		 driver.findElement(By.name("mobile")).sendKeys("4156249892");
		 Select sel =new Select (driver.findElement(By.xpath("//select[@id='country']")));
		 sel.selectByVisibleText("United States");
		 driver.findElement(By.id("city")).sendKeys("Nepal");
		 driver.findElement(By.name("message")).sendKeys("bikash loves sarmila");
		 
		 
	
	
	   }
	}


