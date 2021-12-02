package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FlibPom {
//read the data from property file
	public String readProperty(String propertyPath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	//read the data from excel sheet
	public String readExcelData(String excelPath,String sheetname,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String value = cell.getStringCellValue(); 
		return value;
	}
	//write the data to excel sheet
	public void writeExcelData(String excelPath,String sheetname,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowCount);
		
		Cell cell=row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
	 public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	   {
		   FileInputStream fis=new FileInputStream(excelpath);
		   Workbook wb=WorkbookFactory.create(fis);
		   Sheet sh=wb.getSheet(sheetName);
		   int rc=sh.getLastRowNum();
		   return rc;
}
}
