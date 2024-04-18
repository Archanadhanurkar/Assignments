package Assignments_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
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
		
		WebElement Searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		Searchfield.sendKeys("headset");
		Searchfield.sendKeys(Keys.ENTER);
		WebElement Headset = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		Headset.click();
		Thread.sleep(4000);
		
		 Set<String> parentchild = driver.getWindowHandles();
		   Iterator<String> i1 = parentchild.iterator();
		   String parent_Win = i1.next();
		   String child_Win = i1.next();
		  // String child_Win1 = i1.next();
		   
		   driver.switchTo().window(child_Win);
		
		WebElement Wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
		Wishlist.click();
		Thread.sleep(4000);

		//WebElement ContinueB = driver.findElement(By.xpath("(//input[@class='a-button-input'])[29]"));
		//ContinueB.click();
		//Thread.sleep(4000);

		WebElement Dropdown = driver.findElement(By.id("wishListDropDown"));
		Dropdown.click();
		
		WebElement ShoppingList = driver.findElement(By.id("atwl-list-privacy-1AZCD7D8AN349"));
		ShoppingList.click();
		//driver.switchTo().window(child_Win1);
		
		WebElement ViewList = driver.findElement(By.linkText("View Your List"));
		ViewList.click();
		
		
	}

}
