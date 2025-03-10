package TestNgdelete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	public class examtestnglast {
		
		@Test(dataProvider = "input1")
		public void Youtube(String data) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement e = driver.findElement(By.cssSelector("input[placeholder='Search']"));
			e.sendKeys(data);
			Thread.sleep(3000);
			driver.findElement(By.id("search-icon-legacy")).click();
			Thread.sleep(4000);
			driver.quit();
		}
		
		@DataProvider(name = "input1")
		public Object[][] Testcase()
		{
			return new Object[][] {{"shirt"},{"mobile"},{"watercolor"}};
		}

	}

