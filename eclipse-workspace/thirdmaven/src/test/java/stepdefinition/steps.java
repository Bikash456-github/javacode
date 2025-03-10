package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	
	@Given("user launch the chrome broswer")
	public void user_launch_the_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver","/Users/bikashdhungana/Downloads/chromedriver_mac64/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

		 //write code here that turns the phrase above into concrete action
		throw new io.cucumber.java.PendingException();
	
	     
}
		
	@Given("User navigate to the application")
	public void user_navigate_to_the_application() {
		driver.get("https://demoqa.com/");
		//Write code here that turns the phrase above into concrete action
		throw new io.cucumber.java.PendingException();
		
	}
	
	@When ("User click on text box menu")  
	public void user_click_on_text_box_menu() {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		//write code here that turns the phrase above into concrete action
		throw new io.cucumber.java.PendingException();
	}

    @When("user click on element tab")
    public void user_click_on_element_tab() {
	//write code here turns the phrase above into concrete action
	throw new io.cucumber.java.PendingException();
      }}
	
