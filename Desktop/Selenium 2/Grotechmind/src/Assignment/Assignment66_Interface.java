package Assignment;

interface interface1
{
	void method1();
	void method2(int a);
	
}
public class Assignment66_Interface implements interface1
{
public static void main(String[] args) 
{
	Assignment66_Interface	 obj=new Assignment66_Interface();
obj.method1();
obj.method2(20);

}
@Override
public void method1()
{
	System.out.println("overriden abs method without para"); 
	
}
@Override
public void method2(int b)
{
	System.out.println("overriden abs method with para int "+b);
}
}
