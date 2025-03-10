package Assignment_java;

public class Strin2 {
	{
		String str="narendra";
		System.out.println(str.contains("na"));
		replace1();
		all();

	}

	static void replace1()
	{
		String str="shresta";
		System.out.println(str.replace('s', 't'));
	}
	
	static void all()
	{
		String str="shresta";
		System.out.println(str.replaceAll("[a-z]", "1"));
	}



}
