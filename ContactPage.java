package Selenium.Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ContactPage {
	public WebDriver driver;
	public ContactPage(WebDriver d)
	{
		driver=d;
	}
	public void ContactMethod() throws InterruptedException
	{
	
		driver.get("https://www.ultraviolette.com/contact");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		//driver.close();
		driver.get("https://www.ultraviolette.com/contact");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='careers@ultraviolette.com']")).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		//driver.close();
		
		
		WebElement hanger =driver.findElement(By.xpath("//img[@alt='Ultraviolette Hangar']"));
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
//	      Thread.sleep(3000);
	      hanger.click();
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
		
		Thread.sleep(5000);
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
