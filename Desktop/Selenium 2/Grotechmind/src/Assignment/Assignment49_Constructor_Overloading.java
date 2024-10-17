package Assignment;

public class Assignment49_Constructor_Overloading
{
	Assignment49_Constructor_Overloading()
	{
System.out.println("constructor without parameter");
	}
	Assignment49_Constructor_Overloading(int a)
	{
		System.out.println("Constructor with int parameter"+a);
	}
	Assignment49_Constructor_Overloading(char s)
	{
		System.out.println("Constructor with parameter with char parameter"+s);
	}
	public static void main(String[] args) {
		Assignment49_Constructor_Overloading Constructor_Overloading1=new  Assignment49_Constructor_Overloading();
		new Assignment49_Constructor_Overloading(14);
		new Assignment49_Constructor_Overloading('p');
	
	
	
	}	
	
	
	
	
	
	
	
	
	
	
}
