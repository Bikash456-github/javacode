package Assignment;

class ParentClass
{
	public static void method1()
	{
		System.out.println("parent class static method");
	}
	public void method2() 
	{
		System.out.println("parent class Nn static method");	
	}
}
public class	Assignment57_Single_Level_Inheritance extends ParentClass
{
public static void Childmethod1()
	{
	System.out.println("Child class Static method");
	}
	public void Childmethod2(){
		{
			System.out.println("child class Non Static method");
			
		}
		
		}
	
	public static void main(String[] args) {
		Childmethod1();
		method1();
		Assignment57_Single_Level_Inheritance B1=new Assignment57_Single_Level_Inheritance(); 
		B1.Childmethod2();
		B1.method2();
	
		
		
	}}	
		
	

	
	
	
	
	

	
	
