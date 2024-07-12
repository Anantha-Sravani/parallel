package Selenium.Framework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class EnquiryPage {
	public WebDriver driver;
	public EnquiryPage(WebDriver d)
	{
		driver=d;
	}
	public void EnquiryMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/enquiry");
//	
		Actions action = new Actions(driver);
		WebElement about =driver.findElement(By.xpath("//div[text()='CHOOSE ENQUIRE ABOUT']"));
		action.moveToElement(about).click().sendKeys("f77").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
//		
		WebElement help =driver.findElement(By.xpath("//div[text()='SELECT YOUR QUERY']"));
		action.moveToElement(help).click().sendKeys("Others..").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		WebElement Query  =driver.findElement(By.id("enteredQuery"));
		action.moveToElement(Query).doubleClick().sendKeys("nothing is there to type").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	
//		
		WebElement NameTextfield =driver.findElement(By.id("enteredFullName"));
		NameTextfield.sendKeys("Pinky122345");
		NameTextfield.clear();
	    Thread.sleep(2000);
	    NameTextfield.sendKeys("Pinky");
	    Thread.sleep(2000);

		WebElement countryFeild =driver.findElement(By.xpath("//div[text()='COUNTRY']"));
	//countryFeild.click();
//		Thread.sleep(3000);
		action.moveToElement(countryFeild).click().sendKeys("INDIA").build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='INDIA']")).click();
		
	
		 Thread.sleep(2000);
		WebElement stateFeild =driver.findElement(By.xpath("//div[text()='STATE']"));
//		countryFeild.click();
//		Thread.sleep(2000);
		action.moveToElement(stateFeild).click().sendKeys("Andhra Pradesh").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement Pincode=driver.findElement(By.id("enteredPincode"));
//		Thread.sleep(2000);
		Pincode.sendKeys("52310");
		Thread.sleep(2000);
//		Pincode.clear();
//		Pincode.sendKeys("523105");
		//WebElement mobileNumber =driver.findElement(By.xpath("//input[@placeholder='+91 PHONE NUMBER']"));
		WebElement mobileNumber =driver.findElement(By.id("phone-text"));
		mobileNumber.sendKeys("6666666666");
	Thread.sleep(2000);
//		mobileNumber.clear();
//		mobileNumber.sendKeys("765438904");
		WebElement EmailFeild =driver.findElement(By.id("enteredEmailId"));
		EmailFeild.sendKeys("Sravsanantha7@gmail.com");
		Thread.sleep(2000);
//		
		WebElement nextButton =driver.findElement(By.xpath("//div[text()='NEXT']"));
		nextButton.click();
		System.out.println("Thank you message should be display");
		
		
		
		// #dropdown_inputField > div
		
	}

}
