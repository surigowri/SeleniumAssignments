package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_Relative 
{

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_tf.sendKeys("Shoes");
		
		WebElement search_button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_button.click();
		
		WebElement  firstshoe = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[1]"));
		firstshoe.click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
