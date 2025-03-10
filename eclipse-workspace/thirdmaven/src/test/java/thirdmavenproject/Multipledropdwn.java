package thirdmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ConsString;
@Test
public class Multipledropdwn {
	public static void main(ConsString[]args) {
	System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac_arm64/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.get("https://output.jsbin.com/osebed/2");
	Select select=new Select(driver.findElement(By.id("fruits")));
	select.selectByValue("apple");
	select.selectByValue("grape");
	select.deselectByValue("apple");
	select.selectByIndex(0);//1st value

	}

}
