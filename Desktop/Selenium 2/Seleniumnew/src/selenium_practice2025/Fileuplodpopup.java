package selenium_practice2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuplodpopup {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");//assignment 38
		driver.manage().window().maximize();
		
	
	WebElement	 fileuplod =driver.findElement(By.xpath("//input[@class='file']"));
	fileuplod.sendKeys("/Users/bikashdhungana/Desktop/Name.jpeg");
		
		
		
		
		
}
}