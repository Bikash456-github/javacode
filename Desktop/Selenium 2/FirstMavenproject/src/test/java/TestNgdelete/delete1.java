package TestNgdelete;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class delete1 {
	public static void main(String[] args) throws InterruptedException {

ChromeOptions m1=new ChromeOptions();
ChromeDriver driver=new ChromeDriver(m1);
driver.get("https://www.youtube.com");
WebElement e1=  driver.findElement(By.xpath("//input[@name='search_query']"));
e1.sendKeys("india");
e1.sendKeys(Keys.ENTER);
int i = 10;
while (i>5)
{
Point p1=e1.getLocation();
int x=p1.getX();
int y=p1.getY();
System.out.println(x);
System.out.println(y);
JavascriptExecutor js = driver;         //upcasting driver to JavascriptExecutor
js.executeScript("window.scrollBy(0,  "+y+")"); //utilizing a method called executeScript
System.out.println(y);

}
}}