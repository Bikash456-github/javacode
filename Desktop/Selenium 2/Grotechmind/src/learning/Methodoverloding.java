package learning;

public class Methodoverloding {

	
	static void add(int a)
	{
		System.out.println(10);
	}
    static  void add(byte m)
	
	{
		System.out.println(m);
	}
	static void add(char b)
	{
		System.out.println('c');	
	}
	
	public static void main(String[] args) {
		
		Methodoverloding.add(123);
		new  Methodoverloding();
		
	}
}
