package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//In Selenium 4.X
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://orangehrm.com/");

	}

}
