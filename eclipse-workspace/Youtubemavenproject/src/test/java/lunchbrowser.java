import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lunchbrowser {
	@Test
	public void verifybrowserlaunch() {
		
		System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://youtube.com");
		driver.get("https://www.facebook.com/");
	}}
