package learning;

public class Access_Specifier {
	public static void m1()
	{
		System.out.println("1");
	}
	private static void m2()
	{
		System.out.println("2");
	}
	protected static void m3()
	{
		System.out.println("3");	
	}
	static void m4()
	{
		System.out.println("4");	
	}
	 void m5()
	{
		System.out.println("5");	
	}
public static void main(String[] args) {
	m1();
	m2();
	m3();
	m4();
	Access_Specifier m2=new Access_Specifier();
	m2.m5();
}
}










//public protcted private default 
//with variable method class interface abstract class
//meaning of class being public 
//meaning of class being public default and package
//can access inside or within the package and outside the package
//with method can be protect package public private