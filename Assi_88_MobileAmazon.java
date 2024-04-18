package Assignments_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Assignment No. 88= Launch amazon.in click on Mobiles using text.
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_88_MobileAmazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement Mobile = driver.findElement(By.linkText("Mobiles"));
		Mobile.click();
		
	}

}
