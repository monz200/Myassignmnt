package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		String property = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", property+"\\dri\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
	
		 
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM")).click();
		 //click on leads
		 driver.findElement(By.linkText("Leads")).click();
		 //Click "Find leads"
		 driver.findElement(By.linkText("Find Leads")).click();
		 //Click on the "Phone" tab
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]")).click();
		 driver.findElement(By.name("phoneNumber")).sendKeys("9444371228");
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     
	     List<WebElement> records = driver.findElements(By.xpath("//td/div/a[@class='linktext']"));
			if(records.size()>0)
			{
				String leadId = records.get(0).getText();
				records.get(0).click();
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				String msg = driver.findElement(By.className("x-paging-info")).getText();
				System.out.println(msg);			
			}
	}

}
