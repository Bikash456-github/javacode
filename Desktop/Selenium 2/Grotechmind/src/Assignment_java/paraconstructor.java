package Assignment_java;

public class paraconstructor {
	String studentName;
	int studentAge;
	//constructor
	paraconstructor(String name,int age){
studentName=name;
studentAge=age;
	}
	void display() {
		System.out.println(studentName+   " "+studentAge);
	}
	public static void main(String[] args) {
		{
			paraconstructor myObj=new paraconstructor("manan"  ,19);
		    myObj.display();
		
		}	
		
	}

	
	
}
