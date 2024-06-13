package selenium.assignments;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGround {
	

	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		   
		  ChromeDriver driver = new ChromeDriver();
		   
		   driver.get("https://leafground.com/button.xhtml");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		   
		   driver.findElement(By.xpath("(//h5[text()='Click and Confirm title.']/following::span[@class='ui-button-text ui-c'])[1]")).click();
		   
		   String Title= driver.getTitle();
		   
		   System.out.println(Title);
		   
		   driver.navigate().back();
		   
		   boolean result =  driver.findElement(By.xpath("(//h5[text()='Confirm if the button is disabled.']/following::span[@class='ui-button-text ui-c'])[1]")).isEnabled();

		   System.out.println(result);
		   
		   WebElement position=   driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']/following::span"));
		   
		   System.out.println(position.getLocation());
		   
		   WebElement element=   driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
		   
		   String colour = element.getCssValue("color");
		   
		   System.out.println(colour);
		   
		   Dimension Size =driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize();
		   
		  int Height= Size.getHeight();
		  
		  int Width= Size.getWidth();
		  
		  System.out.println("The height of the button is "+Height+" the Width of the Button is "+Width);
		  
		  Actions actions = new Actions(driver);
		  
		  WebElement target = driver.findElement(By.xpath("(//h5[text()='Mouse over and confirm the color changed']/following::span[@class='ui-button-text ui-c'])[1]"));
		  
		  Thread.sleep(3000);
		  actions.moveToElement(target).perform();
		  
		  String mouserhovercolor=target.getCssValue("color");
		  
		  System.out.println(mouserhovercolor);
		  
		  driver.close();
	}
	

	
}
