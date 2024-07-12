package Selenium.Framework;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossTesting {
	
	WebDriver driver;
	ChromeOptions options = new ChromeOptions();
	EdgeOptions edgeoptions = new EdgeOptions();
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	@Parameters("browser")
	@BeforeTest
	public void initialize(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		System.out.println("chrome browser is lauched");
		
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("edge browser is lauched");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("firefox browser is lauched");
		}
	}
	@Test
	public void ultraviolette() throws InterruptedException, IOException
	{
		driver.get("https://www.ultraviolette.com/limited");
		driver.manage().window().maximize();
		String actual =driver.getTitle();
		String expected = "Ultraviolette Limited Edition Electric Vehicles | Ultraviolette F77 Space Edition";
		//Assert.assertEquals(actual.contains("Ultraviolette Limited Edition Electric Vehicles | Ultraviolette F77 Space Edition"),expected.contains("Ultraviolette Limited Edition Electric Vehicles | Ultraviolette F77 Space Edition"));
		WebElement Download=driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPECIFICATION']"));
		 Download.click();
		 Thread.sleep(2000);
		WebElement mobileField = driver.findElement(By.id("phone-text"));
		mobileField.sendKeys("28387484895");
		 Thread.sleep(2000);
		System.out.println("11 digit mobile number should not accept");
		mobileField.clear();
		mobileField.sendKeys("6305961502");
		
		WebElement NotifyButton =driver.findElement(By.xpath("//button[text()='Notify']"));
		NotifyButton.click();
		System.out.println("Thank you message should occur");
		Thread.sleep(2000);
		
		
		driver.get("https://www.ultraviolette.com/f99");
		
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath("//div[@class='f99_accessText__cbgG6']"));
		String parentWindow = driver.getWindowHandle();
	      System.out.println("parent window id is :" + parentWindow);
//	      Thread.sleep(3000);
	      element.click();
//	  
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
		Thread.sleep(2000);
//		WebElement NameTextfield =driver.findElement(By.xpath("//input[@placeholder='FULL NAME']"));
		Actions action = new Actions(driver);
//		NameTextfield.sendKeys("Pinky122345");
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='FULL NAME']"));
		action.moveToElement(name).click().sendKeys("sravani").perform();
		
		WebElement country = driver.findElement(By.xpath("//div[text()='COUNTRY']"));
		action.moveToElement(country).click().sendKeys("AFGHANISTAN").sendKeys(Keys.ENTER).perform();
		WebElement StateOption =driver.findElement(By.xpath("//div[text()='STATE']"));
		action.moveToElement(StateOption).click().sendKeys("Ghazni").sendKeys(Keys.ENTER).perform();
		WebElement pincode =driver.findElement(By.id("enteredPincode"));
		pincode.sendKeys("123456");
		WebElement phone =driver.findElement(By.id("phone-text"));
		phone.sendKeys("7123456789");
		 WebElement email = driver.findElement(By.id("enteredEmailId"));
		 email.sendKeys("sravs123@gmail.com");
		 WebElement nextButton =driver.findElement(By.xpath("//div[text()='NEXT']"));
		 nextButton.click();
		 Thread.sleep(2000);
		 
		 driver.get("https://www.ultraviolette.com/testride");
			Thread.sleep(2000);
			
			WebElement firstnameTextField =driver.findElement(By.id("enteredFirstName"));
			Thread.sleep(2000);
			firstnameTextField.sendKeys("Sravani");
			Thread.sleep(2000);
			
			WebElement LastNameTextField =driver.findElement(By.id("enteredLastName"));
			LastNameTextField.sendKeys("Anantha");
			Thread.sleep(2000);
			
			WebElement MobileTextFeild =driver.findElement(By.xpath("//input[@id='phone-text']"));
			MobileTextFeild.sendKeys("6305961502");
			Thread.sleep(2000);
			
			 WebElement EmailTextFeild =driver.findElement(By.id("enteredEmailId"));
			 EmailTextFeild.sendKeys("sravsanantha7@gmail.com");
			 Thread.sleep(4000);
