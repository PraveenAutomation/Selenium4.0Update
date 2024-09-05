package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1. Click on specific checkbox:
		
		//driver.findElement(By.cssSelector("#sunday")).click();
		
		// 2. Select All Checkboxes:
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox' ]"));
		
		// For loop:
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// Enhanced For loop:
		
		/*for( WebElement checkbox: checkboxes)
		{
			checkbox.click();
		}*/
		
		// 3. Want to select last 3 checkboxes:
		 /* Formula:
		  * 1. Total no. of checkboxex - how may we want to select = starting index
		  * 2. 7-3=4 (Starting index)
		  */
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		// 4. Want to select first 3 checkboxes:
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		// 4. Unselect checkboxes if they are already selected:
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		for(int i=0;i<checkboxes.size();i++ )
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}

	}

}
