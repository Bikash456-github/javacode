package Assignment;
/*Write a Java program to test if a given string contains the specified sequence of char values.*/

public class StrpresentDemo {

	public static void main(String[] args)
	{
		String str="narendra";
		System.out.println(str.contains("mom"));
		replace1();
		all();}
	static void replace1()
	{
		String str="mom";
		System.out.println(str.replace('s', 't'));
	}
	
	static void all()
	{
		String str="shresta";
		System.out.println(str.replaceAll("[a-z]", "1"));
	}


}