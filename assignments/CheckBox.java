package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions chromeOptions = new ChromeOptions();
		   
		    chromeOptions.addArguments("--disable-notifications");
		   
		    ChromeDriver driver = new ChromeDriver(chromeOptions);
		   
		    driver.get("https://leafground.com/checkbox.xhtml"); 
		   
		    driver.manage().window().maximize();
		   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		    
		    driver.findElement(By.xpath("(//span[@class='ui-chkbox-label']/preceding::div[contains(@class,'ui-chkbox-box ui-widget')])[1]")).click();
		    
		    driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		    
		   String Value = driver.findElement(By.className("ui-growl-title")).getText();
		   
		   System.out.println(Value);
		   
		   driver.findElement(By.xpath("//label[text()='Java']")).click();
		   
		   driver.findElement(By.xpath("//label[text()='Python']")).click();
		   
		   //driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		   
		  //String Statevalue= driver.findElement(By.xpath("//div[@class='ui-growl-item']//p")).getText();
		  
		  String Statevalue= driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		
		  System.out.println(Statevalue);
		  
		  driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();

		  Thread.sleep(3000);
		  
		  String Statevalue1= driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
			
		  System.out.println(Statevalue1);
		  
		  driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']//div)[2]")).click();
		  
		  String Value1 = driver.findElement(By.className("ui-growl-title")).getText();
		   
		   System.out.println(Value1);
		   
		   WebElement checkBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]"));
		   
		   boolean result=checkBox.isEnabled();
		   
		   System.out.println(result);
		   
		   if(result == true) {
			   
			   System.out.println("The check box is disabled");
			   
			   driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
			   
			   driver.findElement(By.xpath("(//label[text()='Miami'])[2]/preceding::div[1]")).click();
			   
			   driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]/preceding::div[1]")).click();
			   
			   driver.close();
			   
		   }else {
			   System.out.println("The check box is enabled");
		   }
		   
		   
		   
	}

}
