import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class edurika {
@Test
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.amazon.in/");
	    Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poko f1");
        Thread.sleep(2000);
        driver.findElement(By.className("nav-input")).click();
        driver.findElement(By.linkText("ACM")).click();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       
	}
}
