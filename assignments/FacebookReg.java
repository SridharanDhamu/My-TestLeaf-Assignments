package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {
	
	public static void main(String[] args) {

		    ChromeOptions chromeOptions = new ChromeOptions();
		   
		    chromeOptions.addArguments("--disable-notifications");
		   
		    ChromeDriver driver = new ChromeDriver(chromeOptions);
		   
		    driver.get("https://en-gb.facebook.com/"); 
		   
		    driver.manage().window().maximize();
		   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		    
		    driver.findElement(By.xpath("//a[contains (text(),'Create new account')]")).click();
		    
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		    
		    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Account");
		    
		    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9990998870");
		    
		    driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Sri@123$");

		    WebElement day = driver.findElement(By.name("birthday_day"));
		    
		    Select options = new Select(day);
		    
		    options.selectByValue("2");
		    
		    WebElement month = driver.findElement(By.name("birthday_month"));
		    
		    Select options1 = new Select(month);
		    
		    options1.selectByValue("3");
		    
		    WebElement year = driver.findElement(By.name("birthday_year"));
		    
		    Select options2 = new Select(year);
		    
		    options2.selectByValue("1999");
		    
		    driver.findElement(By.xpath("//label[text()='Male']")).click();
		    
		    

	}

}
