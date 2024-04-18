package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment No. 84- Launch amazon India. Click on Customer Service link using LinkText locator
public class Assi_84_Amazon_LinkText {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    WebElement Customer_Service = driver.findElement(By.linkText("Customer Service"));
	    Customer_Service.click();
	

}
}