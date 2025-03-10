package Assignment_java;
class L 
	{
		L()
		{
			System.out.println("grandparent constructor");
		}
	}
	class M extends L
	{
		M()
		{
			System.out.println("parent");
		}
		void add()
		{
			int l=30;
			int M=20;
			System.out.println("Subtract of 2 number"+(l-M));
		}
	}
	public class InheritConstructor extends M
	{
		InheritConstructor()
		{
		System.out.println("child constructor");
		}
		public static void main(String[] args) 
		{
			InheritConstructor l1 = new InheritConstructor();
			l1.add();
		}
	}
		
			
			
		
