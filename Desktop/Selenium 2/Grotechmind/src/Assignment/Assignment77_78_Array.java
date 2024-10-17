package Assignment;
import java.util.Arrays;

import org.openqa.selenium.grid.Main;
public class Assignment77_78_Array
{

static void Assignment77()	
{
	//copy array into other
	int array1[]=new int[4];
	array1[0]=30;
	array1[1]=20;
	array1[2]=10;
	array1[3]=44;
	int array2[]=new int[4];
	System.out.println("Array1-"+Arrays.toString(array1));
	for(int i=0;i<array2.length;i++)
	{
		array2[i]=array1[i];
	}
	System.out.println("Array2-"+Arrays.toString(array2));
}
static void Assignment78()
{
	//copy array tino in reverse order
	int array1[]=new int[4];
	array1[0]=23;
	array1[1]=32;
	array1[2]=45;
	array1[3]=54;
	int array2[]=new int[4];
	System.out.println("Orginal Array1-"+Arrays.toString(array1));
	for (int i=0,k=array2.length-1;i<array2.length;i++,k--)
	{
		array2[i]=array1[k];
	}
	System.out.println("reversed Array2-"+Arrays.toString(array2));
}
public static void main(String[] args) {
	Assignment77();
	Assignment78();
}
}	
	
	
	
	
