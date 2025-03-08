package Assignment;



public class Assignment58_Single_Level_Inheritance_ChildClass extends Class_Parent
{
	static void Child_Static_Method1()
	{
		System.out.println(" Child_Static_Method1");
	}
	void Child_NonStatic_Method1()
	{
		System.out.println("Child_NonStatic_Method1");
	}
	public static void main(String[] args) {
		Child_Static_Method1();
	//	Parent_Static_Method1();
		Assignment58_Single_Level_Inheritance_ChildClass obj=new Assignment58_Single_Level_Inheritance_ChildClass();
		obj.Child_NonStatic_Method1();
		obj.Child_NonStatic_Method1();
		
	}
}
