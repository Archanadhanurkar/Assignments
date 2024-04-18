package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment No. 82-Launch google.com.Click on Gmail link using LinkText locator
public class Assi_82_LinkTextGoogle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement Gmail = driver.findElement(By.linkText("Gmail"));
		Thread.sleep(2000);
		Gmail.click();
	}

}
