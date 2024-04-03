package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Books 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement all_dd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		all_dd.click();
		Actions a1 = new Actions(driver);
		a1.moveToElement(all_dd).perform();
        a1.click();
//		WebElement books = driver.findElement(By.xpath(""));
//		books.click();
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_tf.sendKeys("World");
		WebElement search_button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_button.click();
		WebElement firstbook = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		firstbook.click();
		driver.close();
		
		
	}

}
