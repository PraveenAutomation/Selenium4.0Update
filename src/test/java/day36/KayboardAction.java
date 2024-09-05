package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayboardAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		
		Actions act = new Actions(driver);
		
		// ctrl+A - select the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		// ctrl+C - copy the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB - shift to 2nd box:
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// ctrl+V - paste the text:
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		System.out.println(driver.getTitle());
		

	}

}
