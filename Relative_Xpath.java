package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search_tf = driver.findElement(By.xpath("(//textarea)[1]"));
		search_tf.sendKeys("India  ");
		Thread.sleep(2000);
		WebElement google_search = driver.findElement(By.xpath("(//input)[1]"));
		google_search.click();
		driver.close();
		
	}

}
