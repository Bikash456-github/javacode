package Assignment_java;

public class Student 
{
	static int stu_id;
	static String name;
	static double gpa;
	Student (int stu_id,String name,double gpa)
	{
		this.stu_id=stu_id;
		this.name=name;
		this.gpa=gpa;
	}
	void printdetails()
	{
		System.out.println("before initilazaiton default global value");
		System.out.println(stu_id);
		System.out.println(name);
		System.out.println(gpa);
		
	}
	public static void main(String[] args) {
		System.out.println("before initilazaiton default global value");
		System.out.println(stu_id);
		System.out.println(name);
		System.out.println(gpa);
		Student m2=new Student(5678,"lmn",9.89);
		m2.printdetails();
	}
	
	
	
}