package Assignment;

public class Assignment48_Method_Overloading {
//program for method Oveloding
	static void method1()
	{
		System.out.println("method without parameter");
}
	static void method(int a)
	{
		System.out.println("method with int parameter value is - "+a);
}
	void method1(String s)
	{
		System.out.println("non static method with String parameter value is -"+s);
	}
	public static void main(String[] args) {
		method1();
		method(15);
		Assignment48_Method_Overloading  m1=new Assignment48_Method_Overloading ();
		m1.method1("bikash");
		
		
	}
	}