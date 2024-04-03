package launch_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoSuggestion
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = auto.size();
		System.out.println(count);
		driver.close();
		
		
	}

}
