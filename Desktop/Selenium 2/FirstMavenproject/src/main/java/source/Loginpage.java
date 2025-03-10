package source;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Loginpage 
	{

		WebDriver driver;
		//step 1
		@FindBy(id="ap_email")
		WebElement username_tf;
		
		@FindBy(id="continue")
		WebElement continue_button;
		
		@FindBy(name="password")
		WebElement password_tf;
		
		@FindBy(id="auth-signin-button")
		WebElement signin_button;
		
		@FindBy(id="")
	WebElement Searching;
		//l1.pwd_signin();
		//l1.pwd_signin();
		
		//step 2
		public void un()
		{
			username_tf.sendKeys("**********");
		
		}
		public void un_continue()
		{
			continue_button.click();
			
			
		}public void pwd()
		{
	        password_tf.sendKeys("********");
		}
		public void pwd_signin()
		{
			signin_button.click();
			
		}
		public void searching()
		{
		Searching.click();	
		}
		
		//step 3
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
	}

