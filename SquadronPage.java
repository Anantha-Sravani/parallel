package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SquadronPage {

	public WebDriver driver;
	public SquadronPage(WebDriver d)
	{
		driver=d;
	}
	public void SquadronMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/squadron");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);
		WebElement leaderboardButton =driver.findElement(By.xpath("//button[text()='GO TO LEADERBOARD']"));
		leaderboardButton.click();
		Thread.sleep(4000);
		JavascriptExecutor jsex = (JavascriptExecutor)driver;
		jsex.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);
		
		JavascriptExecutor jsex1 = (JavascriptExecutor)driver;
		jsex.executeScript("window.scrollTo(1000,2000)");
		Thread.sleep(3000);
		JavascriptExecutor jsex2 = (JavascriptExecutor)driver;
		jsex.executeScript("window.scrollTo(2000,0)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='BACK']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollTo(0,2500)");
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/img"));
		
		WebElement drag2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[3]/div/div/div/img"));
		
		WebElement drag3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[4]/div/div/div/img"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drag2 ).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(drag2, drag3).build().perform();
		Thread.sleep(3000);
		WebElement wallpapers =driver.findElement(By.xpath("//span[text()='EXPLORE WALLPAPERS']"));
		wallpapers.click();
		Thread.sleep(4000);
		
		//////////////// wallpaper images selecting //////////////
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[1]/div/img")).click();
		Thread.sleep(3000);
	
		////////////// download option ////////////////
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div/div[2]/div/div/div/div[1]")).click();
		Thread.sleep(3000);
		
		////////////// close arrow /////////////////////
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div/div[2]/div/div/div/div[2]/img")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse01 = (JavascriptExecutor)driver;
		jse01.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(2000);
		JavascriptExecutor jse02 = (JavascriptExecutor)driver;
		jse02.executeScript("window.scrollTo(1500,2500)");
		Thread.sleep(2000);
		JavascriptExecutor jse03 = (JavascriptExecutor)driver;
		jse03.executeScript("window.scrollTo(2500,3500)");
		Thread.sleep(2000);
		JavascriptExecutor jse04 = (JavascriptExecutor)driver;
		jse04.executeScript("window.scrollTo(3500,4500)");
		Thread.sleep(2000);
		JavascriptExecutor jse05 = (JavascriptExecutor)driver;
		jse05.executeScript("window.scrollTo(4500,0)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='BACK']")).click();

		
		
				

	}

}
