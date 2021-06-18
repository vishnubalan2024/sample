package com.fileops;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	private static final String FILE_LOCATION="D:\\\\test\\\\testing.xlsx";

	public static void main(String[] args) throws IOException {
		
		ReadExcel readExcel=new ReadExcel();
		List<TestBean> lst=readExcel.readExceFile();
		int employeeID;
		String name;
		String status;
		String techStack;
		Date joiningDate;
		for (TestBean testBean : lst) {
            employeeID=testBean.getId();
			name=testBean.getEmployeeName();
			status=testBean.getEmployeeStatus();
			techStack=testBean.getEmployeeTechStack();
			joiningDate=testBean.getEmployeeJoiningDate();
			
			System.out.println(employeeID+","+name+","+status+","+techStack+","+joiningDate);
			
			for (filteredBean testBean2 : testBean.getEmployeeDetails()) {
				System.out.println("filtered list");
			
				
				System.out.println(testBean2.getUserID()+","+testBean2.getUserName());
				
			}
		}
		
		
		
	}
	
	public List<TestBean> readExceFile() throws IOException{
		
	
			FileInputStream fis= new FileInputStream(new File(FILE_LOCATION));
			 
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			Sheet sheet=wb.getSheetAt(0);
			Row row;
			
	    List<TestBean> testBean=new ArrayList<TestBean>();
	    
		for(int i=1;i<sheet.getLastRowNum();i++) {
			TestBean tst=new TestBean();
			row=sheet.getRow(i);
			tst.setId((int)row.getCell(0).getNumericCellValue());
			tst.setEmployeeName(row.getCell(1).getStringCellValue());
			tst.setEmployeeStatus(row.getCell(2).getStringCellValue());
			tst.setEmployeeTechStack(row.getCell(3).getStringCellValue());
			tst.setEmployeeJoiningDate(row.getCell(4).getDateCellValue());
			//DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
			
			testBean.add(tst);
		}
			List<TestBean> lt=new ArrayList<>();
			for (TestBean testBean2 : testBean) {
				if (filterTheContent(lt, testBean2).isEmpty()) {
					List<TestBean> toFilterList=filterTheContent(testBean, testBean2);
					TestBean tb=finalContent(toFilterList);
				lt.add(tb);  
				}
			}
				
	
		return lt;

}
	public List<TestBean> filterTheContent(List<TestBean> lst,TestBean tst){
		
		List<TestBean> filterBean=new ArrayList<TestBean>();
		for (TestBean testBean : filterBean) {
			 
			if (tst.getEmployeeJoiningDate().compareTo(testBean.getEmployeeJoiningDate())==0) {
				filterBean.add(testBean);
			}
		}
		
		
		return filterBean;
		
	}
	public TestBean finalContent(List<TestBean> testB){
		
		TestBean tst1=testB.get(1);
		for (TestBean testBean : testB) {
			testBean.getEmployeeDetails().add(new filteredBean(testBean.getEmployeeName(),testBean.getId()));
			
		}
		
		return tst1;
		
	}
}
