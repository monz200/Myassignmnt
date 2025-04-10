package week5.day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//scroll down
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		//instantiate Action class
		Actions sD=new Actions(driver);
		sD.scrollToElement(scroll).perform();
		String text = scroll.getText();
		System.out.println(text);

	}

}
