package Assignment;

class Supermostclass
{
	static void method1_supermostclass_static() 
	{
		System.out.println("method1_supermostclass_static");
	}
	void method1_supermostclass_non_static() {
	}
	{
		System.out.println("method1_supermostclass_non_static() ");
	}
}
class Superclass extends Supermostclass
{
static void method1_superclass_static()
{
System.out.println("method1_superclass_static");	
}
void method1_superclass_nonstatic()
{
	
System.out.println("method1_superclass_nonstatic");
}
}

public class Assignment21_MultiLevel_SingleClass_0 extends Superclass
{
public static void main(String[] args) {
	 Assignment21_MultiLevel_SingleClass_0  obj1=new  Assignment21_MultiLevel_SingleClass_0 ();
	 method1_supermostclass_static(); 
	 method1_superclass_static();
	 obj1.method1_superclass_nonstatic();
     obj1.	method1_supermostclass_non_static();
}
}
