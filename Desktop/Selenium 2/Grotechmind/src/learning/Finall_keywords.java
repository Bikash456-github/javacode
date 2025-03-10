package learning;

class amazon_class
{
 final void auth()
	{
		System.out.println("login with email id ");
	}
}
public class Finall_keywords  extends amazon_class{

	void mobile()
	{
		
		System.out.println("login with mobile no");
	}

public static void main(String[] args) {
	Finall_keywords  m1=new Finall_keywords ();
	m1.auth();
	
	
}	
	
	
	
	
	
//non stattic method can be overridden
//Final keyword can use with parent class which is non static method	
//parent class is getting overridden so we use super keyword	
	
	
}
