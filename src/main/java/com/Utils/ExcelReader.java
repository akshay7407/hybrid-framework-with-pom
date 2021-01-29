
package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public XSSFWorkbook wb;
	public XSSFSheet sheets;
	
	public ExcelReader(String ExcelSheet) {
		
		try {
			
		File f= new File(ExcelSheet);
		
			FileInputStream fis= new FileInputStream(f);
			// it will load all sheets in ur scrits. or it will load all workbook...........
			wb= new XSSFWorkbook(fis);
			//.xlsx file ---------------- XSSFWorkBook
		
			///.xls------------ HSSFWoorbook...........
			
		} 
	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	
		catch (IOException e)
		{
			e.printStackTrace();
		}
		}

	
	public String getData(int sheetNumber,int row, int cell ) {
		
		XSSFSheet sheets=wb.getSheetAt(0);
		String data=sheets.getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	
	public int getRowCount(int sheetIndex) {
		
		int rows=wb.getSheetAt(sheetIndex).getLastRowNum();
		rows= rows+1;
		return rows;
	}
}
