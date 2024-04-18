package Assignments_Selenium;
//Assignment No. 90=1.Launch amazon.in2.Type shoes on text area, click on  search button3. Select first shoe from the list using relative xpath using class name locator

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_90_AmazonShoeFirst 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement search	=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoe");
	Thread.sleep(2000);
	List<WebElement> autosuggestion=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count=	autosuggestion.size();
	System.out.println(count);
	Thread.sleep(2000);
	autosuggestion.get(count-10).click();
		
	}

}
