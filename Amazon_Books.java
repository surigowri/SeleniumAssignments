package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Books 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement all_dd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		all_dd.click();
		Select s1=new Select(all_dd);
		s1.selectByVisibleText("Books");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_tf.sendKeys("World");
		WebElement search_button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_button.click();
		WebElement firstbook = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		firstbook.click();
		driver.quit();
		
		
	}

}
