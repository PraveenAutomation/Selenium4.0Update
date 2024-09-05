package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement regLink = driver.findElement(By.xpath("//span[normalize-space()='Checkout']"));
		
		Actions act  = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		System.out.println("Title of current Page: "+driver.getTitle());
		
		// Switching to shopping page:
		Set<String> windowID = driver.getWindowHandles();
		
		List<String> ids=new ArrayList<String>(windowID);
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		System.out.println("Title of current Page: "+driver.getTitle());
		
		driver.switchTo().window(ids.get(0));
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Pen");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		System.out.println("Title of current Page: "+driver.getTitle());

	}

}
