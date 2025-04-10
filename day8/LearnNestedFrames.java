package week4.day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		String text = driver.findElement(By.id("content")).getText();
		driver.switchTo().frame(0);
		System.out.println(text);

	}

}
