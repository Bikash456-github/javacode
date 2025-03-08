package excellsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Feththevale_excelsheet {
public static void main(String[] args) throws FileNotFoundException 
{
	//login
//	FileInputStream f1 = new FileInputStream("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject/Excell.xlsx"); 
Workbook w1= WorkbookFactory.create(f1);

String username=   w1.getSheet("login").getRow(1).getcell(0).getStrungcellvalue();
String password=w1.getSheet("login").getRow(1).getcell(0).getStrungcellvalue();
System.out.println(username);
System.out.println(password);
			
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
