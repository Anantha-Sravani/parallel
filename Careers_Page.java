package Selenium.Framework;

import java.io.IOException;
import java.security.Key;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Careers_Page {

	public WebDriver driver;
	public Careers_Page(WebDriver d)
	{
		driver=d;
	}
	public void Careers_Method() throws InterruptedException, IOException
	{
	
		driver.get("https://www.ultraviolette.com/careers");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='WORK WITH US']")).click();
		Thread.sleep(3000);
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(2000,0)");
	    Thread.sleep(3000);
	    //// clicking on video ///
	    
	    JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	    jse1.executeScript("window.scrollTo(0,500)");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/img")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	    jse2.executeScript("window.scrollTo(500,1100)");
	    Thread.sleep(3000);
	    
	    for(int i=1;i<=3;i++)
	    {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[2]")).click();
	    Thread.sleep(3000);
	    }
	    
	    for(int j=1;j<=3;j++)
	    {
	    	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[1]")).click();
	 	    Thread.sleep(3000);
	    }
	    
	    JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	    jse3.executeScript("window.scrollTo(1100,1700)");
	    Thread.sleep(3000);
	    
	    for(int k=1;k<=2;k++);
	    {
	    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[2]")).click();
	    	 Thread.sleep(3000);
	    }
	    
	    for(int l=1;l<=2;l++)
	    {
	    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[1]")).click();
	    	 Thread.sleep(3000);
	    }
	    
	    //////////////// search bar ////////////////////
	    
	    WebElement search_bar =driver.findElement(By.xpath("//input[@placeholder='Search ..']"));
	    Actions action = new Actions(driver);
	    search_bar.sendKeys("sravs anantha");
	    //action.sendKeys("sravs").sendKeys(search_bar,Keys.BACK_SPACE).build().perform();
	    action.click(search_bar)
	    	    .keyDown(Keys.CONTROL)
	    	    .sendKeys("a")
	    	    .keyUp(Keys.CONTROL)
	    	    .sendKeys(Keys.BACK_SPACE)
	    	    .build()
	    	    .perform();
//	    search_bar.sendKeys("sravs");
//	    Thread.sleep(3000);
//	    search_bar.clear();
        Thread.sleep(3000);
	    search_bar.sendKeys("Frontend");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='Senior Software Engineer - Frontend']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"career-website-main\"]/career-website-detail/section/div[3]/career-website-detail-template-2/div/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	    jse4.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	    jse5.executeScript("window.scrollTo(1000,2500)");
	    Thread.sleep(3000);
	    
	    /////////////////////////// i am interested button ///////////////
	    
	    driver.findElement(By.xpath("//*[@id=\"career-website-main\"]/career-website-detail/section/div[3]/career-website-detail-template-2/div/div[3]/div/div[2]/div[2]/lyte-button/button")).click();
	    Thread.sleep(4000);
	    WebElement upload_resume =driver.findElement(By.xpath("//a[text()='Upload your resume']"));
	    upload_resume.click();
	    Thread.sleep(3000);
//	    WebElement fileUpload =driver.findElement(By.xpath("//input[@type='file']"));
//	    action.moveToElement(fileUpload).click().build().perform();
	    Runtime.getRuntime().exec("C:\\Users\\SRAVANI\\Documents\\Custom Office Templates\\fileuploadscript.exe");
	    Thread.sleep(5000);
	    Thread.sleep(15000);
	    
	    /////////// name field ///////////////////////
	   WebElement name = driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003151\"]/div/lyte-input/div/input"));
	   Thread.sleep(5000);
	   name.sendKeys("gdkhd");
	    Thread.sleep(3000);
	    
	    ////////////  mobile field ////////////////
	    
	    driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003161\"]/div/div/lyte-input/div/input")).sendKeys("9999999999");
	    Thread.sleep(3000);
	    
	    ///////////// current salary ///////////////
	    driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003199\"]/div/lyte-input/div/input")).sendKeys("50000");
	    Thread.sleep(3000);
	    
        ///////////// expected salary ///////////////
	    
	    driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003197\"]/div/lyte-input/div/input")).sendKeys("75000");
	    Thread.sleep(3000);
	    
	    //////////////  submit application ////////////////////////
	    
	    driver.findElement(By.xpath("//*[@id=\"cw-submit-btn\"]/button")).click();
	    Thread.sleep(3000);
	    
	    //////////// sucess ok button ///////////////
	    
	    driver.findElement(By.xpath("/html/body/lyte-wormhole/lyte-yield/div/div[1]/div/lyte-button/button")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='Job listing']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='View Openings']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"website_block_jobs\"]/career-website-job-layout1/div/div[2]/div/div/lyte-dropdown/div[1]/lyte-drop-button/lyte-icon")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"Lyte_Drop_Item_1\"]")).click();
	    
	    JavascriptExecutor jse7 = (JavascriptExecutor)driver;
	    jse7.executeScript("window.scrollTo(1000,1500)");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='25 more']")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse8 = (JavascriptExecutor)driver;
	    jse8.executeScript("window.scrollTo(1500,2500)");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='15 more']")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse9 = (JavascriptExecutor)driver;
	    jse9.executeScript("window.scrollTo(2500,3000)");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='5 more']")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse10 = (JavascriptExecutor)driver;
	    jse10.executeScript("window.scrollTo(3000,0)");
	    Thread.sleep(3000);
	    
	   WebElement home_feature = driver.findElement(By.xpath("//a[text()='Home']"));
	   String parentWindows = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindows);
	      home_feature.click();
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
	       
	       
	       WebElement careers_feature = driver.findElement(By.xpath("//a[text()='Careers']"));
		   String parentWindows1 = driver.getWindowHandle();
		      System.out.println("parent window id is :" + parentWindows1);
		      careers_feature.click();
	   Thread.sleep(2000);
		      //driver.close();
		       Set<String> childWindowss1 =driver.getWindowHandles();
		       for (String childWindow01 : childWindowss1) 
		       {
				System.out.println(childWindow01);
				if(!childWindow01.equals(parentWindows))
				{
					driver.switchTo().window(parentWindows1);
				}
			   }
	    
	}
}