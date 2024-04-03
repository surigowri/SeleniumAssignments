package launch_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TitleIs 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		w1.until(ExpectedConditions.titleIs("Google"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
		driver.close();
		
		
		
	}

}
