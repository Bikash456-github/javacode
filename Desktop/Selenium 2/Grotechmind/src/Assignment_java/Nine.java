package Assignment_java;//Multiple level inheritance
class Nine {	
void college(){
	System.out.println("going to college next week");}
}class ten extends Nine{
	void school (){
		System.out.println("going to school");}	
}class Eleven extends ten{
		void hospital() {
			System.out.println("going to hospital");}
	
} class  Fourteen extends Eleven{
		void play(){
			System.out.println("non static method");
			}
	public static void main(String[] args){
	
	System.out.println("main method");	
	Fourteen t1=new Fourteen();
	t1.play();
	t1.college();
	
	Eleven e1=new Eleven();
	e1.hospital();
	e1.school();
	e1.college();}}
	
	
	
	
	
	

