package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment No. 81 -Launch an empty browser, Navigate to “grotechminds.com” 
//registration page, Enter email, password, present address, permanent address and pin code.
public class Assi_81_GrotechMindsReg {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("archanadhanurkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.name("Present-Address")).sendKeys("Wakad,Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Permanent-Address")).sendKeys("Wakad,Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Pincode")).sendKeys("411033");

	}

}
