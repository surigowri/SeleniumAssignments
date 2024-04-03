package launch_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Chk_Locator 
{
	public static void main(String[] args)
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		WebElement element = driver.findElement(By.tagName("a"));
//		element.click();
		
		List<WebElement> element1 = driver.findElements(By.tagName("a"));
		int count = element1.size();
		System.out.println(count);
		driver.close();
		
		
	}

}