//			 JavascriptExecutor jse = (JavascriptExecutor)driver;
//			WebElement selectAll = driver.findElement(By.xpath("//div[@class='px-7 md:px-20 pb-20']"));
//			selectAll.click();
//			jse.executeScript("window.scrollTo(0,2000)");
			 Thread.sleep(7000);
			 Actions act = new Actions(driver);
			WebElement city=driver.findElement(By.xpath("//div[@class='h-14 sm:h-16 dropdown_Selector css-c8n4pz-control']"));
			city.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='BENGALURU']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='Button_button__Stqur paymentBtn ']")).click();
			Thread.sleep(2000);
		 
			driver.get("https://www.ultraviolette.com/enquiry");
		//	
				//Actions action = new Actions(driver);
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
				NameTextfield.sendKeys("Donkey122345");
				NameTextfield.clear();
				
			    Thread.sleep(2000);
			    NameTextfield.sendKeys("Donkey");
			    Thread.sleep(2000);

				WebElement countryFeild =driver.findElement(By.xpath("//div[text()='COUNTRY']"));
			//countryFeild.click();
//				Thread.sleep(3000);
				action.moveToElement(countryFeild).click().sendKeys("INDIA").build().perform();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[text()='INDIA']")).click();
				
			
				 Thread.sleep(2000);
				WebElement stateFeild =driver.findElement(By.xpath("//div[text()='STATE']"));
//				countryFeild.click();
//				Thread.sleep(2000);
				action.moveToElement(stateFeild).click().sendKeys("Andhra Pradesh").sendKeys(Keys.ENTER).perform();
				Thread.sleep(2000);
				
				WebElement Pincode=driver.findElement(By.id("enteredPincode"));
//				Thread.sleep(2000);
				Pincode.sendKeys("52310");
				Thread.sleep(2000);
//				Pincode.clear();
//				Pincode.sendKeys("523105");
				//WebElement mobileNumber =driver.findElement(By.xpath("//input[@placeholder='+91 PHONE NUMBER']"));
				WebElement mobileNumber =driver.findElement(By.id("phone-text"));
				mobileNumber.sendKeys("630596150");
			Thread.sleep(2000);
//				mobileNumber.clear();
//				mobileNumber.sendKeys("765438904");
				WebElement EmailFeild =driver.findElement(By.id("enteredEmailId"));
				EmailFeild.sendKeys("Sravsanantha7@gmail.com");
				Thread.sleep(2000);
//				
				WebElement nextButton1 =driver.findElement(By.xpath("//div[text()='NEXT']"));
				nextButton1.click();
				System.out.println("Thank you message should be display");
				Thread.sleep(2000);
				
				
				driver.get("https://www.ultraviolette.com/legal");
				WebElement LegalFeature =driver.findElement(By.xpath("//a[text()='Legal']"));
				LegalFeature.click();
				
				WebElement PolicyOption =driver.findElement(By.xpath("//div[text()='PRIVACY POLICY']"));
				PolicyOption.click();
//				  Thread.sleep(3000);
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(2000);
				
				
				
				WebElement TermsOption =driver.findElement(By.xpath("//div[text()='TERMS OF USE']"));
				//TermsOption.click();
//			    Thread.sleep(4000);
				String parentWindow1 = driver.getWindowHandle();
			      System.out.println("parent window id is :" + parentWindow1);
//			      Thread.sleep(3000);
			      TermsOption.click();
			       Thread.sleep(3000);
			       Set<String> childWindows1 =driver.getWindowHandles();
			       for (String childWindow : childWindows1) 
			       {
					System.out.println(childWindow);
					if(!childWindow.equals(parentWindow1))
					{
						driver.switchTo().window(parentWindow1);
					}
				   }
				
				
				
		//	
				Thread.sleep(2000);
//				
				WebElement SaleTermOption =driver.findElement(By.xpath("//div[text()='SALE TERMS AND CONDITIONS']"));
//			Thread.sleep(4000);
					String parentWindows = driver.getWindowHandle();
				      System.out.println("parent window id is :" + parentWindows);
			      SaleTermOption.click();
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
//				
//				
				Thread.sleep(2000);
				
				WebElement BookingOption =driver.findElement(By.xpath("//div[text()='BOOKING AGREEMENT']"));
