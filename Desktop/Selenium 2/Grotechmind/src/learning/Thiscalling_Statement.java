package learning;

public class Thiscalling_Statement {
	Thiscalling_Statement (char e)

	{
		System.out.println("Constructor with char");		
	}	
	Thiscalling_Statement (String name)
	
	{
		this('f');
	System.out.println("Constructor with name");	
	}
Thiscalling_Statement (int a)
	
	{
	this("bikash");
	System.out.println("Constructor with para");
	
	}
Thiscalling_Statement ()

{
	this(100);
	System.out.println("Constructor with  non para");		
}

public static void main(String[] args) {
	new Thiscalling_Statement();
}


}
