package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	//step1
	@FindBy(xpath="//span[@class='nv-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(xpath="(//span[.='Sign in']0[1]")
	WebElement signin_tologin;
	//step2
	public void aandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signin() {
		
		
	}
	public void search() {
		// TODO Auto-generated method stub
		
	}
}
