package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import AswagLab.TestClass;

public class ReadExcelData extends TestClass {
	
	
	public static String  ReadExcelSheetData(int rownumber,int colnumber) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\user\\Pictures\\SwagLabTestNG\\ReadTestData");
	    Sheet excelData = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value=excelData.getRow(rownumber).getCell(colnumber).getStringCellValue();
	    return value;
  }
}
