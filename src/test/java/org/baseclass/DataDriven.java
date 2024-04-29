package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

//	public static void main(String[] args) throws Exception  {
//		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");
//
//		Workbook wb = new XSSFWorkbook();
//		
//		Sheet sheet = wb.createSheet("DataSheet");
//		
//		Row createRow = sheet.createRow(1);
//		
//		Cell createCell = createRow.createCell(2);
//		
//		createCell.setCellValue("janani");
//		
//		FileOutputStream fos =new FileOutputStream(f);
//		
//		wb.write(fos);
//		
//		System.out.println("done");
//		
//	}
}
