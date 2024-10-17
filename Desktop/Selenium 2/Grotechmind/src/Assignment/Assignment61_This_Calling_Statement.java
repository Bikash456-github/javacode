package Assignment;

public class Assignment61_This_Calling_Statement {

	Assignment61_This_Calling_Statement()	
	{
		this('B');
		System.out.println("Constructor without parameter");
	}
	Assignment61_This_Calling_Statement(int a)
	{
	
	System.out.println("Constructor with int parameter"+a);
	}
	Assignment61_This_Calling_Statement(char s)
	{
		this(90);
		System.out.println("Constructor with char parameter"+s);
}
	public static void main(String[] args)
	{
		new Assignment61_This_Calling_Statement();
	}}
