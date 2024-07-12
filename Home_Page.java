package Selenium.Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Home_Page {
	
	public WebDriver driver;
	public Home_Page(WebDriver d)
	{
		driver=d;
	}
   @Test
	public void homepage() throws InterruptedException {

	   driver.get("https://www.ultraviolette.com");
		
	   Thread.sleep(3000);
		WebElement book_your_f77=driver.findElement(By.xpath("//img[@alt='fzzSticky']"));
		book_your_f77.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println("my site title is:  " +title);
		Thread.sleep(3000);
		
		JavascriptExecutor jse01 = (JavascriptExecutor)driver;
    	jse01.executeScript("window.scrollTo(0,900)");
		

			
		
    	
    	//////////////performence section////////////////
		
		driver.findElement(By.xpath("//div[text()='TOP SPEED']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='RANGE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='POWER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='TORQUE']")).click();
		Thread.sleep(3000);
		
		WebElement download=driver.findElement(By.xpath("//a[text()='Download Full Specifications']"));
		
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
	      download.click();
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
		WebElement download_arrow =driver.findElement(By.xpath("//img[@alt='arrow']"));
		
		String parentWindow1 = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow1);
	      download_arrow.click();
	       Thread.sleep(3000);
	       Set<String> childWindow =driver.getWindowHandles();
	       for (String childWindow1 : childWindow) 
	       {
			System.out.println(childWindow1);
			if(!childWindow.equals(parentWindow1))
			{
				driver.switchTo().window(parentWindow1);
			}
		   }
		
	       ////////////smart tech section //////////////////////////////
	       
	       JavascriptExecutor jse02 = (JavascriptExecutor)driver;
	    	jse02.executeScript("window.scrollTo(900,1400)");
	    	 Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//div[text()='Learn more']")).click();
	       Thread.sleep(3000);
	       driver.navigate().back();
	       Thread.sleep(3000);
	       
	       /////////////// locating points /////////////////////
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/div")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[3]/div")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[4]/div")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[5]/div")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div[6]/div")).click();
	       Thread.sleep(3000);
	       
	     
	       
	       
	       
	       Thread.sleep(3000);
	       
	       JavascriptExecutor jse03 = (JavascriptExecutor)driver;
	    	jse03.executeScript("window.scrollTo(0,3000)");
	    	 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[5]/div/div[3]/img")).click();
		Thread.sleep(7000);
		
		
		/////////////////////// 3 personalities section ////////////////////////////////////
		
		JavascriptExecutor jse04 = (JavascriptExecutor)driver;
	    jse04.executeScript("window.scrollTo(3000,3400)");
	    Thread.sleep(3000);
		
	    Actions action = new Actions(driver);	   
	    
		WebElement Airstrike =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[1]/div[1]/img"));
		action.moveToElement(Airstrike).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SHARP & CHARISMATIC']")).click();
		Thread.sleep(3000);
	    
		WebElement Laser=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]/img"));
		action.moveToElement(Laser).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='PASSION & ADRENALINE']")).click();
		Thread.sleep(3000);

		
		WebElement Shadow =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[3]/div[1]/img"));
		
		   action.moveToElement(Shadow).click().build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[text()='COVERT & ENIGMATIC']")).click();
		   Thread.sleep(3000);
		
		/////////////////// battery section ///////////////////
		
		JavascriptExecutor jse05 = (JavascriptExecutor)driver;
	    jse05.executeScript("window.scrollTo(3400,4400)");
	    Thread.sleep(4000);

	
		////////////////// advanced 5 levels of safety///////////////////////
		
		JavascriptExecutor jse06 = (JavascriptExecutor)driver;
	    jse06.executeScript("window.scrollTo(4400,5000)");
	    Thread.sleep(3000);
		
		WebElement first_palybutton =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[1]/div[1]/video"));
		action.moveToElement(first_palybutton).click().build().perform();
		Thread.sleep(5000);
		
		// right button //
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		
		
		WebElement second_palybutton=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[2]/div[1]/video"));
		action.moveToElement(second_palybutton).click().build().perform();
		Thread.sleep(5000);
		
		// right button //
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		
		WebElement third_palybutton=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[3]/div[1]/video"));
		action.moveToElement(third_palybutton).click().build().perform();
		Thread.sleep(5000);
		
		// right button //
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		
		WebElement forth_palybutton=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[4]/div[1]/video"));
		action.moveToElement(forth_palybutton).click().build().perform();
		Thread.sleep(5000);
		//////////// boost standard section /////////////////////////
		
		
		JavascriptExecutor jse07 = (JavascriptExecutor)driver;
	    jse07.executeScript("window.scrollTo(5000,5800)");
	    Thread.sleep(3000);
		
		
		
		////////////////////////////  take charger ///////////////////////////////
		
	    JavascriptExecutor jse08 = (JavascriptExecutor)driver;
	    jse08.executeScript("window.scrollTo(5800,6300)");
	    Thread.sleep(3000);
	    
	    
		// right button //
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		
		WebElement play_button =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[2]/div/div[2]/div[1]/video"));
		action.moveToElement(play_button).click().build().perform();
		Thread.sleep(5000);
		
		 JavascriptExecutor jse09 = (JavascriptExecutor)driver;
		    jse09.executeScript("window.scrollTo(6300,7300)");
		    Thread.sleep(3000);
		
		    
		//////////////////////// smart ride section ///////////////////////////////////
		
		driver.findElement(By.xpath("//div[text()='HILL HOLD']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='PARK ASSIST']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='DYNAMIC REGEN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='DELTA WATCH']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='TRACTION CONTROL']")).click();
		Thread.sleep(3000);
		System.out.println("smart ride section is succefully executed");
//		
//		
		////////////////// lear more button //////////////////////////////
		
		driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		////////////////////// Last details section /////////////////////
		
		
		JavascriptExecutor jse10 = (JavascriptExecutor)driver;
		jse10.executeScript("window.scrollTo(0,7600)");
		Thread.sleep(4000);
		
		////////// single image ///////////////
		
		JavascriptExecutor jse11 = (JavascriptExecutor)driver;
		jse11.executeScript("window.scrollTo(7600,9300)");
		Thread.sleep(4000);
		
		/////////// infinite to 8 years warranty video ////////////////
		
		JavascriptExecutor jse12 = (JavascriptExecutor)driver;
		jse12.executeScript("window.scrollTo(9300,10200)");
		Thread.sleep(6000);
		
		//////////////// savings part /////////////
		
		JavascriptExecutor jse13 = (JavascriptExecutor)driver;
		jse13.executeScript("window.scrollTo(10200,10700)");
		Thread.sleep(4000);
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/button[2]/span")).click();
			Thread.sleep(3000);
		}
		
		for(int j=1;j<=5;j++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[4]/div[2]/div/div/button[2]/span")).click();
			Thread.sleep(3000);
		}
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/div/div[1]/img")).click();
//		Thread.sleep(4000);
//		driver.navigate().back();
		
		/////////// F77 youtube videos ///////////// 
	
		JavascriptExecutor jse014 = (JavascriptExecutor)driver;
		jse014.executeScript("window.scrollTo(10700,12200)");
		Thread.sleep(4000);
//		
		for(int i=1;i<=2;i++)
		{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[17]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		}
		
		for(int j=1;j<=2;j++)
		{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[17]/div[1]/div[2]/div[1]/img")).click();
		Thread.sleep(4000);
		}
		
		JavascriptExecutor jse015 = (JavascriptExecutor)driver;
		jse015.executeScript("window.scrollTo(12500,13200)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[18]/div[3]/div[2]/img")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();

		
		
		
	
		
		

}
}
