package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.leafground.com/radio.xhtml");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

		   driver.findElement(By.xpath("//span[contains(@class,'ui-radiobutton-icon ui-icon')]/following::label[@for='j_idt87:console1:0']")).click();
		   
		   WebElement unselect= driver.findElement(By.xpath("//span[contains(@class,'ui-radiobutton-icon ui-icon')]/following::label[@for='j_idt87:city2:0']"));
		   
		   unselect.click();
		   
		   
		  unselect.click();
		  
		  Thread.sleep(3000);
		  boolean isenabled=unselect.isSelected();
		  
		  System.out.println("The checkbox in not enabled "+isenabled);
		  
		  WebElement element = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]"));
		   
		  System.out.println(element.isDisplayed());
		  
		  WebElement isdisplayed =  driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]"));
		 
		  boolean res = isdisplayed.isDisplayed();
		
		  System.out.println(res);
		  
		  if(res==true) {
			  System.out.println("Age Group is already Selected");
			  
			  driver.close();
		  }
		   
	}

}
