package UtilityRepositorysample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadGroceryRegister 
{
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public ExcelReadGroceryRegister() throws Exception
	{
		f = new FileInputStream("C:\\Manu\\CODING\\JAVA PRGRM\\Selenium_sections\\src\\main\\resources\\ExcelReadGroceryRegister.xlsx");	
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
