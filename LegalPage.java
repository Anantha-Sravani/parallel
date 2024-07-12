package Selenium.Framework;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LegalPage {
	public WebDriver driver;
	public LegalPage(WebDriver d)
	{
		driver=d;
	}
	public void LegalMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/legal");
		WebElement LegalFeature =driver.findElement(By.xpath("//a[text()='Legal']"));
		LegalFeature.click();
		
		WebElement PolicyOption =driver.findElement(By.xpath("//div[text()='PRIVACY POLICY']"));
		PolicyOption.click();
//		  Thread.sleep(3000);
	JavascriptExecutor jse =(JavascriptExecutor)driver;
//	jse.executeAsyncScript("window.scrollTo(0,5000)");
//	Thread.sleep(2000);
//	jse.executeAsyncScript("window.scrollTo(5000,0)");
	//Thread.sleep(3000);
//	jse.executeAsyncScript("window.scrollTo(10000,5000)");
//	//Thread.sleep(2000);
//	jse.executeAsyncScript("window.scrollTo(5000,0)");
//	jse.executeAsyncScript("window.scrollTo6000,0)");
	Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		WebElement TermsOption =driver.findElement(By.xpath("//div[text()='TERMS OF USE']"));
		//TermsOption.click();
//	    Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
//	      Thread.sleep(3000);
	      TermsOption.click();
//	  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//		jse.executeAsyncScript("window.scrollTo(2000,4000)");
//		jse.executeAsyncScript("window.scrollTo(4000,8000)");
//	jse.executeAsyncScript("window.scrollTo(8000,0)");
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
		
		
		
//	
		Thread.sleep(2000);
//		
		WebElement SaleTermOption =driver.findElement(By.xpath("//div[text()='SALE TERMS AND CONDITIONS']"));
//	Thread.sleep(4000);
			String parentWindows = driver.getWindowHandle();
		      System.out.println("parent window id is :" + parentWindows);
	      SaleTermOption.click();
	      Thread.sleep(2000);
		      //driver.close();
		       Set<String> childWindowss =driver.getWindowHandles();
		       for (String childWindow1 : childWindowss) 
		       {
				System.out.println(childWindow1);
				if(!childWindow1.equals(parentWindows))
				{
					driver.switchTo().window(parentWindows);
				}
			   }
//		
//		
		Thread.sleep(2000);
		
		WebElement BookingOption =driver.findElement(By.xpath("//div[text()='BOOKING AGREEMENT']"));
//		Thread.sleep(4000);
		String parentWindow1 = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow1);
	      BookingOption.click();
//	  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//		jse.executeAsyncScript("window.scrollTo(2000,4000)");
//		jse.executeAsyncScript("window.scrollTo(4000,8000)");
////		jse.executeAsyncScript("window.scrollTo(8000,0)");
	       Thread.sleep(3000);
	       Set<String> childWindows2 =driver.getWindowHandles();
	       for (String childWindow01 : childWindows2) 
	       {
			System.out.println(childWindow01);
			if(!childWindow01.equals(parentWindow1))
			{
				driver.switchTo().window(parentWindow1);
			}
		   }
//		


	}

}
