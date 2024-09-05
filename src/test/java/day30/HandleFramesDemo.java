package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame-1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1); // Used webselement as frame option
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome FRM1");
		WebElement frameTitle = driver.findElement(By.xpath("//b[normalize-space()='Frame Test Page']"));

		System.out.println(frameTitle.getText());
		
		driver.switchTo().defaultContent();
		
		//Frame-2
		
		WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("Welcome FRM2");
		
		String frametitle2 = driver.findElement(By.xpath("//div[normalize-space()='Frame2']")).getText();
		System.out.println(frametitle2);
		
		driver.switchTo().defaultContent();
		
		//Frame-3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("Java");
		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Frame3']")).getText());
		
		// Inner frame: part of frame-3:
		driver.switchTo().frame(0);
		
		WebElement radioBtn = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", radioBtn);
		
		//driver.findElement(By.xpath("(//div[@class='eBFwI'])[1]")).click();
		
		WebElement checkBox = driver.findElement(By.xpath("(//div[@class='eBFwI'])[1]"));
		js.executeScript("arguments[0].click();", checkBox);
		driver.switchTo().defaultContent();
		
		//Frame-4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.cssSelector("input[name='mytext4']")).sendKeys("Python");
		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Frame4']")).getText());
		driver.switchTo().defaultContent();
		
		//Frame-5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.cssSelector("input[name='mytext5']")).sendKeys("GO-LANG");
		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Frame5']")).getText());
		
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		
		// Inner frame: part of frame-3:
		driver.switchTo().frame(0);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
		

	}

}
