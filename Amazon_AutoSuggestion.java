package launch_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("Shoes for women");
		Thread.sleep(2000);
		List<WebElement> auto =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = auto.size();
		System.out.println(count);
		driver.close();
		
		
	}

}
