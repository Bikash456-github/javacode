package Assignment;

class superkeywords {
void login()
{
	System.out.println("mobilenumber");
}
}
class amazon extends superkeywords
{
void login()
{
	System.out.println("emailaddress");
	super.login();
}	
public static void main(String[] args) {
	amazon a1=new amazon ();
	a1.login();
	
}
}	
