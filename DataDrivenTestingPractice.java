package Selenium.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingPractice {
	public static void main(String[] args) throws IOException {
		
		 FileInputStream file = new FileInputStream("C:\\Users\\SRAVANI\\Desktop\\DataDriven.xlsx");
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
	}
	
	
	
	
}
