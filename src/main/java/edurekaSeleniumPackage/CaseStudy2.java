package edurekaSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "H:/Edureka Installation Guide for Selenium/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");

		// Page Load time of 20 Seconds
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// Maximise the window
		driver.manage().window().maximize();

		// Implicit Wait time of 20 Seconds for all actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter the data to be searched
		driver.findElement(By.xpath("//input[@class='search_inp collapse giTrackElementHeader']")).sendKeys("Selenium");

		// Perform Search on WebPage
		driver.findElement(By.xpath("//span[@class='typeahead__button']")).click();
		
		
		
		

	}

}
