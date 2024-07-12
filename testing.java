package Selenium.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testing {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ultraviolette.com/");
		driver.manage().window().maximize();
		String titleName =driver.getTitle();
		System.out.println("My title name is : "+titleName);
	}

}
