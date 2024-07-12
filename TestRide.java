package Selenium.Framework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRide {
	public WebDriver driver;
	public TestRide(WebDriver d)
	{
		driver=d;
	}
	
	public void TestRideMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/testride");
		Thread.sleep(2000);
		
		WebElement firstnameTextField =driver.findElement(By.id("enteredFirstName"));
		Thread.sleep(2000);
		firstnameTextField.sendKeys("sdsdfr");
		Thread.sleep(2000);
		
		WebElement LastNameTextField =driver.findElement(By.id("enteredLastName"));
		LastNameTextField.sendKeys("sdfsdcfs");
		Thread.sleep(2000);
		
		WebElement MobileTextFeild =driver.findElement(By.xpath("//input[@id='phone-text']"));
		MobileTextFeild.sendKeys("9999999999");
		Thread.sleep(2000);
		
		 WebElement EmailTextFeild =driver.findElement(By.id("enteredEmailId"));
		 EmailTextFeild.sendKeys("wssdfdggbgbf@gmail.com");
		 Thread.sleep(4000);
//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
//		WebElement selectAll = driver.findElement(By.xpath("//div[@class='px-7 md:px-20 pb-20']"));
//		selectAll.click();
//		jse.executeScript("window.scrollTo(0,2000)");
		 Thread.sleep(7000);
		 Actions act = new Actions(driver);
		WebElement city=driver.findElement(By.xpath("//div[@class='h-14 sm:h-16 dropdown_Selector css-c8n4pz-control']"));
		city.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='BENGALURU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='Button_button__Stqur paymentBtn ']")).click();
		Thread.sleep(2000);
	}
}
