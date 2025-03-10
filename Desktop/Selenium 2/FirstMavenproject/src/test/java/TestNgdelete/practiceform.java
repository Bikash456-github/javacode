package TestNgdelete;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceform {
//grotechminds search in youtube
	public static void main(String[] args) throws InterruptedException {
		
	
	    	ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			WebElement e1=driver.findElement(By.linkText("Gmail"));
			WebElement e2=driver.findElement(By.linkText("//a[@class='gb_W']"));
			Actions a1=new Actions(driver);
			a1.contextClick(e1).perform();
			
}
}