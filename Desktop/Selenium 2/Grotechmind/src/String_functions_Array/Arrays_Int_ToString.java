package String_functions_Array;

public class Arrays_Int_ToString {
public static void main(String[] args) {
	
	int class1[]=new int [5];
	class1[0]=20;
	class1[1]=30;
	class1[2]=40;
	class1[3]=50;
	class1[4]=60;
	for (int i=0;i<5;i++)
	System.out.println(class1[i]);
	//System.out.println(Arrays.toString(class1));
	
	String name[]=new String[5];
	name[0]="bikash";
	name[1]="dhungana";
	name[2]="Sarmila";
	name[3]="bimala";
	name[4]="radhika";
	
	for (int i=0;i<5;i++)
	{
	//System.out.println(name[i]);
	//	System.out.println(class1[i]);
	//	System.out.println(name[i]  +   class1[i]);
	System.out.println("name is ->  "+name[i]+"  and roll no is-> "  +class1[i]);
	}
}
}
