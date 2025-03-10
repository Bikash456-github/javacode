package learning;

public class Overloadmain_Method {
	public static void main()
	{
	System.out.println("1");	
	}
	
	public static void main(String a) {
		
		System.out.println("2");		
	}
	
	public static void main(char a) {
		System.out.println("3");	
	}
	
public static void main(String[] args) {   //heart of program
	main();
	main("bikash");
	main('g');
	
}
}
