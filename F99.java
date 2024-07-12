package Selenium.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F99 {
public WebDriver driver;
public F99(WebDriver d)
{
	driver=d;
}
	public void F99Method() throws InterruptedException
	{
		
		driver.get("https://www.ultraviolette.com/f99");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		
		JavascriptExecutor jse01 = (JavascriptExecutor)driver;
		jse01.executeScript("window.scrollTo(1000,2500)");
		Thread.sleep(2000);
		
		JavascriptExecutor jse02 = (JavascriptExecutor)driver;
		jse02.executeScript("window.scrollTo(2500,3500)");
		Thread.sleep(2000);
		
		JavascriptExecutor jse03 = (JavascriptExecutor)driver;
		jse03.executeScript("window.scrollTo(3500,4500)");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse04 = (JavascriptExecutor)driver;
		jse04.executeScript("window.scrollTo(4500,5500)");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse05 = (JavascriptExecutor)driver;
		jse05.executeScript("window.scrollTo(5500,6500)");
		Thread.sleep(2000);
		
		WebElement element =driver.findElement(By.xpath("//div[text()='I am Interested']"));
		element.click();
		Thread.sleep(4000);
//		WebElement NameTextfield =driver.findElement(By.xpath("//input[@placeholder='FULL NAME']"));
		Actions action = new Actions(driver);
//		NameTextfield.sendKeys("Pinky122345");
		WebElement name = driver.findElement(By.id("enteredFullName"));
		action.moveToElement(name).click().sendKeys("sravani").perform();
		Thread.sleep(2000);
		//country.click();
		//country.sendKeys("India");
		
		WebElement country = driver.findElement(By.xpath("//div[text()='COUNTRY']"));
		action.moveToElement(country).click().sendKeys("AFGHANISTAN").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement StateOption =driver.findElement(By.xpath("//div[text()='STATE']"));
		action.moveToElement(StateOption).click().sendKeys("Ghazni").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement pincode =driver.findElement(By.id("enteredPincode"));
		pincode.sendKeys("123456");
		Thread.sleep(2000);
		
		WebElement phone =driver.findElement(By.id("phone-text"));
		phone.sendKeys("7123456789");
		Thread.sleep(2000);
		
		 WebElement email = driver.findElement(By.id("enteredEmailId"));
		 email.sendKeys("ssdsf123@gmail.com");
		 Thread.sleep(2000);
		 
		 WebElement nextButton =driver.findElement(By.xpath("//div[text()='NEXT']"));
		 nextButton.click();
	
		

	}

}


