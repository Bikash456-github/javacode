package String_functions_Array;

public class String_functionslowercase_trim1 {
public static void main(String[] args)
{
	String name="bIKASH";
	int size=name.length();
	
	System.out.println(size);
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	
	String s1="I am Bikash";
	System.out.println(s1);
	System.out.println(s1.trim());
	
	String s2="     I am BIKASH";
	System.out.println(s2);
	System.out.println(s2.trim());
	
	String s3="     I am BIKASH        ";
	System.out.println(s3);
	System.out.println(s3.trim());
	
}
}
