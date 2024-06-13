package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		   
		   driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sridharan");
		   
		   driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Selenium Automation Tester");
		   
    	   driver.findElement(By.xpath("//span[text()='Number Of Employees']/following::input")).sendKeys("10");
		   
		   driver.findElement(By.xpath("//span[text()='Site Name']/following::input")).sendKeys("LeafTaps");
		   
		   driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		   
		  String Title= driver.getTitle();
		  
		  System.out.println(Title);
		  
		  driver.close();

	}

}
