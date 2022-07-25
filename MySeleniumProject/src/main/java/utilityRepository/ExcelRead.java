package utilityRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	//FileInputStream 
		//XSSFWorkbook
		//XSSFSheet
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public ExcelRead() throws Exception
	{
		f = new FileInputStream("C:\\Manu\\CODING\\JAVA PRGRM\\MySeleniumProject\\src\\main\\resources\\excelFiles\\ExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("sheet1");	
	}
	
	public static String readingStringData(int i,int j) 
	{
		
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static String readingIntegerData(int i,int j) 
	{
		
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);
	}

}
