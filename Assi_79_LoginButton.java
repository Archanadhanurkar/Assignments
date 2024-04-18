package Assignments_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Assignment No. 79 = Launch an empty browser, Navigate to “amazon.in” login page, Enter user name > click on continue, Enter password > click on continue, Click on Login button

public class Assi_79_LoginButton {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.id("ap_email"));
		Email.sendKeys("nmghate@gmail.com");
		Thread.sleep(2000);
	    WebElement continue_button = driver.findElement(By.id("continue"));
	    continue_button.click();
	    WebElement Pass = driver.findElement(By.id("ap_password"));
		Pass.sendKeys("1234");
		Thread.sleep(2000);
		WebElement SignIn_button = driver.findElement(By.id("signInSubmit"));
		SignIn_button.click();
		
		   TakesScreenshot Tksr = driver;
		   File source = Tksr.getScreenshotAs(OutputType.FILE);
		   File destination = new File("C:\\Users\\Lenovo\\SoftwareTestingMKT\\Selenium\\ScreenShots\\LoginFail.png");
		   FileHandler.copy(source, destination);
		   
	    
	}

}
