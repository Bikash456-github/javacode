package Assignment;

public class Thismethod {//override main method

			public static void main() 
			{
				System.out.println("1");
			}
			public static void main(String a) 
			{
				System.out.println("2");
			}
			public static void main(char a) 
			{
				System.out.println("3");
			}
	     	public static void main(String[] args) //heart
		{
			main();
			main("MKT");
			main('J');
			

	}

}
