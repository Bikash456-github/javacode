package Assignment;

 class Parent_Class1
{
	 void Parent_Method()
		{
			System.out.println("Parent_Method without parameter");
		}
	}
public class Assignment62_Method_overriding extends Parent_Class1
{
	void parent_Method2()
	{
	System.out.println("Child_Method without parameter");
	}
	
	public static void main(String[] args) {
	
	Assignment62_Method_overriding obj=new Assignment62_Method_overriding();	
	obj.Parent_Method();
	obj.parent_Method2();
		
}	
}	

	
	
