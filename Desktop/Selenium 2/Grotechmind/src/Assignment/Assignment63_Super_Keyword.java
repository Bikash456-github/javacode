package Assignment;

class Google
{
	void login()
	{
	System.out.println("login with mobile");
	}
}
public class Assignment63_Super_Keyword extends Google
{
	void login ()
	{
	
	System.out.println("login with email");
	super.login();
	}
	
	public static void main(String[] args) {
		Assignment63_Super_Keyword a1=new Assignment63_Super_Keyword();
		a1.login();
	}
}