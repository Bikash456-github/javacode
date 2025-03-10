package String_functions_Array;

import java.util.Arrays;

public class Arrays_classcopyto {
//key always in left side and value is right side
	public static void main(String[] args) {

		int rollno1[]=new int[4];
		rollno1[0]=20;
		rollno1[1]=30;
		rollno1[2]=40;
		rollno1[3]=50;
int classnumber2[]=new int[4];
for (int i=0;i<4;i++)
{
	
	classnumber2[i]=     rollno1[i];
	}
System.out.println(Arrays.toString(rollno1));
System.out.println(Arrays.toString(classnumber2));
}
}