package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel {
	public WebDriver driver;
    @Test(priority = 2)
    public void FirefoxTest() {	 
        //Initializing the firefox driver (Gecko)
    driver = new FirefoxDriver();	  
    driver.get("https://www.ultraviolette.com/"); 
//    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
//    driver.quit();
     }

    @Test(priority = 1)
	public void ChromeTest()
	{ 
  //Initialize the chrome driver
  driver = new ChromeDriver();
  driver.get("https://www.ultraviolette.com/"); 
//  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
//  driver.quit();
	}
}


