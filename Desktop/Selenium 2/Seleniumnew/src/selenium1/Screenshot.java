package selenium1;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize(); 	
	
	TakesScreenshot ts=	driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\MKT\\Desktop\\AB45\\"+new Screenshot().getClass()+".png");
	//FileHandler.copy(source, destination);
	
	
}
}