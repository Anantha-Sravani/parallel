package Selenium.Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.Set;

public class Configure_page {
	public WebDriver driver;
	public Configure_page(WebDriver d)
	{
		driver=d;
	}
	
	@Test
	public void configureMethod() throws InterruptedException
	{
		
		
		//////////////////////////////////////// User At First Time ///////////////////////////////////////////
		
		
		///// stage 1 configure page //
		
		driver.get("https://www.ultraviolette.com/configure");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[3]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/div/div/div")).click();
		Thread.sleep(3000);
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[2]/img")).click();
			Thread.sleep(3000);
		}
//		
//		// compare variants //
//		
		driver.findElement(By.xpath("//div[text()='COMPARE VARIANTS']")).click();
		Thread.sleep(3000);
		
		WebElement download_spec_sheet =driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPEC SHEET']"));
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
	      download_spec_sheet.click();
	       Thread.sleep(5000);
	       Set<String> childWindows =driver.getWindowHandles();
	       for (String childWindow : childWindows) 
	       {
			System.out.println(childWindow);
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(parentWindow);
//			}
//		   }
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[1]/img")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);
//		
//		// stage 2 configure page //
//		
		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();
		Thread.sleep(3000);
		
//		// color  laser section //
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]")).click();
			Thread.sleep(4000);
		}
//	
//		// plasma red //
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
		Thread.sleep(3000);
//		
		Thread.sleep(3000);
		for(int a=1;a<=4;a++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(4000);
		}
////	
////		// Afterburner yellow //
////		
////		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(5000);
		for(int j=1;j<=5;j++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
			Thread.sleep(4000);
//		}
////		
////		// shadow section //
////		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,300)");
		Thread.sleep(3000);
////		
		Actions action = new Actions(driver);
		WebElement shadow =driver.findElement(By.xpath("//div[text()='SHADOW']"));
		action.moveToElement(shadow).click().build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		for(int b=1;b<=4;b++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(4000);
		}
//		
//		//  asteroid grey //
//		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(5000);
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
			Thread.sleep(4000);
		}
//		
//		// cosmic black //
//		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
		Thread.sleep(4000);
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(4000);
		}
//		// Airstrike section //
//		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div/div[2]/img")).click();
		Thread.sleep(5000);
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
			Thread.sleep(4000);
		}
//		
//		// stellar white //
//		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
		Thread.sleep(4000);
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(4000);
		}
////		
////		// lightning blue //
////		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(5000);
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div[1]/img")).click();
			Thread.sleep(4000);
		}
		
		JavascriptExecutor jse01 = (JavascriptExecutor)driver;
		jse01.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		
		JavascriptExecutor jse02 = (JavascriptExecutor)driver;
		jse02.executeScript("window.scrollTo(500,1500)");
		Thread.sleep(3000);
		
		JavascriptExecutor jse03 = (JavascriptExecutor)driver;
		jse03.executeScript("window.scrollTo(1500,2000)");
		Thread.sleep(3000);
		
		JavascriptExecutor jse04 = (JavascriptExecutor)driver;
		jse04.executeScript("window.scrollTo(3000,4000)");
		Thread.sleep(3000);
		
////		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 10000']")).click();
////		Thread.sleep(3000);
////		
////		JavascriptExecutor jse05 = (JavascriptExecutor)driver;
////		jse05.executeScript("window.scrollTo(4000,4500)");
////		Thread.sleep(3000);
////		
////		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 20000']")).click();
////		Thread.sleep(3000);
////		
////		JavascriptExecutor jse06 = (JavascriptExecutor)driver;
////		jse06.executeScript("window.scrollTo(4500,5000)");
////		Thread.sleep(3000);
////		
////		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 26650']")).click();
////		Thread.sleep(3000);
//		
////		JavascriptExecutor jse07 = (JavascriptExecutor)driver;
////		jse07.executeScript("window.scrollTo(5000,5500)");
////		Thread.sleep(3000);
////		
////		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 40000']")).click();
////		Thread.sleep(3000);
//		
//		// Mach 2 Recon upgrades //
//		
		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);
//		
//		////info icon ///
//		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/img")).click();
		Thread.sleep(3000);

////////////////////// close pop up ///////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[6]/div/div[2]/div/div/div[1]/div[2]/img")).click();
		
