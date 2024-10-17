package Grotechmind;
import java.util.Scanner;
public class TryCatchDemo {
		public static void main(String[] args)
		{
			try (Scanner sc = new Scanner(System.in))
			{
				System.out.println("enter valid age");
				int a=sc.nextInt();
				System.out.println("input for a is--->"+a);
				
			}
			catch(Exception e)
			{
				System.out.println("something went wrong ");
			}
			
		}

	}

