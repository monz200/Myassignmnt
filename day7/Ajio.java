package week4.day7;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Search Bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
		//Click Search
		driver.findElement(By.className("ic-search")).click();
		//Choose Men
		driver.findElement(By.xpath("//label[contains(text(), 'Men')]")).click();

		//Choose Fashion Bag
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();


		//Display count
		String count=driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println(count);
		//List of Brands
		List<WebElement>brand=(List<WebElement>) driver.findElements(By.xpath("//div[@class='brand']"));
		
		//Empty list
		List <String> displayBrand=new ArrayList<String>();
		for (WebElement all : brand)
		{
			String disp1=all.getText();
			System.out.println(disp1);
		}
		

	} 

}
