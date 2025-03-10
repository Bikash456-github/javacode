package testing2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void first test() {
	  System.out.println("inside the first test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside the before method");
	  
	  
  }

}

