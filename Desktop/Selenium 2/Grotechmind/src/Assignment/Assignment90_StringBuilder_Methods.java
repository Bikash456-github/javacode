package Assignment;

public class Assignment90_StringBuilder_Methods {

	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	StringBuilder sb1=new StringBuilder("BIKASH");
	StringBuilder sb2=new StringBuilder(10);

	System.out.println("StringBuilder without parameter-"+sb);
	System.out.println("StringBuidler with parameter-"+sb1);
	System.out.println("StringBuilder with parameter-"+sb);
	sb.append("Sarmila");
	System.out.println("After Append- +sb1");
	System.out.println("After Insert- "+sb1.insert(0,"Mr."));
	System.out.println("After Delete- "+sb.delete(0, 05));
	System.out.println("After replace- "+sb1.replace(0, 3, "AASTHA"));
	System.out.println("After Substring- "+sb1.substring(0,7));
	System.out.println("After Substring- "+sb1.substring(7));
	System.out.println("CharAt 8th index= "+sb1.charAt(8));
	System.out.println("After Reverse - "+sb1.reverse());
	
	
	
	
	
	
	}

}
