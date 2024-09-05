package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		// Normal Alert:
		/*
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert myalert = driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		// Confirmation ALert:
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
		
		Alert myAlert1 = driver.switchTo().alert();
		System.out.println(myAlert1.getText());
		//myAlert1.accept();
		myAlert1.dismiss();
		*/
		
		// Prompt ALert: Input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(5000);
		
		Alert myAlert2 = driver.switchTo().alert();
		System.out.println(myAlert2.getText());
		myAlert2.sendKeys("Welcome");
		myAlert2.accept();
		//myAlert1.dismiss();
		

	}

}