//				Thread.sleep(4000);
				String parentWindow2 = driver.getWindowHandle();
			      System.out.println("parent window id is :" + parentWindow2);
			      BookingOption.click();
//			  	
			       Thread.sleep(3000);
			       Set<String> childWindows2 =driver.getWindowHandles();
			       for (String childWindow01 : childWindows2) 
			       {
					System.out.println(childWindow01);
					if(!childWindow01.equals(parentWindow2))
					{
						driver.switchTo().window(parentWindow2);
					}
				   }
			       
			       
			       driver.get("https://ultraviolette.typeform.com/retail");
					Thread.sleep(2000);
						
			       WebElement ContinueOption =driver.findElement(By.xpath("//span[@class='FlexWrapper-sc-__sc-1qu8p4z-1 lnoWON']"));	
			       action.click(ContinueOption).build().perform();
					
					WebElement ApplicantName =driver.findElement(By.xpath("//input[@placeholder='Type your answer here...']"));
//					ApplicantName.sendKeys("Sravani@1234#");
//					ApplicantName.clear();
				   Thread.sleep(4000);
					action.moveToElement(ApplicantName).sendKeys("Sravani").sendKeys(Keys.ENTER).build().perform();
					//ApplicantName.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
					
							
					WebElement MobileTextField =driver.findElement(By.xpath("//input[@data-qa='phone-number-input']"));
					MobileTextField.sendKeys("6305961502");
					MobileTextField.sendKeys(Keys.ENTER);
					Thread.sleep(4000);
					
					WebElement EmailTextField =driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
					EmailTextField.sendKeys("sravsanantha7@gmail.com");
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
					
//					driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
////					state.sendKeys(Keys.ENTER);
				Thread.sleep(4000);
//					
					WebElement business_ventures =driver.findElement(By.xpath("//textarea[@placeholder='Type your answer here...']"));
//					Thread.sleep(3000);
//					business_ventures.click();
					business_ventures.sendKeys("Nothing");
					business_ventures.sendKeys(Keys.ENTER);
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//span[text()='D']")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//div[text()='1000 Cr+']")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//div[text()='90-120 days']")).click();
					Thread.sleep(4000);
					
				WebElement pincode1  =driver.findElement(By.xpath("//input[@placeholder='Type your answer here...']"));
				Thread.sleep(4000);
				pincode1.sendKeys("523105");
				pincode1.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				
				
//				WebElement upload_file =
			WebElement fileUpload =driver.findElement(By.xpath("//input[@type='file']"));
			action.moveToElement(fileUpload).click().build().perform();
			Runtime.getRuntime().exec("C:\\Users\\SRAVANI\\Documents\\Custom Office Templates\\fileupload.exe");
			Thread.sleep(5000);
			WebElement submit =driver.findElement(By.xpath("//span[text()='Submit']"));
			Thread.sleep(3000);
			action.moveToElement(submit).click().build().perform();
			Thread.sleep(2000);
			
			
			
			driver.get("https://www.ultraviolette.com/faq");
			driver.manage().window().maximize();
//			WebElement PlusIcon=driver.findElement(By.xpath("//img[@alt='Add']"));
//			PlusIcon.click();
//	        
			WebElement PlusIcon01 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon01.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon02 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon02.click();
			Thread.sleep(2000);

			WebElement PlusIcon03 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon03.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon04 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon04.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon05 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon05.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon06 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[6]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon06.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon07 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[7]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon07.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon08 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon08.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon09 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[9]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon09.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon10 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[10]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon10.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon11 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[11]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon11.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon12 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[12]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon12.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon13 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[13]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon13.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon14 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[14]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon14.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon15 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[15]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon15.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon16 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[16]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon16.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon17 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[17]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon17.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon18 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[18]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon18.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon19 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[19]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon19.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon20 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[20]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon20.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon21 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[21]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon21.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon22 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[22]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon22.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon23 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[23]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon23.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon24 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[24]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon24.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon25 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[25]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon25.click();
			Thread.sleep(2000);
			
			WebElement PlusIcon26 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[26]/div/div[2]/div[1]/img"));
			Thread.sleep(2000);
			PlusIcon26.click();
			Thread.sleep(2000);
			
			
			
			driver.get("https://www.ultraviolette.com/squadron");
			WebElement leaderboardButton =driver.findElement(By.xpath("//button[text()='GO TO LEADERBOARD']"));
			leaderboardButton.click();
			Thread.sleep(4000);
			JavascriptExecutor jsex = (JavascriptExecutor)driver;
			jsex.executeScript("window.scrollTo(0,1000)");
			Thread.sleep(2000);
			jsex.executeScript("window.scrollTo(1000,2000)");
			Thread.sleep(2000);
			jsex.executeScript("window.scrollTo(2000,500)");
			Thread.sleep(4000);
			//Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
