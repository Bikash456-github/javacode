package learning;

public class Constructor {

	void add()
	{
	System.out.println("Bikash dhungana");	
	}
	Constructor(int a)
	{
		System.out.println("constructor with para");
	}

	Constructor()
	{
		System.out.println("constructor with non para");
	}
	public static void main(String[] args) {
		Constructor m1=new Constructor();
		Constructor m2=new Constructor(1);
	     m1.add();
		 m2.add();
	
		
	}
	
}
