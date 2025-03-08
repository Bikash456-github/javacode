package nazrin;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import srcmainnazrin.DDT;
import srcmainnazrin.HomePage;
import srcmainnazrin.LoginPage;
import srcmainnazrin.YourAccountPage;
import srcmainnazrin.YourAddress;

	public class Testcase_04 extends LaunchQuit
	{
		@Test(retryAnalyzer = srcmainnazrin.Retry_Analyzer.class)
		public void edit_information() throws InterruptedException, EncryptedDocumentException, IOException
		{
			DDT d1 = new DDT();
			d1.ddt_login();
			d1.ddt_addressInfo(); 
			
			HomePage h1 = new HomePage(driver);
			h1.aandl(driver);
			h1.signin();
			
			LoginPage l1 = new LoginPage(driver);
			l1.email();
			l1.continue_un();
			l1.pass();
			l1.sign_in_to_amazon();
			
			h1.aandl(driver);
			h1.your_account();
			
			YourAccountPage y1 = new YourAccountPage(driver);
			y1.your_address();
			y1.add_address();
			Thread.sleep(1000);
			
			YourAddress y2 = new YourAddress(driver);
			y2.country();
			Thread.sleep(1000);
			y2.name();	
			Thread.sleep(1000);
			y2.sn();
			Thread.sleep(1000);
	      	y2.city_name();
	      	Thread.sleep(1000);
	      	y2.state();
	      	Thread.sleep(1000);
	      	y2.pin(); 	
	      	Thread.sleep(500);
			y2.mobile();
			Thread.sleep(2000);
			y2.addAddress_button();
			
			Assert.assertEquals("Your Addresses", driver.getTitle());
			
		}

	}

