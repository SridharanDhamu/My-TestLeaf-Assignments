package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		   
		   driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("VG");
		   
		   driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Sri");
		   
		   driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("Dhamu");
		   
		   driver.findElement(By.xpath("//span[text()='Title']/following::input")).sendKeys("TL");
		   
		   driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		   
		   String title=driver.getTitle();
		   
		   System.out.println(title);
		   
		   driver.close();

	}

}
