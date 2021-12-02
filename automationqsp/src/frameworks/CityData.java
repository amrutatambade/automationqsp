package frameworks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CityData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("city");
		int rb = sheet.getLastRowNum();
		for(int i=0;i<rb;i++)
		{
			Row row=sheet.getRow(i);
			Cell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		
	}
}
