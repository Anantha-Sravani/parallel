package Selenium.Framework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ultraviolette.com/smarttech");
        driver.manage().window().maximize();

        List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        for (WebElement hyperlink : hyperlinks) {
            String url = hyperlink.getAttribute("href");

            try {
                URL actualUrl = new URL(url);

                // Skip URLs with "tel" protocol
                if (actualUrl.getProtocol().equalsIgnoreCase("tel")) {
                    System.out.println(url + " is a telephone link.");
                    continue;
                }

                HttpURLConnection connection = (HttpURLConnection) actualUrl.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }
                connection.disconnect();
            } catch (MalformedURLException e) {
                System.out.println(url + " is a malformed URL");
            } catch (IOException e) {
                System.out.println("Error connecting to: " + url);
            }
        }
    }

}
