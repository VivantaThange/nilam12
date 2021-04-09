package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetHandle2 {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Velocity\\Excel sheet\\testing data.xlsx";
		FileInputStream file=new FileInputStream(path);
		CellType w = WorkbookFactory.create(file).getSheet("Bank").getRow(0).getCell(0).getCellType();
		System.out.println(w);
		
		//last values from row
	    int t = WorkbookFactory.create(file).getSheet("Bank").getLastRowNum();
	    System.out.println(t);
	    
	  // Object s = WorkbookFactory.create(file).getSheet("Bank").getLastColNum();
		
		
	}

}
