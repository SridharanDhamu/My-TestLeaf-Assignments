package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		   
		   driver.findElement(By.linkText("Leads")).click();
		   
		   driver.findElement(By.linkText("Create Lead")).click();
		   
		   driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("VG1");
		   
		   driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("SriD");
		   
		   driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("hamu");
		   
		   driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("TLOCAL");
		   
		   driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("IT");
		   
		   driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("To test");
		   
		   WebElement options=  driver.findElement(By.xpath("//span[text()='State/Province']/following::select"));
		 
		 
		   Select value = new Select(options);
		 
		   value.selectByVisibleText("New York");
		   
		   driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		   
		   driver.findElement(By.xpath("//a[text()='Edit']")).click();
		   
		   driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).clear();
		   
		   driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Any test");
		   
		   driver.findElement(By.xpath("//input[@value='Update']")).click();
		   
		   String Title = driver.getTitle();
		  
		   System.out.println(Title);
		   
		   driver.close();

	}

}
