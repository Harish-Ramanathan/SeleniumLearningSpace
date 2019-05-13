package edurekaSeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocators {

	public static void main(String[] args) {

		// Initialize Driver and open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka Installation Guide for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// To maximize the browser window
		driver.manage().window().maximize();

		// Locator using Id\
		// driver.findElement(By.id("u_0_n")).sendKeys("Harish");
		// driver.findElement(By.id("u_0_p")).sendKeys("KR");

		// using Name
		// driver.findElement(By.name("email")).sendKeys("harishkr232@gmail.com");
		// driver.findElement(By.name("firstname")).sendKeys("Harish");

		// using Classs Name
		//driver.findElement(By.className("inputtext")).sendKeys("harishkr232@gmail.com");

		//using partial link text
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//To close the browser
		//driver.quit();

	}
}
