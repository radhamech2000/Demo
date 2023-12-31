package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AgeStatusUpdateByColName {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellIndex = -1;
		for(int i=0; i<row.getLastCellNum();i++) {
			
			if(row.getCell(i).getStringCellValue().trim().equals("Status")) {
				cellIndex = i;
			}
		}
		
		row = sheet.getRow(2);
		cell = row.getCell(cellIndex);
		
		cell.setCellValue("Major");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\data.xlsx");
		wb.write(fos);
		
		wb.close();
		fis.close();
		

	}

}
