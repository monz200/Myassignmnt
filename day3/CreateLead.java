package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		 //click on create lead
		 driver.findElement(By.partialLinkText("Create")).click();
		 //enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 //enter the firstName
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		 //enter the lastName
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 // Enter a Title 
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("mrs");
		 //click the "Create Lead" button
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.close();

	}

}
