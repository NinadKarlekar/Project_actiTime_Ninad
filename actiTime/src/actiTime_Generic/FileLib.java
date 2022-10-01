package actiTime_Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		}
	
	
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		String path = "./data/Book1.xlsx";
		//Create an object of FileInputStream class to read excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	
	}
	
}
