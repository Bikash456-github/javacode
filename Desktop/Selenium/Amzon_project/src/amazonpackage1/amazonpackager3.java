package amazonpackage1;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpackager3 {
public static void main(String[] args) {

	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}
}
