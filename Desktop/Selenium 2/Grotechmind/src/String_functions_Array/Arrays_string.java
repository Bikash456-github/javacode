package String_functions_Array;

public class Arrays_string {

	public static void main(String[] args) {
		//==comparisam assignment
		int []ram=new int[4];
		ram[0]=50;
		ram[1]=30;
		ram[2]=20;
		ram[3]=90;
		int tocheck=90;
		for(int i =0;i<4;i++)
		if(tocheck==ram[i])
		{
		System.out.println("the given no "+tocheck+" is the part if array");	
		System.out.println("the given no "+tocheck+ "  and its index is "+i);	
		}
		else
		{
		System.out.println();	
		}
		//how to find the  index of number 20 line number 12
		//System.out.println(Arrays.toString(ram));
	}

}
