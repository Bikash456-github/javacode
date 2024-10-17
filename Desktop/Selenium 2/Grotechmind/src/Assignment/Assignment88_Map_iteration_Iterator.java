package Assignment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Assignment88_Map_iteration_Iterator {

	public static void main(String[] args) {
	Map<Integer,String>m1=new HashMap<Integer,String>();	
  m1.put(234,"Bikash");
  m1.put(345, "Dhungana");
  m1.put(432, "Subedi");
  m1.put(875, "Sarmila");
System.out.println(m1);
//{432=Subedi, 345=Dhungana, 234=Bikash, 875=Sarmila}
Set<Entry<Integer,String>>i_s1=m1.entrySet();

Iterator<Entry<Integer, String>> i_s1 = s1.iterator();
while(i_s1.hasNext())
{
	System.out.println(i_s1.next());
}
	}

}