////		for(int i=1;i<=2;i++)
////		{
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[6]/div/div[2]/div/div/div[1]/div[2]/img")).click();
//		Thread.sleep(3000);		
//		
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
//		Thread.sleep(3000);
//		
//		
//		JavascriptExecutor jse06 = (JavascriptExecutor)driver;
//		jse06.executeScript("window.scrollTo(0,5000)");
//		Thread.sleep(3000);
//		
////		//}
//		//*[@id="__next"]/div/div[2]/div/div[1]/div[6]/div/div[2]/div/div/div[1]/div[2]/img
//		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();
//		Thread.sleep(3000);
//		
//		
//		
//		// mach 2 upgrades//
		
		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();
		Thread.sleep(3000);
//		
		WebElement upgrade1=driver.findElement(By.xpath("//div[text()='Comes with the seamlessly designed & engineered Aero Disc, Tank Grips & Lever Guards.']"));
		action.moveToElement(upgrade1).click().build().perform();
		Thread.sleep(3000);
		
		WebElement upgrade2=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]"));
	    action.moveToElement(upgrade2).click().build().perform();
		Thread.sleep(3000);
		
		WebElement upgrade3=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]"));
		action.moveToElement(upgrade3).click().build().perform();
		Thread.sleep(3000);
		
		WebElement upgrade4 =driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]"));
		action.moveToElement(upgrade4).click().build().perform();
		Thread.sleep(3000);
//		
//		/// Mach 2 Recon ///
//		
		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 10000']")).click();
		Thread.sleep(3000);
////		
		JavascriptExecutor jse05 = (JavascriptExecutor)driver;
		jse05.executeScript("window.scrollTo(4000,4500)");
		Thread.sleep(3000);
////		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 20000']")).click();
		Thread.sleep(3000);
////		
		JavascriptExecutor jse060 = (JavascriptExecutor)driver;
		jse060.executeScript("window.scrollTo(4500,5000)");
		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 26650']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse07 = (JavascriptExecutor)driver;
		jse07.executeScript("window.scrollTo(5000,5500)");
		Thread.sleep(3000);
