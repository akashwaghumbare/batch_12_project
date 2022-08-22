package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception { //Constructor
		String path="C:\\Users\\Admin\\eclipse-workspace\\Akash_Project_FrameWork\\TestData\\TestData.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis1);
			
	}
	
	public String getStringData(String SheetName,int row,int cell  ) {
		
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
	
}
