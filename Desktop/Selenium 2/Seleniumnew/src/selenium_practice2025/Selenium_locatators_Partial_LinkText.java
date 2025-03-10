package selenium_practice2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_locatators_Partial_LinkText {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
	}
}
