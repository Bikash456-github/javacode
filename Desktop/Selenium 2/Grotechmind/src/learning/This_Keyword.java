package learning;

public class This_Keyword {
	
	int student_id;
	String name;
	double Salary;
		
	void student_id(int student_id,String name,double Salary)	
	{
		this. student_id =student_id;
		this. name =name;;
		this. Salary =Salary;
	}
	
	
	
public static void main(String[] args) {
	This_Keyword m2=new This_Keyword();
	m2.student_id(65,"bks",7863873);
	System.out.println(m2.Salary);
	System.out.println(m2.name);
	System.out.println(m2.student_id);
	
	
	
}
}
