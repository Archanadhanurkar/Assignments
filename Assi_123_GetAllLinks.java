package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_123_GetAllLinks {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    int TotalLinks = links.size();
	    System.out.println(TotalLinks);
	    
	    
	}

}
