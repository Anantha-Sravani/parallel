package Selenium.Framework;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import javax.swing.text.html.HTMLDocument.Iterator;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Data_Driven {
//
//	public static void main(String[] args) throws IOException {
//		FileInputStream file = new FileInputStream("C:\\Users\\SRAVANI\\Desktop\\DataDriven.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		//Workbook workbook = WorkbookFactory.create(file);
//
//		int sheets = workbook.getNumberOfSheets();
//		for(int i=0;i<sheets;i++)
//		{
//			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
//			{
//		     XSSFSheet sheet =workbook.getSheetAt(i);
//				java.util.Iterator<Row> rows =sheet.iterator();
//			   Row firstrow =rows.next();
//			   java.util.Iterator<Cell> cell = firstrow.cellIterator();
//			   int k=0;
//			   int column = 0;
//			   while(cell.hasNext())
//			   {
//				  Cell value = cell.next();
//				  if (value.getStringCellValue().equalsIgnoreCase("Data2"));
//				  {
//					column=k;  
//				  }
//				  k++;
//			   }
//			   System.out.println(column);	
//			   
//			   while(rows.hasNext())
//			   {
//				  Row r = rows.next();
//				  if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"));
//				  {
//					  java.util.Iterator<Cell> cv = r.cellIterator();
//					  while(cv.hasNext())
//					  {
//						  System.out.println(cv.next().getStringCellValue());
//					  }
//				  }
//				 
//			   }
//			}
//		}
//		
//	}	
//	
//}
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Data_Driven {

	 
//	    public List<String[]> readExcel(String filePath) throws IOException {
//	        List<String[]> data = new ArrayList<>();
//	        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\SRAVANI\\Desktop\\DataDriven.xlsx");
//	        Workbook workbook = new XSSFWorkbook(fileInputStream);
//	        Sheet sheet = workbook.getSheetAt(0);
//	        for (Row row : sheet) {
//	            String[] rowData = new String[row.getPhysicalNumberOfCells()];
//	            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//	                Cell cell = row.getCell(i);
//	                rowData[i] = cell.getStringCellValue();
//	            }
//	            data.add(rowData);
//	        }
//	        workbook.close();
//	        fileInputStream.close();
//	        return data;
//	    }
//	}

   public static void main(String[] args) throws IOException, InterruptedException {
	   
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   String sheetName = "testdata";
	   FileInputStream file = new FileInputStream("C:\\Users\\SRAVANI\\Desktop\\DataDriven.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet sheet =workbook.getSheetAt(0);
	   
	  for (int i = 1; i <= sheet.getLastRowNum(); i++)
	  {
		 XSSFCell cell = sheet.getRow(i).getCell(0);
		 
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
		 cell= sheet.getRow(i).getCell(1);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		
		if(isAlertPresent()==true)
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Application not opened successfully");
			driver.switchTo().defaultContent();
		}
	  }
	  
	  driver.close();
	  workbook.close();
	  file.close();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//        String sheetName = "testdata"; 
//        FileInputStream file = new FileInputStream("C:\\Users\\SRAVANI\\Desktop\\DataDriven.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet = workbook.getSheet(sheetName);
//	        int rowcount = sheet.getLastRowNum();
//	        System.out.println("Total count is : "+ rowcount);
//	       
//	       String data = sheet.getRow(0).getCell(1).getStringCellValue();
//	       System.out.println(data);
//       
//       for (int i = 0; i <= rowcount; i++)
//       {
//    	 Row row = sheet.getRow(i);
//    	 for (int j = 0; j <row.getLastCellNum(); j++) {
//    		String  data1 = sheet.getRow(i).getCell(j).getStringCellValue();
//    		System.out.print(data1 + " ");
//    	 }
//    	 System.out.println();
//       }
//        
//        int colcount = sheet.getRow(0).getLastCellNum();
//
//        for (int i = 0; i <= rowcount; i++) { // Note: changed < to <= to include the last row
//            XSSFRow currentrow = (XSSFRow) sheet.getRow(i);
//
//            for (int j = 0; j < colcount; j++) {
//                if (currentrow != null) {
//                    Cell cell = currentrow.getCell(j);
//                    if (cell != null) {
//                        System.out.print(cell.toString() + " ");
//                    }
//                }
//            }
//            System.out.println(); // Print a new line after each row
//        }
   }

   public static boolean isAlertPresent() {
       try {
           WebDriver driver = null;
		Alert alert = driver.switchTo().alert();
           return true;
       } catch (NoAlertPresentException e) {
           return false;
       }
   }
}

























