package delete;

public class thiscallingstatement {

	thiscallingstatement(String name)
	{	
		this('z');
		System.out.println("constructor with name");
	}
	
	thiscallingstatement(int a)
	{
		this("rakesh");
		System.out.println("constructor with para");
	}
	
	thiscallingstatement()
	
	{
		this(100);
	System.out.println("constructor with non para");
	}
	public static void main(String[] args) {
		thiscallingstatement l1=new thiscallingstatement();
	}
	thiscallingstatement(char n1)
	{	
		
		System.out.println("constructor with char");
	}
	}
