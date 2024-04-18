package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assinment No. 89=Launch flipkart.com  click on Mobiles using text.
public class Assi_89_MobilesFlipkart 
{
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Mobile = driver.findElement(By.linkText("Mobiles"));
		Mobile.click();
	}

}
