package week4.day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrames {

	public static void main(String[] args) {
		
		//creating the ChromeDriver object to launch the browser and inspect the web elements.
				ChromeDriver driver = new ChromeDriver();
				//to open the given url in chrome browser
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				//to maximise the browser window
				driver.manage().window().maximize();
				//to wait till 10 seconds of every operation
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//driver.findElement(By.id("accept-choices")).click();
				//to switch the driver focus to the frame
				driver.switchTo().frame("iframeResult");
				//to click on the 'Try it' button
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				//to select OK in the alert box
				driver.switchTo().alert().accept();
				//to verify the text that displayed
				System.out.println(driver.findElement(By.id("demo")).getText());
				//to close the browser
				driver.quit();

	}

}
