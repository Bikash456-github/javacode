package nazrin;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import srcmainnazrin.DDT;
import srcmainnazrin.HomePage;
import srcmainnazrin.LoginPage;
import srcmainnazrin.ProductDetail;

	

	public class Testcase_08 extends LaunchQuit
	{

		@Test(retryAnalyzer = srcmainnazrin.Retry_Analyzer.class)
		public void product_sort() throws InterruptedException, EncryptedDocumentException, IOException
		{
			DDT d1 = new DDT();
			d1.ddt_login();
			d1.ddt_search();
			
			HomePage h1 = new HomePage(driver);
			h1.aandl(driver);
			h1.signin();
			
			LoginPage l1 = new LoginPage(driver);
			l1.email();
			l1.continue_un();
			l1.pass();
			l1.sign_in_to_amazon();
			
			h1.search();
			
			ProductDetail p1 = new ProductDetail(driver);
			p1.sort_product_by_relevance();
			Thread.sleep(2000);	
			p1.sort_product_by_price();
			Thread.sleep(2000);
			p1.sort_product_by_customer_review();
			Thread.sleep(2000);
			
			try 
		    {
		    	WebElement sortbyOption = driver.findElement(By.xpath("//span[.='Avg. Customer Review']"));
		    	
		    	Assert.assertEquals(true, sortbyOption.isDisplayed());
				
			} catch (Exception e) 
		    {
				System.out.println(e);
			}
			

		}
	}

