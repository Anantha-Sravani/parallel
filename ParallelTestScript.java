package Selenium.Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestScript {
	
	WebDriver driver =null;
	
	@Test
		public void chrome() throws InterruptedException
		{
			System.out.println("chrome Execution"+Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.ultraviolette.com/press");
			WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
			subscribeOption.click();
			WebElement EmailTextField =driver.findElement(By.id("enteredEmailId"));
			EmailTextField.sendKeys("Sravsantha7");
			EmailTextField.clear();
			Thread.sleep(5000);
			EmailTextField.sendKeys("sravsanantha@gmail.com");
			
			Thread.sleep(2000);
			WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
			subscribe.click();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(800,0)");
			Thread.sleep(2000);
			WebElement veiw =driver.findElement(By.xpath("//button[@class='Button_button__Stqur pt-2 pb-[7px] pl-8 pr-8 ']"));
			veiw.click();
			Thread.sleep(2000);
			
			WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
			String parentWindow = driver.getWindowHandle();
			System.out.println("parent window id is :" + parentWindow);
//		      Thread.sleep(3000);
			subscribeTo.click();
//		  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//			jse.executeAsyncScript("window.scrollTo(2000,4000)");
//			jse.executeAsyncScript("window.scrollTo(4000,8000)");
//		jse.executeAsyncScript("window.scrollTo(8000,0)");
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
			
			
		
		
			Thread.sleep(4000);
		}
	   @Test
		public void edge() throws InterruptedException
		{
			System.out.println("edge Execution"+Thread.currentThread().getId());
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.ultraviolette.com/press");
			WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
			subscribeOption.click();
			WebElement EmailTextField =driver.findElement(By.id("enteredEmailId"));
			EmailTextField.sendKeys("Sravsantha7");
			EmailTextField.clear();
			Thread.sleep(5000);
			EmailTextField.sendKeys("sravsanantha@gmail.com");
			
			Thread.sleep(2000);
			WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
			subscribe.click();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(800,0)");
			Thread.sleep(2000);
			WebElement veiw =driver.findElement(By.xpath("//button[@class='Button_button__Stqur pt-2 pb-[7px] pl-8 pr-8 ']"));
			veiw.click();
			Thread.sleep(2000);
			
			WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
			String parentWindow = driver.getWindowHandle();
			System.out.println("parent window id is :" + parentWindow);
//		      Thread.sleep(3000);
			subscribeTo.click();
//		  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//			jse.executeAsyncScript("window.scrollTo(2000,4000)");
//			jse.executeAsyncScript("window.scrollTo(4000,8000)");
//		jse.executeAsyncScript("window.scrollTo(8000,0)");
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
			
			
		
		
			Thread.sleep(4000);
		}
				
				 @Test
					public void firefox() throws InterruptedException
					{
					 System.out.println("firefox Execution"+Thread.currentThread().getId());
						WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
						driver.get("https://www.ultraviolette.com/press");
						WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
						subscribeOption.click();
						WebElement EmailTextField =driver.findElement(By.id("enteredEmailId"));
						EmailTextField.sendKeys("Sravsantha7");
						EmailTextField.clear();
						Thread.sleep(5000);
						EmailTextField.sendKeys("sravsanantha@gmail.com");
						
						Thread.sleep(2000);
						WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
						subscribe.click();
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollTo(800,0)");
						Thread.sleep(2000);
						WebElement veiw =driver.findElement(By.xpath("//button[@class='Button_button__Stqur pt-2 pb-[7px] pl-8 pr-8 ']"));
						veiw.click();
						Thread.sleep(2000);
						
						WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
						String parentWindow = driver.getWindowHandle();
						System.out.println("parent window id is :" + parentWindow);
//					      Thread.sleep(3000);
						subscribeTo.click();
//					  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//						jse.executeAsyncScript("window.scrollTo(2000,4000)");
//						jse.executeAsyncScript("window.scrollTo(4000,8000)");
//					jse.executeAsyncScript("window.scrollTo(8000,0)");
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
						
						
					
					
						Thread.sleep(4000);
		}


}
