package testcases;

public class Webdriver {
	
		public void verifyBrowserlaunch() {
			//set the driver exe path
			System.setProperty("webdriver.chrome.driver","/Users/Users/bikashdhungana/Downloads/chromedriver_mac64 (1)/Users/bikashdhungana/Downloads");
		//intializing the chrome driver for launching the chrome browser
			Webdriver driver = new Webdriver();
			driver.get("www.facebook.com");
			//webdriver is an interface
			//chromedriver is a class which implement the webdriverinterface
			
			//maximize
			 //driver.manage().window().maximize();{
				
				driver.get("https://demoqa.com/");
				//driver navigate().to("https://demoqa.com/")
				
			
			
		

		private void get(String string) {
			
			
		}}		



