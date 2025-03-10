package Assignment_java;

public class REVERSEstring1 {
	public static void main(String[] args) {
		
	
	String input="aman" ;
	String output="";
	
	for(int i=input.length() -1;i>=0;i--)
	{
		output=output +input.charAt(i);
	}
	//	char c1=input.charAt(i);
	
	System.out.println(output);

}}