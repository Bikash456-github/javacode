package Assignment;


	

	public class ThisCallDemo{ //demo for constructor chaining using this calling concept
	
		ThisCallDemo()
		{
			System.out.println("non para");
		}
		ThisCallDemo(int age)
		{ this();
			System.out.println("this constructor prints integer age"+age);
		}
		
		ThisCallDemo(String name)
		{
			this(36);
			System.out.println("this constructor prints stringname"+name);
		}
		
		ThisCallDemo(double sal)
		{ 
			this(100234.534f);
			System.out.println("this constructor prints double salary"+sal);
		}
		
		ThisCallDemo(float bonus)
		{
			this("Kommareddy");
			System.out.println("this constructor prints float bonus"+bonus); 
		}
		
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		ThisCallDemo t1=new ThisCallDemo(77456.223);
	}
	}

