package SDET2.SDETPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static  String getcelldata () throws IOException  {
		
		
		FileInputStream fis = new FileInputStream("G:\\excelfile\\"+"file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet =workbook.getSheet("Sheet0");
		
	
		
		
		XSSFCell cell = sheet.getRow(1).getCell(3);
		int celldata = (int) cell.getNumericCellValue();
		String cellsdata =String.valueOf(celldata);
		return cellsdata;
	}
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		System.out.println(ExcelRead.getcelldata());;
}}
