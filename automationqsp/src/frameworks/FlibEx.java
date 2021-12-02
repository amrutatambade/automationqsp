package frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

public class FlibEx {
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet(sheetName);
		 Row row = sh.getRow(rowCount);
		 Cell cell=row.getCell(cellCount);
		 String data=cell.getStringCellValue();
		 return data;
	}
   public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fis=new FileInputStream(excelpath);
	   Workbook wb=WorkbookFactory.create(fis);
	   Sheet sh=wb.getSheet(sheetName);
	   int rb=sh.getLastRowNum();
	   return rb;
		 
	   
   }
   public void writeData(String excelpath,String sheetName,int rowCount,int cellCount,String data ) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fis=new FileInputStream(excelpath);
	   Workbook wb=WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(sheetName);
	   Row row = sh.getRow(rowCount);
	   Cell cell = row.createCell(cellCount);
	   cell.setCellValue(data);
	   
	   FileOutputStream fos=new FileOutputStream(excelpath);
	   wb.write(fos);
	   wb.close();
	   
	   
	   
	   
   }
	

}
