package selenium1;

import java.io.File;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment37_ScreenShot_With_DateTime_Amezon {

	public static void main(String[] args)throws InterruptedException  {
		
	ChromeDriver driver=new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("	driver.get(\"https://www.google.co.uk/\");");
		Date d1=new Date(1);
		Date p_Date=new Date(d1.getTime());
		System.out.println(p_Date);
		String saveDate=p_Date.toString();
		String get_CurrentDateTime=saveDate.substring(saveDate.length()-4).concat("_").concat(saveDate.substring(2,19));

		TakesScreenshot ts=driver;
		File SourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\Desktop\\]img"+FinalDateTime+".png");
		FileHandler.copy(SourceFile,destFile);
		
		
		
	}

}
