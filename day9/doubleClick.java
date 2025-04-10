package week5.day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement doubleClick = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions dC=new Actions(driver);
		
		dC.doubleClick(doubleClick).perform();
	}

}
