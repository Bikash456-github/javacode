package project1s;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT  {

	
	
    public static String un,pass;
	public  void UserName() throws EncryptedDocumentException,IOException{
		//Step 1:let java know where exactually is sheet present
		FileInputStream f1 = new FileInputStream("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject/ExcelBikash .xlsx");
		Workbook w1 = WorkbookFactory.create(f1);//open the excell sheet
	  un= w1.getSheet("Bikash").getRow(1).getCell(0).getStringCellValue();//go to sheet
	  pass= w1.getSheet("Bikash").getRow(1).getCell(1).getStringCellValue();
	
	}
}
	

