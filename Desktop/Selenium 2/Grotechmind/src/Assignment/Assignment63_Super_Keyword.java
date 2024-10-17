package Assignment;

class Parent_Class
{
	void Parent_Method()
	{
		System.out.println();
	}
	void Parent_Method(int a)
	{
System.out.println();
	}
}
public class Assignment63_Super_Keyword
{
void Parent_Method(int a)
{
	System.out.println();
	super.Parent_Method(40);
}
public static void main(String[] args) {
	Assignment63_Super_Keyword	obj=new Assignment63_Super_Keyword();
	obj.Parent_Method();
	obj.Parent_Method(40);
	
	
}
}

