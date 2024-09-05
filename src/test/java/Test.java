import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String title = driver.getTitle();
		System.out.println("Page Title is : "+title);
		
		//driver.close();
		driver.quit();

	}

}
