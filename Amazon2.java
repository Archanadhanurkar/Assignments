package Assignments_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		SignIn.click();
		WebElement MobNo = driver.findElement(By.id("ap_email"));
		MobNo.sendKeys("8888273746");
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("123456");
		WebElement SignSubmit = driver.findElement(By.id("signInSubmit"));
		SignSubmit.click();
		
		WebElement UpdateAdd = driver.findElement(By.id("glow-ingress-line2"));
		UpdateAdd.click();
		Thread.sleep(4000);
		WebElement Address = driver.findElement(By.xpath("//a[@role='navigation']"));
		Address.click();
		Thread.sleep(5000);
		
		WebElement PlusAdd = driver.findElement(By.id("ya-myab-plus-address-icon"));
		PlusAdd.click();
		Thread.sleep(5000);
		
		WebElement FullName = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		FullName.sendKeys("Archana Vijay Dhanurkar");
		
		WebElement MobileNo = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		MobileNo.sendKeys("8888273746");
		
		WebElement HouseNo = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		HouseNo.sendKeys("489, Shrikrupa");
	
		WebElement Area = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		Area.sendKeys("Anand Nagar, Karegaon Road");
	
		WebElement LandMark = driver.findElement(By.id("address-ui-widgets-landmark"));
		LandMark.sendKeys("Mahadev Temple");
		Thread.sleep(5000);
		WebElement Add = driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]"));
		Add.click();
	
		
	}

}
