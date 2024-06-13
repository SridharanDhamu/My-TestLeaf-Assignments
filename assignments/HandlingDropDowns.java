package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {
	
	public static void main(String[] args) {
		
		
		    ChromeOptions chromeOptions = new ChromeOptions();
		   
		    chromeOptions.addArguments("--disable-notifications");
		   
		    ChromeDriver driver = new ChromeDriver(chromeOptions);
		   
		    driver.get("http://leaftaps.com/opentaps/"); //Demosalesmanager / crmsfa
		   
		    driver.manage().window().maximize();
		   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		   
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		   
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		   
		    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		   
		    driver.findElement(By.linkText("CRM/SFA")).click();
		   
		    driver.findElement(By.linkText("Accounts")).click();
		   
		    driver.findElement(By.linkText("Create Account")).click();
		    
		    String AccountName="SriDHMUd";
		   
		    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(AccountName);
		   
		    driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Selenium Automation Tester");
		   
		    WebElement select=	driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		    
		    Select options =new Select(select);
		    
		    options.selectByValue("IND_SOFTWARE");
		    
		    WebElement select1=	driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		    
		    Select options1 =new Select(select1);
		    
		    options1.selectByVisibleText("S-Corporation");
		    
		    
		    WebElement select2 = driver.findElement(By.id("dataSourceId"));
		  
		    Select option2 =new Select(select2);
		  
		    option2.selectByValue("LEAD_EMPLOYEE");
		    
		    WebElement select3 = driver.findElement(By.id("marketingCampaignId"));

		    Select option3 =new Select(select3);
		    
		    option3.selectByIndex(6);

		    WebElement select4 = driver.findElement(By.id("generalStateProvinceGeoId"));

		    Select option4 =new Select(select4);
		    
		    option4.selectByValue("TX");
		    
			driver.findElement(By.xpath("//input[@value='Create Account']")).click();
			
			String Text=driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
			
			System.out.println(Text);
			
			
				driver.close();
		
		    
			
		    
		    


	}

}
