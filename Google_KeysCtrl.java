package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_KeysCtrl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search_tf = driver.findElement(By.xpath("(//textarea)"));
		search_tf.sendKeys("India");
		search_tf.sendKeys(Keys.ARROW_DOWN);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		search_tf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
