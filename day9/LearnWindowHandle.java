package week5.day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnWindowHandle {

	public static void main(String[] args) {
		
    ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get the address of parentwindow
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);//28729E775090C56AB0D0A252C5756A2C
		System.out.println(driver.getTitle());
		//click
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get all the windows
		Set<String> cWindow= driver.getWindowHandles();
		//set into list
		List<String> listWindow=new ArrayList<String>(cWindow);
		//switch to child window
		driver.switchTo().window(listWindow.get(1));
		
		String childWin = driver.getWindowHandle();
		System.out.println(childWin);
		System.out.println(driver.getTitle());
		
		driver.close();//close the current window
		
		driver.switchTo().window(listWindow.get(1));
		
		//driver.quit();//close all the windows
		//No such window exception--->there is no window but trying to access it
		
	}

}
