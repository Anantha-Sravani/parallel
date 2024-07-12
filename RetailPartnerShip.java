package Selenium.Framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import net.bytebuddy.asm.Advice.Enter;

public class RetailPartnerShip {
	public WebDriver driver;
	public RetailPartnerShip(WebDriver d)
	{
		driver=d;
	}
	public void RetailPageMethod() throws InterruptedException, IOException
	{
		driver.get("https://ultraviolette.typeform.com/retail");
		Thread.sleep(2000);
			
    	Actions action = new Actions(driver);
       WebElement ContinueOption =driver.findElement(By.xpath("//span[@class='FlexWrapper-sc-__sc-1qu8p4z-1 lnoWON']"));	
       action.click(ContinueOption).build().perform();
		
		WebElement ApplicantName =driver.findElement(By.xpath("//input[@placeholder='Type your answer here...']"));
		ApplicantName.sendKeys("@1234#");
		ApplicantName.clear();
		Thread.sleep(4000);
		ApplicantName.sendKeys("keskjfke");
		ApplicantName.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
				
		WebElement MobileTextField =driver.findElement(By.xpath("//input[@data-qa='phone-number-input']"));
		MobileTextField.sendKeys("6666666666");
		MobileTextField.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		WebElement EmailTextField =driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		EmailTextField.sendKeys("gjwawgdjwbdj@gmail.com");
		EmailTextField.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		
		WebElement Name_Organization =driver.findElement(By.xpath("//input[@placeholder='Type your answer here...']"));
		Name_Organization.sendKeys("Ultraviolette");
		Name_Organization.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		//input[@placeholder='Type your answer here...']
		//input[@class='InputField-sc-__sc-26uh88-0 eTgFJO']
		
		WebElement EducationalTextField =driver.findElement(By.xpath("//span[text()='A']"));
		action.click(EducationalTextField).build().perform();
		
		Thread.sleep(4000);
		
		WebElement state  =driver.findElement(By.xpath("//input[@placeholder='Type or select an option']"));
		Thread.sleep(4000);
		state.sendKeys("Ahmedabad");
		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
////		state.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
//		
		WebElement business_ventures =driver.findElement(By.xpath("//textarea[@placeholder='Type your answer here...']"));
//		Thread.sleep(3000);
//		business_ventures.click();
		business_ventures.sendKeys("Nothing");
		business_ventures.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='D']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='1000 Cr+']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='90-120 days']")).click();
		Thread.sleep(4000);
		
	WebElement pincode  =driver.findElement(By.xpath("//input[@placeholder='Type your answer here...']"));
	Thread.sleep(4000);
	pincode.sendKeys("523105");
	pincode.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	
//	WebElement upload_file =
WebElement fileUpload =driver.findElement(By.xpath("//input[@type='file']"));
action.moveToElement(fileUpload).click().build().perform();
Runtime.getRuntime().exec("C:\\Users\\SRAVANI\\Documents\\Custom Office Templates\\imageupload.exe");
Thread.sleep(5000);
WebElement submit =driver.findElement(By.xpath("//span[text()='Submit']"));
Thread.sleep(3000);
action.moveToElement(submit).click().build().perform();

//	File file = new File("./configure eye.png");
//	System.out.println(file.getAbsolutePath());
//	upload_file.sendKeys(getAbsolutePath());
	
	
	
	
	
	
	
	
	
//    upload_file.sendKeys("C:\\Users\\SRAVANI\\Pictures\\Screenshots\\contact page .png");
//	Thread.sleep(10000);
//	//upload_file.sendKeys("C:\\Users\\SRAVANI\\f77 page.png");
//	
	//action.moveToElement(upload_file).sendKeys("C:\\selenium\\SeleniumBasics\\src\\resources\\Upload files\\Specs_Sheet (59).pdf").build().perform();
	
	
	
	//input[@type='file']
	
	
//	upload_file.sendKeys("C:\\Users\\SRAVANI\\Pictures\\Screenshots\\f77 page.png");
//	Thread.sleep(2000);
//	Robot robot = new Robot();
//	StringSelection file = new StringSelection("C:\\Users\\SRAVANI\\My Application – MainActivity.kt [My_Application.app.main] 2024-01-18 15-57-17.mp4");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	Thread.sleep(2000);
//	robot.keyPress(KeyEvent.VK_V);
//	
//	robot.keyRelease(KeyEvent.VK_V);
//	
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(10000);
	//System.out.println("file uploded successfully by using robot class");
	
//	driver.findElement(By.xpath("//button[@class='ButtonWrapper-sc-__sc-1qu8p4z-0 krINjr']")).click();
//	Thread.sleep(3000);


	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
//	private CharSequence getAbsolutePath() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
