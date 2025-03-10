package collections_interface;

class collection2
{
	 void add()
	{
	System.out.println("bikash dhungana 1");
	
	}
	void add1()
	{
		this.add();
		System.out.println("bikash dhungana 2");
	}
	void add2()
	{
		this.add1();
		System.out.println("bikash dhungana 3");
	}	
}
public class Collection_Functions1 extends collection2{
public static void main(String[] args) {
	collection2 m1=new 	 Collection_Functions1 ();
	m1.add2();
/*	
	
A collection is a intrface 	drawbacks of arrays cant change the size at run time
it can only store homegenious value colleaction can  change the size of
An array at run time store hetrogionus value Store hetroginous value framework
java.util.collectrions;java.util.map;create the data fetch the data delete the data
all the  data cannot store in byte shots long int boolean 
list interface set  interface and map interface	 dublicate
list interface=indexending 
set interface=auto suggestion unique ness set no dublicate
map interface=to accept the value in the form of key and value  



	*/
}
}
