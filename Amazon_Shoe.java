package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search_tf = driver.findElement(By.xpath("(//input)[5]"));
		search_tf.sendKeys("Shoes for women");
		
		WebElement  shoes = driver.findElement(By.xpath("(//input)[7]"));
		shoes.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
