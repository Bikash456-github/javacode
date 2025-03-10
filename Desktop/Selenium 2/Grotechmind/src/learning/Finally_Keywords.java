package learning;
public class Finally_Keywords {
public static void main(String[] args) {
	    try {
		int a=2/10;
		System.out.println(a);
	}
	catch(java.lang.ArithmeticException a1)
	{
	System.out.println("handeled the exceptions");	
	}
	    finally//use only in case of exception handiling//there is try or catch will execute which 
	    //which will come to know only in run time 
	    {
	    	System.out.println("Welcome to GTM");
	    	try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    }
}
}
