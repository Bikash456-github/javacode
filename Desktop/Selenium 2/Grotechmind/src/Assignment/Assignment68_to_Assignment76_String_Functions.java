package Assignment;

public class Assignment68_to_Assignment76_String_Functions 
{
	static void Assignment68() 
	
	{
String name ="Bikash";
String nameReplace=name.replace('h', 'z');
	System.out.println("Orginal String"+name);
	System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment70()
	{
	//replace all the alphabetes\
		String name ="Bikash#1234 67@$";
	String nameReplace=name.replaceAll("[]a-z","");
	System.out.println("Orginal String"+name);
	System.out.println("after replace h with z->"+nameReplace);
	}
	//
	static void Assignment69()
	{
		String name ="Manish Tiwari";
		String namereplace=name.replaceAll("Tiwari","kumar");
		System.out.println("Orginal String"+name);
		System.out.println("after replace h with z->"+namereplace);
	}
	
	static void Assignment71()
	{
		//Replace all the numerics
		String name ="Manish#1234 87@$";
		String nameReplace=name.replaceAll("[0-9]","");
		System.out.println("orginal string "+name);
		System.out.println("After replace h with z->+nameReplace");
		
	}
	static void Assignment72()
	{
	//Replace all the Capital letters
		String name="Manish@1234 87@$";
		String namereplace=name.replaceAll("[]A-Z","");
		System.out.println("orginal string "+name);
	    System.out.println("after replace h with z->"+namereplace);
	}
	static void Assignment73()
	{
		// Check if string ends with 'i'
		String name ="AshvinI";
		boolean result=name.matches("(.*)I");
	if(result)
	{
	System.out.println("String ends with I");
	}
	}
	static void Assignment74()
	{
		//Check if string starts with 'A'
		String name="Ashvin";
		boolean result =name.matches("A(.*)");
		if(result)
		{
			System.out.println("String Starts with A");
	}
	
	
	}
	static void Assignment75()
	{
		// check if string contain 'a'
		String name ="AshvanI";
		boolean result =name.matches("(.*)a(.*)");
if( result)
{
	System.out.println("String Contains a");
	}
}
	static void Assignment76() 
	{
		// check if string has exact 4 chars
	String name ="Rani";
	boolean result =name.matches(".....");
	if(result)
	{
		System.out.println("String has exact 4 characters"); 
	}
	}
	public static void main(String[] args) {
	Assignment68();	
	Assignment69();	
	Assignment70();	
	Assignment71();	
	Assignment72();	
	Assignment73();	
	Assignment74();	
	Assignment75();	
	Assignment76();
	}}