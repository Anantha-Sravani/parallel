package Selenium.Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQ_Page {
	
	public WebDriver driver;
	public FAQ_Page(WebDriver d)
	{
		driver=d;
	}
	public void FAQMethod() throws InterruptedException
	{
	
		driver.get("https://www.ultraviolette.com/faq");
		
		Thread.sleep(2000);
		
//		/// under mach 2 question 1 ///
//		
		WebElement spec_sheet =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[2]/p/a"));
		String parentWindows = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindows);
	      spec_sheet.click();
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
	       
	Thread.sleep(2000);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[2]/p/a[1]")).click();
	Thread.sleep(3000);
	
	WebElement  info_link = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[2]/p/a[2]"));
	String parentWindows1 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows1);
    info_link.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss1 =driver.getWindowHandles();
     for (String childWindow01 : childWindowss1) 
     {
		System.out.println(childWindow01);
		if(!childWindow01.equals(parentWindows1))
		{
			driver.switchTo().window(parentWindows1);
		}
	   }
     
    Thread.sleep(2000);
	
    JavascriptExecutor jse01 = (JavascriptExecutor)driver;
	jse01.executeScript("window.scrollTo(200,400)");
	Thread.sleep(2000);
	
	WebElement configure_page1=driver.findElement(By.xpath("//a[text()='Configure']"));
	String parentWindows01 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows01);
    configure_page1.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss01 =driver.getWindowHandles();
     for (String childWindow001 : childWindowss01) 
     {
		System.out.println(childWindow001);
		if(!childWindow001.equals(parentWindows01))
		{
			driver.switchTo().window(parentWindows01);
		}
	   }
     
    Thread.sleep(2000);
    
    JavascriptExecutor jse02 = (JavascriptExecutor)driver;
	jse02.executeScript("window.scrollTo(400,600)");
	Thread.sleep(2000);
    
	WebElement smartTech_page =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div/div[2]/p/a"));
	String parentWindows02 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows02);
    smartTech_page.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss02 =driver.getWindowHandles();
     for (String childWindow002 : childWindowss02) 
     {
		System.out.println(childWindow002);
		if(!childWindow002.equals(parentWindows02))
		{
			driver.switchTo().window(parentWindows02);
		}
	   }
     
    Thread.sleep(2000);
    
    JavascriptExecutor jse03 = (JavascriptExecutor)driver;
	jse03.executeScript("window.scrollTo(600,800)");
	Thread.sleep(2000);
    
	WebElement again_configure = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[5]/div/div[2]/p/a"));
	String parentWindows03 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows03);
    again_configure.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss03 =driver.getWindowHandles();
     for (String childWindow003 : childWindowss03) 
     {
		System.out.println(childWindow003);
		if(!childWindow003.equals(parentWindows03))
		{
			driver.switchTo().window(parentWindows03);
		}
	   }
     
    Thread.sleep(2000);
	
	
    JavascriptExecutor jse04 = (JavascriptExecutor)driver;
	jse04.executeScript("window.scrollTo(800,1000)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse05 = (JavascriptExecutor)driver;
	jse05.executeScript("window.scrollTo(1000,1200)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse06 = (JavascriptExecutor)driver;
	jse06.executeScript("window.scrollTo(1200,1400)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse07 = (JavascriptExecutor)driver;
	jse07.executeScript("window.scrollTo(1400,1600)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse08 = (JavascriptExecutor)driver;
	jse08.executeScript("window.scrollTo(1600,0)");
	Thread.sleep(2000);
	
	///////////////////////// category product and sub-category general /////////////////
	
	driver.findElement(By.xpath("//h1[text()='Product']")).click();
	
	
	JavascriptExecutor jse004 = (JavascriptExecutor)driver;
	jse004.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse005 = (JavascriptExecutor)driver;
	jse005.executeScript("window.scrollTo(200,400)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse006 = (JavascriptExecutor)driver;
	jse006.executeScript("window.scrollTo(400,700)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse007 = (JavascriptExecutor)driver;
	jse007.executeScript("window.scrollTo(700,1000)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse008 = (JavascriptExecutor)driver;
	jse008.executeScript("window.scrollTo(1000,1300)");
	Thread.sleep(2000);
	
	WebElement terms_conditions = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[7]/div/div[2]/p/a"));
	String parentWindows04 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows04);
    terms_conditions.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss04 =driver.getWindowHandles();
     for (String childWindow004 : childWindowss04) 
     {
		System.out.println(childWindow004);
		if(!childWindow004.equals(parentWindows04))
		{
			driver.switchTo().window(parentWindows04);
		}
	   }
     
    Thread.sleep(2000);
	
    JavascriptExecutor jse009 = (JavascriptExecutor)driver;
	jse009.executeScript("window.scrollTo(1300,1500)");
	Thread.sleep(2000);
	
	WebElement squadron_page =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[9]/div/div[2]/p/a[1]"));
	String parentWindows05 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows05);
    squadron_page.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss05 =driver.getWindowHandles();
     for (String childWindow005 : childWindowss05) 
     {
		System.out.println(childWindow005);
		if(!childWindow005.equals(parentWindows05))
		{
			driver.switchTo().window(parentWindows05);
		}
	   }
     
    Thread.sleep(2000);
    
    
    WebElement episode_1=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 01']"));
    String parentWindows06 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows06);
    episode_1.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss06 =driver.getWindowHandles();
     for (String childWindow006 : childWindowss06) 
     {
		System.out.println(childWindow006);
		if(!childWindow006.equals(parentWindows06))
		{
			driver.switchTo().window(parentWindows06);
		}
	   }
     
    Thread.sleep(2000);
    
    
    WebElement episode_2=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 02']"));
    String parentWindows07 = driver.getWindowHandle();
    System.out.println("parent window id is :" + parentWindows07);
    episode_2.click();
    Thread.sleep(2000);
    //driver.close();
     Set<String> childWindowss07 =driver.getWindowHandles();
     for (String childWindow007 : childWindowss07) 
     {
		System.out.println(childWindow007);
		if(!childWindow007.equals(parentWindows07))
		{
			driver.switchTo().window(parentWindows07);
		}
	   }
     
    Thread.sleep(2000);
    
    JavascriptExecutor jse010 = (JavascriptExecutor)driver;
	jse010.executeScript("window.scrollTo(1500,1800)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse011 = (JavascriptExecutor)driver;
	jse011.executeScript("window.scrollTo(1800,0)");
	Thread.sleep(2000);
    
	
///////////////////////// category product and sub-category Battery /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Battery']")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jse012 = (JavascriptExecutor)driver;
	jse012.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse013 = (JavascriptExecutor)driver;
	jse013.executeScript("window.scrollTo(200,500)");
	Thread.sleep(2000);
	
/////////////////////////// category product and sub-category Range /////////////////


driver.findElement(By.xpath("//h3[text()='Range']")).click();
Thread.sleep(2000);


JavascriptExecutor jse00013 = (JavascriptExecutor)driver;
jse00013.executeScript("window.scrollTo(0,200)");
Thread.sleep(2000);

JavascriptExecutor jse014 = (JavascriptExecutor)driver;
jse014.executeScript("window.scrollTo(200,500)");
Thread.sleep(2000);

///////////////////////// category product and sub-category charging /////////////////
	
driver.findElement(By.xpath("//h3[text()='Charging']")).click();
Thread.sleep(2000);

JavascriptExecutor jse0013 = (JavascriptExecutor)driver;
jse0013.executeScript("window.scrollTo(0,200)");
Thread.sleep(2000);

JavascriptExecutor jse0014 = (JavascriptExecutor)driver;
jse0014.executeScript("window.scrollTo(200,500)");
Thread.sleep(2000);
	
///////////////////////// category product and sub-category warranty /////////////////
	
driver.findElement(By.xpath("//h3[text()='Warranty']")).click();
Thread.sleep(2000);

JavascriptExecutor jse113 = (JavascriptExecutor)driver;
jse113.executeScript("window.scrollTo(0,200)");
Thread.sleep(2000);

 WebElement terms_and_conditions = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/p/a"));
 String parentWindows08 = driver.getWindowHandle();
System.out.println("parent window id is :" + parentWindows08);
terms_and_conditions.click();
Thread.sleep(2000);
//driver.close();
Set<String> childWindowss08 =driver.getWindowHandles();
for (String childWindow008 : childWindowss08) 
{
	System.out.println(childWindow008);
	if(!childWindow008.equals(parentWindows08))
	{
		driver.switchTo().window(parentWindows08);
	}
  }

Thread.sleep(2000);
	
	
///////////////////////// category sales and sub-category test ride /////////////////
	
	driver.findElement(By.xpath("//h1[text()='Sales']")).click();
	Thread.sleep(2000);
	
	WebElement test_ride =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[2]/p/a"));
	String parentWindows09 = driver.getWindowHandle();
	System.out.println("parent window id is :" + parentWindows09);
	test_ride.click();
	Thread.sleep(2000);
	//driver.close();
	Set<String> childWindowss09 =driver.getWindowHandles();
	for (String childWindow009 : childWindowss09) 
	{
		System.out.println(childWindow009);
		if(!childWindow009.equals(parentWindows09))
		{
			driver.switchTo().window(parentWindows09);
		}
	  }
	
	Thread.sleep(2000);
	
	JavascriptExecutor jse114 = (JavascriptExecutor)driver;
	jse114.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
///////////////////////// category sales and sub-category Booking /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Booking']")).click();
	Thread.sleep(2000);
	JavascriptExecutor jse015 = (JavascriptExecutor)driver;
	jse015.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
///////////////////////// category sales and sub-category Finance /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Finance']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/p/a[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/p/a[2]")).click();
	Thread.sleep(3000);
	
///////////////////////// category sales and sub-category Purchase /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Purchase']")).click();
	Thread.sleep(2000);
	JavascriptExecutor jse016 = (JavascriptExecutor)driver;
	jse016.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//h3[text()='Accessories']")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jse017 = (JavascriptExecutor)driver;
	jse017.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
	
	
///////////////////////// category service and sub-category service frequency /////////////////
	
	driver.findElement(By.xpath("//h1[text()='Service']")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jse018 = (JavascriptExecutor)driver;
	jse018.executeScript("window.scrollTo(0,200)");
	Thread.sleep(2000);
//	
/////////////////////////// category service and sub-category Free Service /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Free Service']")).click();
	Thread.sleep(2000);
	
///////////////////////// category service and sub-category Service Scheduling /////////////////
	
	driver.findElement(By.xpath("//h3[text()='Service Scheduling']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/p/a[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/p/a[2]")).click();
	Thread.sleep(3000);
	
///////////////////////// category service and sub-category RSA /////////////////
	
	driver.findElement(By.xpath("//h3[text()='RSA']")).click();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//h3[text()='Home Maintenance']")).click();
	Thread.sleep(3000);
	
    ///////////////////////// category public charging and sub-category supernova /////////////////
	
	driver.findElement(By.xpath("//h1[text()='Public Charging']")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor jse019 = (JavascriptExecutor)driver;
	jse019.executeScript("window.scrollTo(0,300)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse020 = (JavascriptExecutor)driver;
	jse020.executeScript("window.scrollTo(300,600)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse021 = (JavascriptExecutor)driver;
	jse021.executeScript("window.scrollTo(600,900)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[6]/div/div[2]/p/a")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor jse022 = (JavascriptExecutor)driver;
	jse022.executeScript("window.scrollTo(900,1200)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse023 = (JavascriptExecutor)driver;
	jse023.executeScript("window.scrollTo(1200,1500)");
	Thread.sleep(2000);
	
	JavascriptExecutor jse024 = (JavascriptExecutor)driver;
	jse024.executeScript("window.scrollTo(1500,1800)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div/div[2]/p/a[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div/div[2]/p/a[2]")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jse025 = (JavascriptExecutor)driver;
	jse025.executeScript("window.scrollTo(1800,2100)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[15]/div/div[2]/p/a")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor jse026 = (JavascriptExecutor)driver;
	jse026.executeScript("window.scrollTo(2100,2500)");
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 String originalWindow = driver.getWindowHandle();
//     assert driver.getWindowHandles().size() == 1;
//     
//     // Find and click the link that opens a new tab (replace with your link locator)
//     driver.findElement(By.linkText("Open Email Link")).click();
//     
//     // Wait for the new window or tab
//     wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//     
//     // Switch to the new window or tab
//     Set<String> allWindows = driver.getWindowHandles();
//     for (String windowHandle : allWindows) {
//         if (!windowHandle.equals(originalWindow)) {
//             driver.switchTo().window(windowHandle);
//             break;
//         }
//     }
//     
//     // Perform actions on the new tab or window
//     // For example, checking the email content, etc.
//     System.out.println("New Tab Title: " + driver.getTitle());
//     
//     // Close the new tab or window
//     driver.close();
//     
//     // Switch back to the original window
//     driver.switchTo().window(originalWindow);
//	}
	}
}
