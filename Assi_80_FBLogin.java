package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment No. 80 - Launch an empty browser, Navigate to “facebook.com”, Enter user name, Enter password, Click on Login button
public class Assi_80_FBLogin {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
    WebElement UserName = driver.findElement(By.id("email"));
    UserName.sendKeys("arch.dhanurkar@gmail.com");
    Thread.sleep(2000);
    WebElement Password = driver.findElement(By.id("pass"));
    Password.sendKeys("Pass@123");
    Thread.sleep(2000);
    WebElement LoginButton = driver.findElement(By.name("login"));
    LoginButton.click();

}
}