package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Xpath 
{
	public static void main(String[] args)
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_tf = driver.findElement(By.xpath("(//textarea)[1]"));
		search_tf.click();
		driver.close();
	}

}
