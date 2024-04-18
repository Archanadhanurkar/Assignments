package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment No.86 - 1.Launch amazon.in .2.Type shoes on text area, click on  search button. 3.Select first shoe from the list using relative xpath
public class Assi_86_ShoeAmazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement TextField = driver.findElement(By.id("twotabsearchtextbox"));
		TextField.click();
		TextField.sendKeys("Shoe");
		
		
	}

}
