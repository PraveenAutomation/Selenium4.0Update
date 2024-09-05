package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Declation part
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement userName = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		userName.sendKeys("Admin");
		
		WebElement password = mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement loginBtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginBtn.click();
		
		

	}

}
