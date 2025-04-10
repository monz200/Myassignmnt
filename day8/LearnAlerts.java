package week4.day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnAlerts {

	public static void main(String[] args) {
		/*
		 * no alert present exception
		 * unhandled alert
		 */
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//simpleAlert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//confirmation alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		
		//promptAlerts
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.sendKeys("welcome");
		alert.accept();
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		

	}

}
