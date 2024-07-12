package Selenium.Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Location_Page {
	
	public WebDriver driver;
	public Location_Page(WebDriver d)
	{
		driver=d;
	}
	public void LimitedMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/location");
		
//		
		
		WebElement get =driver.findElement(By.xpath("//h1[text()='GET DIRECTIONS']"));
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
	      get.click();
	       Thread.sleep(3000);
	       Set<String> childWindows =driver.getWindowHandles();
	       for (String childWindow : childWindows) 
	       {
			System.out.println(childWindow);
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(parentWindow);
			}
		   }
		
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//h1[text()='BOOK TEST RIDE']")).click();
	       Thread.sleep(3000);
	       driver.navigate().back();
		
	       Thread.sleep(3000);
	       
	       JavascriptExecutor jse1 =(JavascriptExecutor)driver;
			jse1.executeScript("window.scrollTo(0,500)");
			Thread.sleep(2000);
			
			JavascriptExecutor jse2 =(JavascriptExecutor)driver;
			jse2.executeScript("window.scrollTo(500,1000)");
			Thread.sleep(2000);
			
			JavascriptExecutor jse3 =(JavascriptExecutor)driver;
			jse3.executeScript("window.scrollTo(1000,1500)");
			Thread.sleep(2000);
			
			JavascriptExecutor jse4 =(JavascriptExecutor)driver;
			jse4.executeScript("window.scrollTo(1500,2000)");
			Thread.sleep(2000);
			
			JavascriptExecutor jse5 =(JavascriptExecutor)driver;
			jse5.executeScript("window.scrollTo(2000,2500)");
			Thread.sleep(2000);
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(2500,0)");
			Thread.sleep(2000);
	       
		
}
}
