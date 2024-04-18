package Assignments_Selenium;
//Assignment No. 83 - Launch amazon India.Click on Mobiles link using LinkText locator

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_83_LinkTextAmazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		Mobiles.click();
		
	}

}
