package Selenium.Framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class about_page {
	public WebDriver driver;
	public about_page(WebDriver d)
	{
		driver=d;
	}
	public void aboutPageMethod() throws InterruptedException, IOException
	{
		driver.get("https://www.ultraviolette.com/about");
		Thread.sleep(2000);
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		
		JavascriptExecutor jse1 =(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(500,1000)");
		Thread.sleep(2000);
		
		//////////////////////// rollout calendar ////////////
		
		driver.findElement(By.xpath("//div[text()='Rollout Calendar']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse01 =(JavascriptExecutor)driver;
		jse01.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[1]/img")).click();
		Thread.sleep(2000);
}
}
