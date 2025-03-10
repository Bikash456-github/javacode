package Assignment;

abstract class Abs// abstract class
{
	abstract void login();// abstract method
}
class Valid extends Abs
{
	void login()
	{
		System.out.println("dis method is used to execute login details");
	}
	 void validation() 
	{
		System.out.println("dis method is used to validate details");
	}
}

public class AbstractClassDemo
{
	
public static void main(String[] args)
{
	Valid aa1=new Valid();
	aa1.login();
	aa1.validation();
}
}