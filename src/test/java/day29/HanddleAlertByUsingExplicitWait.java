package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HanddleAlertByUsingExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Alert myalert = myWait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
