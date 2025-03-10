package learning;

public class Finalvariable {
int  employeeid;//global employee id 
double  salary;
String name;
void employee_details2(int employeeid,double salary,String name)//this is local employee id
{
	//final int age =90;
System.out.println("Bikash, dhungana");	
}
public static void main(String[] args) {
	Finalvariable m2=new Finalvariable();//creating object as class name
	m2.employee_details2(11,6574,"bikash");//this assign to local to call line 7
	System.out.println(m2.employeeid);//this employee id is from global
	
}
}