//			driver.get("https://www.ultraviolette.com/squadron");
//			Thread.sleep(4000);
			jsex.executeScript("window.scrollTo(0,3000)");
			WebElement wallpapers =driver.findElement(By.xpath("//span[text()='EXPLORE WALLPAPERS']"));
			wallpapers.click();
			Thread.sleep(4000);
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,1500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollTo(1500,2500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollTo(2500,3500)");
			driver.navigate().back();
			
			
			
			driver.get("https://www.ultraviolette.com/press");
			WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
			subscribeOption.click();
			WebElement EmailTextField1 =driver.findElement(By.id("enteredEmailId"));
			EmailTextField1.sendKeys("Sravsantha7");
			EmailTextField1.clear();
			Thread.sleep(5000);
			EmailTextField1.sendKeys("sravsanantha@gmail.com");
			
			Thread.sleep(2000);
			WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
			subscribe.click();
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(800,0)");
			Thread.sleep(2000);
			WebElement veiw =driver.findElement(By.xpath("//button[@class='Button_button__Stqur pt-2 pb-[7px] pl-8 pr-8 ']"));
			veiw.click();
			Thread.sleep(2000);
			
			WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
			String parentWindow01 = driver.getWindowHandle();
			System.out.println("parent window id is :" + parentWindow01);
//		      Thread.sleep(3000);
			subscribeTo.click();
//		  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//			jse.executeAsyncScript("window.scrollTo(2000,4000)");
//			jse.executeAsyncScript("window.scrollTo(4000,8000)");
//		jse.executeAsyncScript("window.scrollTo(8000,0)");
		       Thread.sleep(3000);
		       Set<String> childWindows01 =driver.getWindowHandles();
		       for (String childWindow : childWindows01) 
		       {
				System.out.println(childWindow);
				if(!childWindow.equals(parentWindow01))
				{
					driver.switchTo().window(parentWindow01);
				}
			   }
			
			
		
		
			Thread.sleep(4000);
			
			
			driver.get("https://www.ultraviolette.com/contact");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
			Thread.sleep(2000);
			Thread.sleep(5000);
			//driver.close();
			driver.get("https://www.ultraviolette.com/contact");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='careers@ultraviolette.com']")).click();
			Thread.sleep(2000);
			Thread.sleep(5000);
			//driver.close();
			
			
			WebElement hanger =driver.findElement(By.xpath("//img[@alt='Ultraviolette Hangar']"));
			String parentWindow02 = driver.getWindowHandle();
		      System.out.println("parent window id is :" + parentWindow02);
//		      Thread.sleep(3000);
		      hanger.click();
//		  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//			jse.executeAsyncScript("window.scrollTo(2000,4000)");
//			jse.executeAsyncScript("window.scrollTo(4000,8000)");
//		jse.executeAsyncScript("window.scrollTo(8000,0)");
		       Thread.sleep(3000);
		       Set<String> childWindows02 =driver.getWindowHandles();
		       for (String childWindow : childWindows02) 
		       {
				System.out.println(childWindow);
				if(!childWindow.equals(parentWindow02))
				{
					driver.switchTo().window(parentWindow02);
				}
			   }
			
			Thread.sleep(5000);
			
		 
	}
//	@AfterTest
//	public void endMethod()
//	{
//		driver.quit();
//		
//	}


}
