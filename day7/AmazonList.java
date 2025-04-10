package week4.day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//no of phones
		List<WebElement> mobilePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//empty
		List<Integer> list=new ArrayList<Integer>();
		
		for (WebElement each : mobilePrices) {
			
			String text = each.getText();
			//replace
			String replaceAll = text.replaceAll(",", "");
			//convert the string into an integer
			int mP = Integer.parseInt(replaceAll);
			list.add(mP);
			
		}
		//Sorting a list
		Collections.sort(list);
		System.out.println(list);

	}

}
