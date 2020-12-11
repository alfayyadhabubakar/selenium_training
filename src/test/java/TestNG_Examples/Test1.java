package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AlFayyadh\\eclipse-workspace\\webdriver\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String getPageSource = driver.getPageSource();
        
        System.out.println("This is Page Title: " + title + "\n");
        System.out.println("This is current URL: " + currentUrl + "\n");
        System.out.println("This is Page Source: " + getPageSource);
        
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        
        
        username.sendKeys("example@gmail.com");
        Thread.sleep(3000);
        password.sendKeys("password");
        Thread.sleep(3000);
        login.click();
        
        Thread.sleep(5000);
        
        
        driver.close();

	}

}
