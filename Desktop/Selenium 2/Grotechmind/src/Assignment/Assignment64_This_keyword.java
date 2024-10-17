package Assignment;

public class Assignment64_This_keyword
{
	int i=40;
	String s1="bikash";
	void method1(int y,String z)
	{
this.i=y;
this.s1=z;

}
	public static void main(String[] args) {
		int x=40;
		String s2="bikash";
		
		Assignment64_This_keyword obj=new Assignment64_This_keyword();
	System.out.println("Orginal global value of i="+obj.i);
	System.out.println("Orginal global value of s1="+obj.s1);
	obj.method1(x, s2);
	System.out.println("After this keyword global value of i="+obj.i);
	System.out.println("After this keyword global value of s1="+obj.s1);
	
	
	}
	
}