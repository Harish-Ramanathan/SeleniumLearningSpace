package edurekaSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {

		// Initialize Driver and open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka Installation Guide for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// To maximize the browser window
		driver.manage().window().maximize();

		// Xpath, still element should be unique
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("harishkr232@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Harish");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");

		// Used and operator also OR operator there
		driver.findElement(By.xpath("//*[@autocomplete='new-password' and @name='reg_passwd__']"))
				.sendKeys("Harish!123");

		// Using CSS , inspect right click on it, copy selector
		driver.findElement(By.cssSelector("input#u_0_a")).click();

		// adding wait time but concept is more to learn will be covered later
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// To close all the active window the browser else use close function
		driver.quit();
	}
}
