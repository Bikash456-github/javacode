package String_functions_Array;

public class SiB_SBB_methods //IIB
{
	{
		System.out.println("IIB");
	}
	static //SIB
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		new SiB_SBB_methods();
		new SiB_SBB_methods(2);
		new SiB_SBB_methods("ram");
	}
		public SiB_SBB_methods()
		{
			System.out.println("Constructor1");
		}
		
		public SiB_SBB_methods(int a)
		{
			System.out.println("Constructor2");
		}
		
		public SiB_SBB_methods(String a)
		{
			System.out.println("Constructor3");
		}
		
	//SIB: Static Initialization Block
	//IIB: Instance Initialization Block
	

}
