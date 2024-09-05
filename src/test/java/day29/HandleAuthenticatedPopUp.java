package day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthenticatedPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// Syntax:
		// http://userName:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		System.out.println(driver.getTitle());

	}

}
