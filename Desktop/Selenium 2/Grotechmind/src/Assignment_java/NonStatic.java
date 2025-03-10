package Assignment_java;

public class NonStatic {

	
		void add(int M, int N)
		{
		int sum=M+N;
		System.out.println(sum);
		}
		void sub(int M,double N)
		{
			double result=M-N;
		System.out.println(result);
		
		}
		public static void main(String[] args)
		{
		NonStatic n1=new NonStatic();
		n1.add(-100,100);

	}

}
