package learning;

class Google
{
void login()
{
	System.out.println("login with mobile no");
}
}
public class Method_Overriding extends Google
{
	void login()
	{
		super.login();
		System.out.println("login with email id");
		
	}
public static void main(String[] args) {
	 Method_Overriding m2=new  Method_Overriding();
	 m2.login();
	
}
}