////		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 40000']")).click();
		Thread.sleep(3000);
		
		///// confirm configuration button ///
		
		JavascriptExecutor jse06 = (JavascriptExecutor)driver;
		jse06.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(4000);
		
		
		/// sign in page ///
		
		driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("abreec51@rproductle.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(3000);
		
		WebElement proceedButton =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		proceedButton.click();
		Thread.sleep(30000);
		
//		WebElement proceedButton1 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
//		Thread.sleep(20000);
//		 proceedButton1.click();
//		 Thread.sleep(30000);
		
		//////// Delivery Details page //////////////
		
		//name text field //
		WebElement name_field = driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']"));
		Thread.sleep(10000);
		action.moveToElement(name_field).click().sendKeys("pinky").build().perform();
		
		///// country drop down ///
		
//		driver.findElement(By.id("country")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//option[text()='Greenland']")).click();
//		Thread.sleep(3000);
//		
		///// pincode field ////
		
		WebElement pincode_field =driver.findElement(By.xpath("//input[@placeholder='PINCODE']"));
		pincode_field.click();
		Thread.sleep(3000);
		pincode_field.sendKeys("23dfgtrg22@##");
		Thread.sleep(3000);
		pincode_field.clear();
		Thread.sleep(3000);
		pincode_field.sendKeys("523108");
		Thread.sleep(3000);
		
		/////// phone number field ///////
		
		WebElement phonenumber_field = driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']"));
		phonenumber_field.click();
		Thread.sleep(3000);
		phonenumber_field.sendKeys("46878379889983");
		Thread.sleep(3000);
		phonenumber_field.clear();
		phonenumber_field.sendKeys("46878379889983#%$$%$");
		Thread.sleep(3000);
		phonenumber_field.clear();
		phonenumber_field.sendKeys("9999999999");
		Thread.sleep(3000);
		
		////// proceed button ///////
		
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();
		
		////// Summary page /////
		Thread.sleep(5000);
		WebElement edit_design =driver.findElement(By.xpath("//button[text()='< EDIT YOUR DESIGN']"));
		Thread.sleep(3000);
		edit_design.click();
		////// changing bike color //////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		
		JavascriptExecutor jse0 = (JavascriptExecutor)driver;
		jse0.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();
		Thread.sleep(3000);
////		
//		
//		
//		// mach 2 upgrades//
//		
		WebElement upgrade01=driver.findElement(By.xpath("//div[text()='Comes with the seamlessly designed & engineered Aero Disc, Tank Grips & Lever Guards.']"));
		action.moveToElement(upgrade01).click().build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(3000);
		
        ////////check box /////////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div[5]/div[1]/input")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		jse6.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(2000);
		
	
		WebElement booking =driver.findElement(By.xpath("//a[text()='Booking agreement']"));
		String parentWindow001 = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow001);
	      booking.click();
	       Thread.sleep(5000);
	       Set<String> childWindows001 =driver.getWindowHandles();
	       for (String childWindow1 : childWindows001) 
	       {
			System.out.println(childWindow1);
			if(!childWindow1.equals(parentWindow001))
			{
				driver.switchTo().window(parentWindow001);
			}
		   }
		Thread.sleep(3000);
		
		
		
		
		WebElement terms =driver.findElement(By.xpath("//a[text()='T&C apply']"));
		
		String parentWindow002 = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow002);
	      terms.click();
	       Thread.sleep(5000);
	       Set<String> childWindows002 =driver.getWindowHandles();
	       for (String childWindow2 : childWindows002) 
	       {
			System.out.println(childWindow2);
			if(!childWindow2.equals(parentWindow002))
			{
				driver.switchTo().window(parentWindow002);
			}
		   }
		Thread.sleep(3000);
		
		//////// check box /////////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div[5]/div[1]/input")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();
		Thread.sleep(5000);
		
		WebElement close_arrow =driver.findElement(By.xpath("//button[text()='Skip']"));
		Thread.sleep(3000);
		close_arrow.click();
		
		////////cancel booking ///////
		
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();
		Thread.sleep(4000);
		
		////// profile ///////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div[2]/img")).click();
		Thread.sleep(4000);
		
		////// signout button /////
		
		driver.findElement(By.xpath("//div[text()='SIGN OUT']")).click();
		Thread.sleep(4000);
		
		
		//////////////////////////////  user after sign out  flow /////////////////////////////////////
		
		
		
		driver.get("https://www.ultraviolette.com/configure");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);
		
		
		JavascriptExecutor jse006 = (JavascriptExecutor)driver;
		jse006.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(2000);
		
		
		/// sign in page ///
		
		driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("sravsanantha1201@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(3000);
		
		WebElement proceedButton0 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		proceedButton0.click();
		Thread.sleep(3000);
		WebElement proceedButton01 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
	
		 proceedButton01.click();
		 Thread.sleep(20000);
		 
		 ///////////////////  profile page ////////////////////////
		 
		 /////////// configure page ////////////
		 
		 WebElement profile_page =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/img"));
		 Thread.sleep(5000);
		 action.moveToElement(profile_page).click().build().perform();
		 Thread.sleep(3000);
		 
		   driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
			Thread.sleep(5000);
			
			
			JavascriptExecutor jse0006 = (JavascriptExecutor)driver;
			jse0006.executeScript("window.scrollTo(0,5000)");
			Thread.sleep(3000);
			
			WebElement confirm_configure =driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']"));
			Thread.sleep(2000);
			confirm_configure.click();
			
			//////////// summary page ////////////////
			
			driver.findElement(By.xpath("//button[text()='< EDIT YOUR DESIGN']")).click();
	    	Thread.sleep(4000);
	    	
	    	/////////////// profile page sign out option //////////////
	    	
	    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div[2]/img")).click();
	    	Thread.sleep(4000);
	    	
	    	driver.findElement(By.xpath("//div[text()='SIGN OUT']")).click();
	    	Thread.sleep(4000);
	    	
			
	    	
	    	////////////////////// paid user flow ////////////
	    	

//			
			driver.get("https://www.ultraviolette.com/configure");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("anantha.sravani@ultraviolette.com");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]/input")).click();
			Thread.sleep(3000);
			
			WebElement proceedButton00 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
			proceedButton00.click();
			Thread.sleep(3000);
			WebElement proceedButton011 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		
			 proceedButton011.click();
			 Thread.sleep(20000);
			 
			 ///////////////// profile page /////////////////////
			 
			    JavascriptExecutor jse062 = (JavascriptExecutor)driver;
				jse062.executeScript("window.scrollTo(0,1000)");
				Thread.sleep(2000);
				
				JavascriptExecutor jse063 = (JavascriptExecutor)driver;
				jse063.executeScript("window.scrollTo(1000,2000)");
				Thread.sleep(2000);
			
	}
	 }

}
}
	}

