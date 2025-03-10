package abstractconcpt;



	abstract class Absclass
	{
		abstract void method1();
		void method2()
		{
			System.out.println("non static method in abs class");
			
		}
		
		static void method3()
		{
			System.out.println("Static concrete method in abs class");
		}
		
	}
	public class Assignment65_Abstract_class extends Absclass 
	{
	
	
	public static void main(String[] args) {
		method3();
		Assignment65_Abstract_class obj =new Assignment65_Abstract_class();
		obj.method2();
		obj.method1();
		
	}

	@Override
	void method1()
	{
		System.out.println("In this method - abstract methode overriden in subclass  i.e  in main methid ");
		
	}

}
