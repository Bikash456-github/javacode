package Assignment;

 class Parent_Class1
{
	void Parent_Method()
	{
		System.out.println("Parent_Method without parameter");
	}
	void Parent_Method(int a)
	{
		System.out.println("Parent_Method with int parameter"+a);
	
	}
public class Assignment62_Method_overriding extends Parent_Class1
{
	void parent_Method()
	{
	System.out.println("Child_Method without parameter");
	}
	void pareent_Method(int a) 
	{
	System.out.println("Child_Method with int parameter"+a);	
	}
	public static void main(String[] args) 
	{
		Assignment62_Method_overriding obj=new Assignment62_Method_overriding();	
	obj.parent_Method();
	obj.Parent_Method(30);
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
