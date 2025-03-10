package Assignment;

public class Assignment21_MultiLevel_SeperateClass_SubClass extends Assignment21_MultiLevel_SeperateClass_SuperClass
{

	static void method_subclass_Static(String name)
	{
		System.out.println("method_subclass_Static");
		System.out.println("Subclass name is "+name);
	}
	void method_subclass_nonstatic(int a)
	{
		System.out.println("method+subclass_nonstatic");
		System.out.println("value of a is "+a);
		
	}

	public static void main(String[] args) {
		method_superclass_static();
		method_subclass_Static("name");
		method_supermostclass_static();
		Assignment21_MultiLevel_SeperateClass_SubClass m2 = new Assignment21_MultiLevel_SeperateClass_SubClass();
		m2.method_supermostclass_nonstatic(500);
		m2.method_supermostclass_nonstatic(500);
	}
	}		
		
		
		
		
		
		