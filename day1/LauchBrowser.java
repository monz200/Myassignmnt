package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) {
		//Launch the Browser
		
		ChromeDriver dri=new ChromeDriver();
				
				//EdgeDriver driver1=new EdgeDriver();
				
				//load the url
				
				dri.get("https://www.facebook.com/");
				
				//maximize
				
				dri.manage().window().maximize();
				
				dri.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				WebElement pwrd = dri.findElement(By.id("pass"));
				pwrd.sendKeys("Tuna@321");
				//click on login button
				dri.findElement(By.name("login")).click();
				//click on the link
				dri.findElement(By.linkText("Find your account and log in.")).click();
				
				//get the the title
				 String title = dri.getTitle(); 
				 System.out.println(title);

	}

}
