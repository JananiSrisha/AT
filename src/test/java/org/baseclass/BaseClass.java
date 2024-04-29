package org.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al ;
	public static Navigation n;
	public static JavascriptExecutor js;
	public static Select s;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void sendKeys(WebElement we,String passValue) {
		we.sendKeys(passValue);
	}
	
	public static void click(WebElement we) {
		we.click();
	}
	
	public static void getTextfromWebelement(WebElement we) {
		System.out.println(we.getText());
	}
	
	public static void getAttribute(WebElement we,String attributeName) {
		System.out.println(we.getAttribute(attributeName));
	}
	
    public static void moveToElement(WebElement we) {
    	 a = new Actions(driver);
    	 a.moveToElement(we).perform();
    }
    
    public static void dragAnddrop(WebElement we1,WebElement we2) {
    	a.dragAndDrop(we1, we2).perform();
    }
    
    public static void doubleClick(WebElement we) {
    	a.doubleClick(we).perform();
    }
	
    public static void contextClick(WebElement we) {
    	a.contextClick(we).perform();
    }
	
    public static void keyDown(WebElement we) {
    	a.keyDown(we, Keys.SHIFT).perform();
    }
    
    public static void sendkeys_a(WebElement we,String s) {
    	a.sendKeys(we, s).perform();
    }
    
    public static void keyUp(WebElement we) {
    	a.keyUp(we,Keys.SHIFT).perform();
    }
    
    public static void keyPress() {
    	r.keyPress(KeyEvent.VK_DOWN);
    }
    
    public static void keyRelease() {
    	r.keyRelease(KeyEvent.VK_DOWN);
    }
	
	public static void switchIntoAlert(){
		al = driver.switchTo().alert();
	}
	
	public static void accept() {
		al.accept();
	}
	
	public static void dismiss() {
		al.dismiss();
	}
	
	public static void sendKeysAlert(String input) {
		al.sendKeys(input);
	}
	
	public static void getTextfromAlert() {
		System.out.println(al.getText());
	}
	
	public static void isEnabled(WebElement we) {
		System.out.println(we.isEnabled());
	}
	
	public static void isDisplayed(WebElement we) {
		System.out.println(we.isDisplayed());
	}
	
	public static void isSelected(WebElement we) {
		System.out.println(we.isSelected());
	}
	
	public static void navigate() {
		n = driver.navigate();
	}
	
	public static void to(String url) {
		driver.navigate().to(url);
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void jssendKeys(WebElement we, String value ) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',"+value+")", we);
	}
	
	public static void jsgetAttribute(WebElement we, String attributeName ) {
		Object y = js.executeScript("arguments[0].getAttribute("+attributeName+")", we);
		System.out.println(y);
	}
	
	public static void jsclick(WebElement we) {
		js.executeScript("arguments[0].click()", we);
	}
	
	public static void scrollUp(WebElement we) {
		js.executeScript("arguments[0].scrollIntoView(false)", we);
	}
	
	public static void scrollDown(WebElement we) {
		js.executeScript("arguments[0].scrollIntoView(true)", we);
	}
	
	public static void changeStyle(WebElement we,String value) {
		js.executeScript("arguments[0].setAttribute('style',"+value+")", we);
	}
	
	public static void takeScreenshot() throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\screenshot\\ss.png");
	    FileUtils.copyFile(s, f);
	}
	
	public static void frameid(int id) {
		driver.switchTo().frame(id);
	}
	
	public static void frameName(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void frameWebElement(WebElement we) {
		driver.switchTo().frame(we);
	}
	
	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	
	
	public static void selectByValue(WebElement we,String value) {
		s = new Select(we);
		s.selectByValue(value);
	}
	
	public static void selectByVisibleText(String value) {
		s.selectByVisibleText(value);
	}
	
	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	public static void isMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}	
	
    public static List<WebElement> getOptions() {
    	List<WebElement> options = s.getOptions();
    	return options;
    }
	
	
	public static List<WebElement> getAllSelectedOptions() {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	
	public static void getFirstSelectedOption() {
		System.out.println(s.getFirstSelectedOption());
	}
	
	public static void deselectByIndex(int index) {
		s.deselectByIndex(index);
	}
	
	public static void deselectByValue(String value) {
		s.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(String value) {
		s.deselectByVisibleText(value);
	}
	
	public static void deselectAll() {
		s.deselectAll();
	}
	
	public static String readExcel(String sheetName,int rowNum,int cellNum) throws Exception {
    File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
			Row row = sheet.getRow(rowNum);
			
			Cell cell = row.getCell(cellNum);
			
			int cellType = cell.getCellType();
			
			String value ;
			
			if(cellType == 1) {
				value = cell.getStringCellValue();
				
			}else if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
				value = sdf.format(dateCellValue);
				
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long a = (long)numericCellValue;
				value = String.valueOf(a);
				
			}
			return value;
		}
	
	public static void writeExcel(String sheetName,int rowNum,int cellNum,String cellValue) throws Exception {
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");

		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet(sheetName);
		
		Row createRow = sheet.createRow(rowNum);
		
		Cell createCell = createRow.createCell(cellNum);
		
		createCell.setCellValue(cellValue);
		
		FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("done");
	}
	
	public static void createCellOnly(String sheetName,int rowNum, int cellNum, String cellValue) throws Exception {
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		Cell createCell = row.createCell(cellNum);
		
		createCell.setCellValue(cellValue);
		
        FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("done");
		
		
		
	}
	
	public static void createRowOnly(String sheetName,int rowNum, int cellNum, String cellValue) throws Exception {
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.createRow(rowNum);
		
		Cell createCell = row.createCell(cellNum);
		
		createCell.setCellValue(cellValue);
		
        FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("done");
		
	}
	
	
	public static void createSheetOnly(String sheetName,int rowNum, int cellNum, String cellValue) throws Exception {
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.createSheet(sheetName);
		
		Row row = sheet.createRow(rowNum);
		
		Cell createCell = row.createCell(cellNum);
		
		createCell.setCellValue(cellValue);
		
        FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("done");
		
		}
	
	public static void updateCell(String sheetName,int rowNum,int cellNum,String existingData,String newData) throws Exception{
		File f = new File("C:\\Users\\janan\\Documents\\SST\\Selenium\\selenium_workspace\\MavenProject\\excel\\write.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		Cell cell = row.getCell(cellNum);
		
		String stringCellValue = cell.getStringCellValue();
		
		if(stringCellValue.equals(existingData)) {
			cell.setCellValue(newData);
		}
        
		FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("done");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
