package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

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
		 //Click on the "Accounts" tab
		 driver.findElement(By.linkText("Accounts")).click();
		 //click on Create Account
		 driver.findElement(By.linkText("Create Account")).click();
		 //Enter an account name
		 driver.findElement(By.id("accountName")).sendKeys("leaftaps");
		 //Enter a description
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); 
		 //click industry drop down
		 WebElement src = driver.findElement(By.name("industryEnumId"));
		 //instantiate my select class
		 Select sel=new Select(src);//shortcut for import the class is ctrl+shift+o
		 sel.selectByIndex(3);
		 //click ownership drop down
		 WebElement src1 = driver.findElement(By.name("ownershipEnumId"));
		 //instantiate my select class
		 Select sel1=new Select(src1);//shortcut for import the class is ctrl+shift+o
		 sel1.selectByVisibleText("S-Corporation");
		 // click on source
		 WebElement src2 = driver.findElement(By.id("dataSourceId"));
		 //instantiate my select class 
		 Select sel2=new Select(src2);//shortcut for import the class is ctrl+shift+o
		 sel2.selectByValue("LEAD_EMPLOYEE");
		//click Marketing Campaign 
		 WebElement mark = driver.findElement(By.name("marketingCampaignId"));
		 Select dd1=new Select(mark);
		 dd1.selectByIndex(6);
		//click  state/province using SelectByValue
		 WebElement mark1 = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select dd2=new Select(mark1);
		 dd2.selectByValue("TX");
		 //Click the "Create Account" button
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.close();

	}

}
