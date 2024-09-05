package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// Min side Slider:
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		Point pLocation = min_slider.getLocation();// (59, 250)
		System.out.println("Default location : "+pLocation);
		act.dragAndDropBy(min_slider, 100,250).perform();
		System.out.println("Min_slider location after movement : "+min_slider.getLocation());
		
		// Max side Slider:
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		Point pmLocation = max_slider.getLocation();
		System.out.println("Default location : "+pmLocation);//  (612, 250)
		act.dragAndDropBy(max_slider, -100,250).perform();//(612, 250)
		System.out.println("max_slider location after movement : "+max_slider.getLocation());
		
		
		
	}

}
