package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxes {

	public static void main(String[] args) {
		String property = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", property+"\\dri\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//load the url		
		driver.get("https://leafground.com/checkbox.xhtml");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div/div[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div/div[2]")).click();
		
		driver.findElement(By.xpath("//label[text()='Java']/parent::td/div/div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Python']/parent::td/div/div[2]")).click();
		
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div[2]")).click();
		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		String txtDisabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::div/div[2]")).getAttribute("class");
		if(txtDisabled.contains("ui-state-disabled"))
			System.out.println("Disabled checkbox is disabled.");
		else
			System.out.println("Disabled checkbox is enabled.");
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li[@data-item-value='London']/div/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li[@data-item-value='Paris']/div/div[2]")).click();
		
		driver.close();
	}

}
