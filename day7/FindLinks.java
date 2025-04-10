package week4.day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindLinks {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//no of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//find the size of this list
		int size = allLinks.size();
		System.out.println(size);
		
		//retrieve a particular link
		WebElement name = allLinks.get(2);
		 String text = name.getText();
		System.out.println(text);
		
		List<String> list=new ArrayList<String>();
		
		for (WebElement i : allLinks) {
			
			String text2 = i.getText();
			//System.out.println(text2);
			list.add(text2);
			
			
		}
		System.out.println(list);
		
		
		
		
	}
	}

