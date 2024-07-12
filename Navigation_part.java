package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Navigation_part {
	public WebDriver driver;
	  public Navigation_part(WebDriver d)
		{
			driver=d;
		}
	@Test
	public void navigation() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get("https://www.ultraviolette.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[3]/div/div[2]/div/div/p/a")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[@alt='close']")).click();
		Thread.sleep(3000);
		
		//Nav-bar section //
		
		driver.findElement(By.xpath("//div[text()='F77']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[text()='SMART TECH']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div[2]/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[1]/img")).click();

	}


}
