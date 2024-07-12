package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SmartTech {
	
	public WebDriver driver;
	public SmartTech(WebDriver d)
	{
		driver=d;
	}
@Test
	
public void smartmethod() throws InterruptedException
{
	driver.get("https://www.ultraviolette.com/smarttech");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,400)");
	Thread.sleep(3000);
	
	///// A.I video /////
	
	JavascriptExecutor jse01 = (JavascriptExecutor)driver;
	jse01.executeScript("window.scrollTo(400,1100)");
	Thread.sleep(3000);
	

	// mute button//

	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button/img")).click();
	Thread.sleep(0,5000);
	

	JavascriptExecutor jse02 = (JavascriptExecutor)driver;
	jse02.executeScript("window.scrollTo(1100,1500)");
	
	Thread.sleep(3000);
	
    ///// violette on the mach2 /////
	
	JavascriptExecutor jse03 = (JavascriptExecutor)driver;
	jse03.executeScript("window.scrollTo(1500,2400)");
	Thread.sleep(3000);
	
	//// Towing alert ////////
	
	driver.findElement(By.xpath("//h1[text()='Towing Alert']")).click();
	Thread.sleep(3000);

	////////// Movement & fall alert //////////
	
	driver.findElement(By.xpath("//h1[text()='Movement & Fall Alert']")).click();
	Thread.sleep(3000);
	
	//////// 3 ride modes section //////////
	
	JavascriptExecutor jse04 = (JavascriptExecutor)driver;
	jse04.executeScript("window.scrollTo(2400,3500)");
	Thread.sleep(3000);
	
	//////////////////// 10 levels of regenerative braking ///////////////
	
	JavascriptExecutor jse05 = (JavascriptExecutor)driver;
	jse05.executeScript("window.scrollTo(3500,4200)");
	Thread.sleep(3000);
	
	/////////////D.S.C dynamic stability control section ////////////
	
	JavascriptExecutor jse06 = (JavascriptExecutor)driver;
	jse06.executeScript("window.scrollTo(4200,5000)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[2]/div/div/div/img")).click();
	Thread.sleep(5000);
	
	
	////////////////// slider section //////////////////
	
	JavascriptExecutor jse07 = (JavascriptExecutor)driver;
	jse07.executeScript("window.scrollTo(5000,5800)");
	Thread.sleep(3000);
	
	Actions action = new Actions(driver);
	
	
	WebElement traction =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[1]/div/video"));
	
	WebElement anti_collision=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[2]/div/video"));
	action.dragAndDrop(traction, anti_collision).build().perform();
	Thread.sleep(3000);
	
	WebElement hill_hold =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[1]/div/video"));
	action.dragAndDrop(anti_collision,hill_hold).build().perform();
	Thread.sleep(3000);
	action.dragAndDrop(hill_hold,traction).build().perform();
	Thread.sleep(3000);
	
	JavascriptExecutor jse08 = (JavascriptExecutor)driver;
	jse08.executeScript("window.scrollTo(5800,6500)");
	Thread.sleep(3000);
	
	/////  remote safety /////////
	
	JavascriptExecutor jse09 = (JavascriptExecutor)driver;
	jse09.executeScript("window.scrollTo(6500,6900)");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/img")).click();
	Thread.sleep(6000);
	
	JavascriptExecutor jse10 = (JavascriptExecutor)driver;
	jse10.executeScript("window.scrollTo(6900,8100)");
	Thread.sleep(3000);
	
	////////// Being Connected Always Section ////////////
	
	
	/////// ride analytics ///////////
	
	driver.findElement(By.xpath("//h1[text()='Ride Analytics']")).click();
	Thread.sleep(3000);
	
	////// vehicle diagnostics /////
	
	driver.findElement(By.xpath("//h1[text()='Vehicle Diagnostics']")).click();
	Thread.sleep(3000);
	
	////// charge limit ////////
	
	driver.findElement(By.xpath("//h1[text()='Charge Limit']")).click();
	Thread.sleep(3000);
	
	///////////// FindMy F77 ////////////
	
	driver.findElement(By.xpath("//h1[text()='FindMyF77']")).click();
	Thread.sleep(3000);
	
	//////////// controls in your palm //////
	
	driver.findElement(By.xpath("//h1[text()='Controls In Your Palm']")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor jse11 = (JavascriptExecutor)driver;
	jse11.executeScript("window.scrollTo(8100,8800)");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[11]/div[1]/div/button/img")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//h1[text()='TAP TO SEE DETAILS']")).click();
	Thread.sleep(3000);
	
	/////// glide button ///////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();
	Thread.sleep(3000);
	
	//////////// Balistic button //////////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();
	Thread.sleep(3000);
	
	//////////// combat button //////////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();
	Thread.sleep(3000);
	
	//////// day mode //////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();
	Thread.sleep(3000);
	
	////////// night mode ///////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[1]")).click();
	Thread.sleep(3000);
	
    ////////day mode //////
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();
	Thread.sleep(3000);
	
	
    /////// glide button ///////
	
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();
    Thread.sleep(3000);
      
    ////////////Balistic button //////////
	
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();
   Thread.sleep(3000);

   //////////// combat button //////////

   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();
   Thread.sleep(3000);
   
   
   ////// locating points //////
   

   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[1]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[2]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[3]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[4]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[5]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[6]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[7]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[8]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[9]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[10]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[11]/div")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[12]/div")).click();
   Thread.sleep(3000);
   
   ///////// close button /////
   
   driver.findElement(By.xpath("//h1[text()='Close']")).click();
   Thread.sleep(3000);
   
   //////// Park Assist   ///////
   
   JavascriptExecutor jse12 = (JavascriptExecutor)driver;
   jse12.executeScript("window.scrollTo(9000,9500)");
   Thread.sleep(5000);
	
	////////// are u step into the future /////////
	
   JavascriptExecutor jse13 = (JavascriptExecutor)driver;
   jse13.executeScript("window.scrollTo(9500,10500)");
   Thread.sleep(3000);
   
   //////// Book your F77 Button ///////
   
   WebElement configure_button =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[14]/div[4]/a/img"));
   action.moveToElement(configure_button).click().build().perform();
   Thread.sleep(4000);
   
   driver.navigate().back();
   
}


}
