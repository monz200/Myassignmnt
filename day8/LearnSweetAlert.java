package week4.day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://omni.axisbank.co.in/axisretailbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()= ' REGISTER HERE']")).click();
		driver.findElement(By.id("cust_id")).sendKeys("123456788");
		driver.findElement(By.xpath("//span[text()= 'Proceed']")).click();
		//handle the alert
		driver.findElement(By.xpath("//span[text()= 'OK ']")).click();

}

}