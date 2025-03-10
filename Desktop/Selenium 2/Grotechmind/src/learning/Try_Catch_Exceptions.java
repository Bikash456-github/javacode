package learning;

public class Try_Catch_Exceptions {
public static void main(String[] args)
{

	
	try{
	    int a =1/0;
	    System.out.println(a);
	}
	catch(ArithmeticException al)
	{
	System.out.println("sorry but there was a blocker but we handled it");	
	}
	//only in the case  of exception handiling try block will execute or catch block will execute
	//we will come to know only at run time
	
	
}
}
