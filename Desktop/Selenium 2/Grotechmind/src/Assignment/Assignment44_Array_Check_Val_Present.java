package Assignment;

public class Assignment44_Array_Check_Val_Present {
//create a array of size of 5 and just check 34 is present in array or not
	
	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]  = 33 ;
		array1[1]  = 23 ;
		array1[2]  = 32 ;
		array1[3]  = 34 ;
		array1[4]  = 54 ;
		int valTocheck=34;
		for (int i=0;i<array1.length;i++)
		{
			if(array1[i]==valTocheck) {
				System.out.println(valTocheck+" is present in Array");
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
