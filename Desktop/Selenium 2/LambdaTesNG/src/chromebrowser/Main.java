package chromebrowser;

public class Main {

	public static void main(String[] args) {
		
	String s="welcome to automation"+"BIKASHDHUNGANA";
	int lower=0;
	int upper =0;
	for(int i= 0;i<s.length();i++)
	{
char ch =s.charAt(i);
if(ch>=65&& ch<=90)
{
	upper++;
}			
else
{
	lower++;
}
	}
System.out.println("LOWER"+lower);
System.out.println("UPPER"+upper);
}
	}
 

