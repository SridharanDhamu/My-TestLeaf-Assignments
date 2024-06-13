package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		
		String output="No records to display";
		
		ChromeOptions chromeOptions = new ChromeOptions();
		   
	    chromeOptions.addArguments("--disable-notifications");
	   
	    ChromeDriver driver = new ChromeDriver(chromeOptions);
	   
	    driver.get("http://leaftaps.com/opentaps"); 
	   
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	    
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		   
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		   
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		   
		driver.findElement(By.linkText("CRM/SFA")).click();
		   
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10349");
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("99");
		
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	
    	String Id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
   	
    	System.out.println(Id);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[4]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Id);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	    String Result =	driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		System.out.println(Result);
	    
	    if(Result.equals(output)) {
	    	
	    	driver.close();
	    	
	    }else {
	    	System.out.println("Record Present");
	    }
	    
	    
		
	}

}
