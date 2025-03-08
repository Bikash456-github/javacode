package nazrin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import srcmainnazrin.DDT;
import srcmainnazrin.HomePage;
import srcmainnazrin.ProceedPage;
import srcmainnazrin.ProductDetail;
import srcmainnazrin.ShoppingCartPage;

public class Testcase_15 extends LaunchQuit
{
	@Test(retryAnalyzer = srcmainnazrin.Retry_Analyzer.class)
	public void withoutLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT d1 = new DDT();
		d1.ddt_search();
		
		HomePage h1 = new HomePage(driver);
		h1.search();
		
		ProductDetail p1 = new ProductDetail(driver);
		p1.addItemstocart(driver);
		
		ProceedPage p2 = new ProceedPage(driver);
		p2.gotoCart();
		
		ShoppingCartPage s1 = new ShoppingCartPage(driver);
		s1.proceed();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
	}

}