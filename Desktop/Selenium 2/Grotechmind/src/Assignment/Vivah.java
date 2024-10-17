package Assignment;

public class Vivah {
//method overloding
	static void method1()
	{
	System.out.println("method without parameter");
	}
	static void method (int a)
	
	{
		
		System.out.println("method with int parameter-"+a);
	}
	void method1(String s)
	{
		
		System.out.println("non static with string parameter values is -"+s);
	}
	public static void main(String[] args) {
		method1();
		method(10);
		Vivah  m1=new Vivah ();
		
		
	}
}
