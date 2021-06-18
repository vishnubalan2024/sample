package com.fileops;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	
	private static String FILE_NAME="D:\\test\\FirstFile.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stubFWork
		
		XSSFWorkbook workBook=new XSSFWorkbook();
		XSSFSheet workSheet=workBook.createSheet("My First Excel Project");
		
		Object[][] obj= {{"Employee ID","Emoployee Name"},{699364,"vishnu"},{789089,"shanmu"},{678906,"vasanth"},{345678,"Shiva"}};
    
		
		int rowNumber=0;
		System.out.println("Creating Excel");
	    
		for(Object[] emp:obj)
		{
			Row row=workSheet.createRow(rowNumber++);
			System.out.println(rowNumber);
			int columnNumber=0;
			for(Object empValue:emp) {
				Cell cell=row.createCell(columnNumber++);
				System.out.println(columnNumber);
				if(empValue instanceof String) {
					cell.setCellValue((String) empValue);
				}
				if(empValue instanceof Integer) {
					cell.setCellValue((int)empValue);
				}
			}
		}
	try {
		FileOutputStream outStream=new FileOutputStream(FILE_NAME);
		workBook.write(outStream);
		
		
	}
	catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("Done");

}
}
