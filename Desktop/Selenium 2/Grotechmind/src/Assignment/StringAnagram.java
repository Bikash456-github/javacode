package Assignment;
import java.util.Arrays;
public class StringAnagram {
	
		public static void main(String[] args) 
		{
			String str1="heart";
			String str2="earth";
			
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			if(ch1.length==ch2.length)
			{
				Arrays.sort(ch1);
				System.out.println(ch1);
				Arrays.sort(ch2);
				System.out.println(ch1);
				if(ch1==ch2)
				{
					System.out.println(Arrays.toString(ch1)+"and"+Arrays.toString(ch2)+"are equal");
				}
				
				else
				{
					System.out.println(Arrays.toString(ch1)+"and"+Arrays.toString(ch2)+"are   not  equal");
			}
				
			

		}

	}

	}

