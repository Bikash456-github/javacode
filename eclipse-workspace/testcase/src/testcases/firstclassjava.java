package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class firstclassjava {
	
	@Before
	public void beforesuite(){
	System.out.println("insise the Before suite");
	
}
	@After
public void aftersuite() {
System.out.println("inside the after suite");
	
}

     @After 
Public  void afterTest() {
	System.out.println("insidethe ster Test");
	
}


}
