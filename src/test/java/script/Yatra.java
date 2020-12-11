package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		    
		    // to launch url or website
		    
		 driver.get("https://www.goibibo.com/");
	
		    // lines to maximize the chrome tab 
		    
		    driver.manage().window().maximize();
		    
		    // use of ID locator
		    
		  /*  WebElement round_trip=driver.findElement(By.id("roundTrip"));
		    
		    round_trip.click();*/
		    
		    
		    // use of class name locator
		    
		    
                   WebElement icon_text=driver.findElement(By.className("iconText"));
		    
                    icon_text.click();
		    
		    
		    driver.close();
		    
		    
		    
		    
	}

}
