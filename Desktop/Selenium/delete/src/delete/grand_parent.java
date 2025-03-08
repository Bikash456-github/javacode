package delete;

 class grand_parent
 {
		grand_parent()
		{
		System.out.println("1");
	    }
 }
	class parent_class extends grand_parent
	{
		parent_class()
		{
			
			System.out.println("2");
		}
	}
		class Child_class extends parent_class
		{
			Child_class()
		{
			
			System.out.println("3");
	}
			
public static void main(String[] args) 
{
	new Child_class();
}
}
		
		
		