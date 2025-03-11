package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learnxpath {

	public static void main(String[] args) {
		String property = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", property+"\\dri\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
	    //ChromeDriver driver = new ChromeDriver(options);
		
		
		//load the url		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
		 String title = driver.getTitle(); 
		 System.out.println(title);
		 
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
		 driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		 //Enter a Number Of Employees 
		 driver.findElement(By.id("numberEmployees")).sendKeys("1");
		 //Enter a Site Name
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 
		 //click source dropdown
		 WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //instantiate my select class
		 Select sel=new Select(sourcedd);//shortcut for import the class is ctrl+shift+o
		 sel.selectByIndex(4);
		 //click Marketing Campaign 
		 WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dd1=new Select(mark);
		 dd1.selectByVisibleText("Automobile");
		 //click industry DD
		 WebElement industryDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dd2=new Select(industryDD);
		 dd2.selectByValue("OWN_CCORP");
		 driver.close();
		 driver.quit();
		 
		 

	}

}
