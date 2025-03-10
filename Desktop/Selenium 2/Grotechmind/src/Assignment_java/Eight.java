package Assignment_java;//method overloding

public class Eight {
	
	void school(int a)
	{ 
		System.out.println("my first non static method");
	}
	static void school(double b,int a)
	{
		System.out.println("my second static method");
	}
	static void school(char c,double b ,int a)
	{
		System.out.println("my thirst static method");
	}
	void school(char c,double b)
	{
		System.out.println("my forth non static method");
		
	}
      void school(double b)
	{
	System.out.println("my fifth non static method");
	}
      public static void main(String[] args) {
    	  System.out.println("we love software testing");
    	  Eight e1=new Eight();
    	  e1.school(2);
    	  school(45.54,5);
    	  school('z',23.54,5);
    	  e1.school('x',54.65);
    	  e1.school(12.21);
    	  
    	  
    	  
    	  
    	  
		
	}
}