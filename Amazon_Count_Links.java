package launch_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Count_Links 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count_links = links.size();
		System.out.println(count_links);
		for(int i=0; i<count_links;i++)
		{
		WebElement singlelink = links.get(i);
		String message = singlelink.getAttribute("href");
		System.out.println(message);
		boolean emptymsg = message.isEmpty();
		System.out.println(emptymsg);
		driver.close();
		}
		
	}

}
