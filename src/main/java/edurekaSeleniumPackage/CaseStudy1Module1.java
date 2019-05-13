package edurekaSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1Module1 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "H:/Edureka Installation Guide for Selenium/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// Maximise Window
		driver.manage().window().maximize();

		// Using id
		// driver.findElement(By.id("u_0_j")).sendKeys("Harish");

		// Using name
		// driver.findElement(By.name("lastname")).sendKeys("Ramanathan");

		// Using className
		// driver.findElement(By.className("inputtext")).sendKeys("8870460860");

		// Using linkedText
		// driver.findElement(By.linkText("Forgotten account?")).click();

		// Using partialLiknkText
		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// Using xpath by id
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Harish");

		// Using xpath by name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KR");

		// Using xpath by Class name and AND operator
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")).sendKeys("9876543210");

		//Using CSS
		driver.findElement(By.cssSelector("#email")).sendKeys("gmail");

		Thread.sleep(5000);

		driver.quit();

	}

}
