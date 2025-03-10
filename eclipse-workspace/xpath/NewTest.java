import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("inside the before method");
		  @Test
		  public void first test() {
			  System.out.println("inside the first test");
		  }
		  @Test
		  public void first test() {
			  System.out.println("inside the first test");
  }
}
