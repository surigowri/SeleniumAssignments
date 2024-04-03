package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Is_Displayed_Enabled 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(3000);
		WebElement google_search = driver.findElement(By.xpath("//input[@name='btnK']"));
		
		if(google_search.isDisplayed()==true && google_search.isEnabled()==true)
		{
			google_search.click();
		}
       driver.close();		
		
	}

}
