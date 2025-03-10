package november22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airindia {
	public static void main(String[] args) {
		
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.airindia.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement e1=driver.findElement(By.xpath(""));
e1.click();

	}

}
