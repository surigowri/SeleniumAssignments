package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CSS_AN_AV 
{
	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.cssSelector("#APjFqb"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement tools= driver.findElement(By.cssSelector("[id='hdtb-tls']"));
		tools.click();
		driver.close();
		
	}

}
